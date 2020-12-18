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

import com.model.BLmanager;
import com.pojo.Classdetail;
import com.pojo.Notice;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class Noticeserv
 */
@WebServlet("/Noticeserv")
public class Noticeserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Notice n1=new Notice();
       BLmanager bl=new BLmanager();
       Classdetail s=new Classdetail();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Noticeserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bl.searchByLoginId(Email);
		System.out.println("eid " + eid);

		String name = request.getParameter("className");
	//	String noticDesc = request.getParameter("noticeDescription");
		String ndate = request.getParameter("noticeDate");
		Date dt=Date.valueOf(ndate);
	

		

		s = bl.serclassname(name);
		
		List<Notice> list = bl.searchData1(s, dt);
        String msg="Record has been Updated";
		// HttpSession session = request.getSession();
		session.setAttribute("list", list);
		//session.setAttribute("MsgSub",msg);
		response.sendRedirect("UpdateNotice.jsp");
	}

}
