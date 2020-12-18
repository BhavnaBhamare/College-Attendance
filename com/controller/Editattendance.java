package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Attendance;

/**
 * Servlet implementation class Editattendance
 */
@WebServlet("/Editattendance")
public class Editattendance extends HttpServlet {
	BLmanager bLmanager=new BLmanager();
	Attendance attendance=new Attendance();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editattendance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String id=request.getParameter("attendanceid");
		int attid=Integer.parseInt(id);
		attendance=bLmanager.searchByAttndId(attid);
		System.out.println(attendance);
		HttpSession session=request.getSession();
		session.setAttribute("att", attendance);
		response.sendRedirect("EditAttendance.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
