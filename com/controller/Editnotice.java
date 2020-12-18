package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.model.BLmanager;
import com.pojo.Classdetail;
import com.pojo.Notice;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class Editnotice
 */
@WebServlet("/Editnotice")
public class Editnotice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLmanager bLmanager = new BLmanager();
	Notice n1 = new Notice();
	Classdetail s = new Classdetail();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Editnotice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id1 = request.getParameter("noticeId");

		Notice n1 = bLmanager.searchbyid(Integer.valueOf((id1)));
		System.out.println(n1);

		// bLmanager.edit(n1);
		HttpSession session = request.getSession();
		session.setAttribute("ed", n1);
		response.sendRedirect("edit.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		
		
		
		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bLmanager.searchByLoginId(Email);
		System.out.println("eid " + eid);


		
		
		
		
		String name = request.getParameter("className");
		String noticDesc = request.getParameter("noticeDescription");
		String ndate = request.getParameter("noticeDate");
		String id = request.getParameter("id");
		System.out.println("ID--" + id);

		System.out.println(name);
		System.out.println(noticDesc);
		System.out.println(ndate);

		n1.setNoticeDescription(noticDesc);

		n1.setNoticeDate(Date.valueOf(ndate));
		n1.setNoticeId(Integer.parseInt(id));

		s = bLmanager.serclassname(name);
		n1.setTeacherdetail(eid);
		n1.setClassdetail(s);
		bLmanager.updateNote(n1);

		List<Notice> l = bLmanager.searchData();
	//	HttpSession session = request.getSession();
		session.setAttribute("classList", l);
		String msg="Record Has Been Updated";
		session.setAttribute("MsgSub",msg);
		response.sendRedirect("UpdateNotice.jsp");
	}

}
