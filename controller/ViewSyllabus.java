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
import com.pojo.Syllabus;

/**
 * Servlet implementation class ViewSyllabus
 */
@WebServlet("/ViewSyllabus")
public class ViewSyllabus extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager=new BLmanager();
	Syllabus syllabus=new Syllabus();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewSyllabus() {
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
		String subjectName=request.getParameter("SubjectName");
		System.out.println(subjectName);
	    // subject=bLmanager.searchSubject(subjectName);
		List<Syllabus> l=bLmanager.searchSyllabusData(subjectName);
		HttpSession session=request.getSession();
		session.setAttribute("list1", l);
		response.sendRedirect("TeacherViewSyllabus.jsp");
	}

}
