package com.controller;

import java.io.IOException;
import java.sql.Date;

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
 * Servlet implementation class Deletenotice
 */
@WebServlet("/Deletenotice")
public class Deletenotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager = new BLmanager();
	Notice n1 = new Notice();
	Classdetail s = new Classdetail();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletenotice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bLmanager.searchByLoginId(Email);
		System.out.println("eid " + eid);


		
		
		
		
		
		String id = request.getParameter("noticeId");
	int id1=Integer.parseInt(id);
	Notice n1 = bLmanager.searchbyid(id1);
		bLmanager.deleteNote(n1);
		response.sendRedirect("NoticeDelete.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

}
	}
