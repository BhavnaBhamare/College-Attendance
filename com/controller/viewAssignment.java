package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Assignment;
import com.pojo.Subject;

/**
 * Servlet implementation class viewAssignment
 */
@WebServlet("/viewAssignment")
public class viewAssignment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BLmanager bLmanager=new BLmanager();
       Assignment assignment=new Assignment();
       Subject subject=new Subject();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewAssignment() {
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
		String subjectName=request.getParameter("assignSubjectName");
	    // subject=bLmanager.searchSubject(subjectName);
		List<Assignment> l=bLmanager.searchAssignmentData(subjectName);
		HttpSession session=request.getSession();
		session.setAttribute("list", l);
		response.sendRedirect("TeacherViewAssignment.jsp");
		
	}

}
