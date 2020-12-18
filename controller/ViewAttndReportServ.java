package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

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
import com.pojo.Division;
import com.pojo.Studentdetail;
import com.pojo.Subject;

/**
 * Servlet implementation class ViewAttndReportServ
 */
@WebServlet("/ViewAttndReportServ")
public class ViewAttndReportServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BLmanager bLmanager=new BLmanager();
       Subject subject=new Subject();
       Classdetail classdetail=new Classdetail();
       Attendance attendance=new Attendance();
       Division division=new Division();
       Studentdetail studentdetail=new Studentdetail();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAttndReportServ() {
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
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String date=request.getParameter("attendancedate");
		Date dt=Date.valueOf(date);
		Calendar cal=Calendar.getInstance();
		cal.setTime(dt);
		//int Month=cal.get(Calendar.)
		//System.out.println("MOnth is"+Month);
		
		String subName=request.getParameter("attendancesubject");
		String className=request.getParameter("attendanceclass");
		String attndType=request.getParameter("attendancetype");
		String attnddiv=request.getParameter("attnddiv");
		division = bLmanager.searchByDivision(attnddiv);
		String status="present";
		String statusAb="Absent";
		subject=bLmanager.searchByAttndBysubject(subName);
	    
		classdetail=bLmanager.searchByAttnd(className);
		//long present=bLmanager.countPresent(dt,attndType,status);
		List<Attendance> l=bLmanager.countsProj(dt,subject,classdetail,attndType,status,division);
		List<Attendance> l1=bLmanager.countsProj1(dt,subject,classdetail,attndType,statusAb,division);
		//present and ab student
		List<Attendance> l2=bLmanager.searchStudePresent(dt,subject,classdetail,attndType,status,division);
		List<Attendance> l3=bLmanager.SearchStudeAbsent(dt,subject,classdetail,attndType,statusAb,division);
		if(l1!=null)
		{
			System.out.println( l.get(0));

		}
		HttpSession session=request.getSession();
		//count
	session.setAttribute("list", l);
		session.setAttribute("list1", l1);
		//stud Name
session.setAttribute("list2", l2);
		session.setAttribute("list3", l3);
		response.sendRedirect("TeacherViewAttndReport.jsp");
		
		
		
	}

}
