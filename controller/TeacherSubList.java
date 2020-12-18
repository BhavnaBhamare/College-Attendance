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
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class TeacherSubList
 */
@WebServlet("/TeacherSubList")
public class TeacherSubList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Enrolledstudents er = new Enrolledstudents();
	BlManagerExamination Bl= new BlManagerExamination();
	Applicationforadmission apd = new Applicationforadmission();
	Studentfees sfees= new Studentfees();
	Course cour= new Course();
	Branch Br = new Branch();
	Subjects sb = new Subjects();
	Currentstudentinfo crr= new Currentstudentinfo();
	Teacherdetail tds = new Teacherdetail();
       
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherSubList() {
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
		
		
	int teacherid = Integer.parseInt(request.getParameter("TeacherId"));
	tds=Bl.searchbyTeacherid(teacherid);
	
	List<Subjects> listsub= Bl.searchteachersub(tds);
	System.out.println(listsub);
	HttpSession session1 = request.getSession();
	session1.setAttribute("Teachersublist",listsub);
	response.sendRedirect("TeacherSubList.jsp");
	
	
	}

}
