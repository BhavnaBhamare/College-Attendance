package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Attendance;
import com.pojo.Classdetail;
import com.pojo.Studentdetail;
import com.pojo.Subject;

/**
 * Servlet implementation class UpdateAttendance
 */
@WebServlet("/UpdateAttendance")
public class UpdateAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager=new BLmanager();
	Attendance attendance=new  Attendance();
	Studentdetail studentdetail=new Studentdetail();
       Classdetail classdetail=new Classdetail();
       Subject subject=new Subject();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAttendance() {
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
		String attid=request.getParameter("id");
		int aid=Integer.parseInt(attid);
		
		String status1=request.getParameter("Status");
		ServletContext context=getServletContext();
		//String clsname=(String)context.getAttribute("class");
		String clsname=request.getParameter("attendancecls");
		classdetail=bLmanager.searchAttndByclass(clsname);
		// attendance.setClassdetail(classdetail);
		String attnddate=request.getParameter("attendancedate");
		 attendance.setAttndDate(Date.valueOf(attnddate));
		String attndsub=request.getParameter("attendancesubjectname");
		subject=bLmanager.searchByAttndBysubject(attndsub);
		//attendance.setSubject(subject);
		System.out.println(attndsub);
		String attndtype=request.getParameter("attendancetype");
		attendance.setAttndType(attndtype);
		//subject
		
			
			 
			
	
	 attendance.setStudentdetail(bLmanager.searchbyEnroll(request.getParameter("enroll")));
	 
	 attendance.setClassdetail(classdetail);
	 attendance.setSubject(subject);
		attendance.setAttndId(aid);
		attendance.setAttndStaus(status1);
		bLmanager.updateattendance(attendance);
		/*String s1="Record Has been Updated";
		HttpSession session=request.getSession();
		session.setAttribute("MsgSub", s1);*/
		response.sendRedirect("viewAttendance.jsp");
		
	}

}
