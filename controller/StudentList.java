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
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Enrolledstudents;
import com.pojo.Examtimetable;
import com.pojo.Subjects;

/**
 * Servlet implementation class StudentList
 */
@WebServlet("/StudentList")
public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Branch brch = new Branch();
	
	Course crs = new Course();
    Subjects sb = new Subjects();  
    Enrolledstudents er = new Enrolledstudents();
    Examtimetable Extime = new Examtimetable();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int subid=Integer.parseInt(request.getParameter("id"));
		System.out.println(subid);
		
		sb=Bl.seachsubid(subid);
		
		int courseid =  sb.getCourse().getCourseId();
		int sem= sb.getSemester();
		int branchid= sb.getBranch().getBranchId();
		
		crs=Bl.searchcourse(courseid);
		brch=Bl.searchbranch(branchid);
		
		List<Enrolledstudents> restu= Bl.marksstulist(crs,brch,sem);
		HttpSession session1 = request.getSession();
		session1.setAttribute("enrollstu",restu);
		
		HttpSession session2 = request.getSession();
		session1.setAttribute("sub",sb);
		response.sendRedirect("EnterMarks.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
