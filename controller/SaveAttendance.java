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
import com.pojo.Subject;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class SaveAttendance
 */
@WebServlet("/SaveAttendance")
public class SaveAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager = new BLmanager();
	Classdetail classdetail = new Classdetail();
	Subject subject = new Subject();
	Attendance attendance = new Attendance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		
		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bLmanager.searchByLoginId(Email);
		System.out.println("eid " + eid);

		
		
		

		int i = 1;
		ServletContext context = getServletContext();
		String clsname = (String) context.getAttribute("class");
		while (request.getParameter("Status[" + i + "]") != null) {
			String attndclass = request.getParameter("attendanceclass");

			classdetail = bLmanager.searchAttndByclass(clsname);
			System.out.println(clsname);
			attendance.setClassdetail(classdetail);

			// class
			System.out.println("Hi");

			// date,type
			String attnddate = request.getParameter("attendancedate");

			attendance.setAttndDate(Date.valueOf(attnddate));
			String attndsub = request.getParameter("attendancesubjectname");
			System.out.println(attndsub);
			String attndtype = request.getParameter("attendancetype");
			// subject
			System.out.println(attndtype);
			subject = bLmanager.searchByAttndBysubject(attndsub);
			attendance.setSubject(subject);
			attendance.setAttndType(attndtype);
			attendance.setTeacherdetail(eid);
			System.out.println(attndtype);
			// studentname save
			attendance.setStudentdetail(bLmanager.searchbyEnroll(request.getParameter("enroll[" + i + "]")));

			// status
			String att = request.getParameter("attendanceStatus");
			attendance.setAttndStaus(request.getParameter("Status[" + i + "]"));
			System.out.println(att);
			bLmanager.saveAttendance(attendance);
			i++;
		}
		System.out.println("Hi");

		 response.sendRedirect("Addattendance.jsp");

	}

}
