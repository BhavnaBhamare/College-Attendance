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
import com.pojo.Examtimetable;
import com.pojo.Subjects;

/**
 * Servlet implementation class AdminViewTimeTable
 */
@WebServlet("/AdminViewTimeTable")
public class AdminViewTimeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Branch brch = new Branch();
	
	Course crs = new Course();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewTimeTable() {
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
		
		String Course = request.getParameter("Course");
		String branch = request.getParameter("branch");
		int sem= Integer.parseInt(request.getParameter("sem"));
		String ExamType=request.getParameter("ExamType");
		
		
		
		
		brch=Bl.SearchbybranchName(branch);
		crs= Bl.SearchbycourseName(Course);
	
		
		
		List<Examtimetable> ExTable=Bl.AdminlistExTimeTable(crs,brch,sem,ExamType);
		
		System.out.println(ExTable);
				
		 HttpSession session = request.getSession();
			session.setAttribute("ViewTimeTable",ExTable);
			
			response.sendRedirect("AdminViewExTimebale2.jsp");
		
	}

}
