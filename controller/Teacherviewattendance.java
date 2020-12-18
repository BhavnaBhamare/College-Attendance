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
import com.pojo.Attendance;
import com.pojo.Classdetail;
import com.pojo.Subject;

/**
 * Servlet implementation class Teacherviewattendance
 */
@WebServlet("/Teacherviewattendance")
public class Teacherviewattendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BLmanager bLmanager=new BLmanager();
       Attendance attendance=new Attendance();
       Subject subject=new Subject();
       Classdetail classdetail=new Classdetail();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacherviewattendance() {
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
		String dt=request.getParameter("attendancedate");
		 Date date = java.sql.Date.valueOf(dt);
		String type=request.getParameter("attendancetype");
		String sub=request.getParameter("attendancesubject");
		subject=bLmanager.searchByAttndBysubject(sub);
		String cls=request.getParameter("attendanceclass");
		classdetail=bLmanager.searchByAttnd(cls);
		String status=request.getParameter("attendancestatus");
		
		List<Attendance> list=bLmanager.searchByAttendance(date,type,subject,classdetail,status);
		HttpSession session=request.getSession();
		session.setAttribute("att", list);
		response.sendRedirect("viewAttendance.jsp");
	}

}
