package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.model.BlManagerExamination;
import com.pojo.Applicationforadmission;
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Currentstudentinfo;
import com.pojo.Enrolledstudents;
import com.pojo.Examtimetable;
import com.pojo.Studentfees;
import com.pojo.Subjects;

/**
 * Servlet implementation class ViewStuTimetable
 */
@WebServlet("/ViewStuTimetable")
public class ViewStuTimetable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Enrolledstudents er = new Enrolledstudents();
	BlManagerExamination Bl= new BlManagerExamination();
	Applicationforadmission apd = new Applicationforadmission();
	Studentfees sfees= new Studentfees();
	Course cour= new Course();
	Branch Br = new Branch();
	Subjects sb = new Subjects();
	Currentstudentinfo crr= new Currentstudentinfo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStuTimetable() {
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
		String EnrollId = request.getParameter("EnrollId");
		
		er=Bl.SearchEnrolledStudent(EnrollId);
		
		Br=er.getBranch();
		cour= er.getCourse();
		
		
		crr= Bl.Searchsemester(er);
		
		String sem = crr.getCurrentSemester();
		int sem1=Integer.parseInt(sem);
		System.out.println(sem1);
		
		
		List<Examtimetable> viewTimetablelist= Bl.searchlistforview(Br,cour,sem1);
		System.out.println(viewTimetablelist);
		HttpSession session1 = request.getSession();
		session1.setAttribute("TimeTable",viewTimetablelist);
		response.sendRedirect("Studentviewtimetable.jsp");
		
		
	}

}
