package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import com.model.BLmanager;
import com.pojo.Classdetail;
import com.pojo.Studentdetail;
import com.pojo.Subject;
import com.pojo.Teacherdetail;
import com.pojo.Timetable;

/**
 * Servlet implementation class AddTimeTable
 */
@WebServlet("/AddTimeTable")
public class AddTimeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager = new BLmanager();
	Teacherdetail teacherdetail = new Teacherdetail();
	Classdetail classdetail = new Classdetail();
	Subject subject = new Subject();
	Studentdetail studentdetail = new Studentdetail();
	Timetable timetable = new Timetable();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddTimeTable() {
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

		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bLmanager.searchByLoginId(Email);
		System.out.println("eid " + eid);

		response.setContentType("text/html");
		// PrintWriter pw = response.getWriter();
		String timeday = request.getParameter("timeTableDay");
		String timedate = request.getParameter("timeTableDate");
		Date dt=Date.valueOf(timedate);
		String timetabletime=request.getParameter("timeTableTime");
		
		
		   
		//Part timetabletime1 = request.getPart("timeTableTime");
		
		String subname = request.getParameter("timetablesubjectname");
		String classname = request.getParameter("timetableclass");

		timetable.setTimeTableDay(timeday);

		subject = bLmanager.searchByTimeTableSubName(subname);
		classdetail = bLmanager.searchByTimeClassName(classname);
		//System.out.println(timetabletime);

	

		//timetable.setTimeTableTime(currentTimestamp);
       
		timetable.setSubject(subject);
		timetable.setClassdetail(classdetail);
		timetable.setTimeTableDate(dt);
		timetable.setTeacherdetail(eid);
		bLmanager.saveTimetable(timetable);
		response.sendRedirect("timetable.jsp");

	}

}
