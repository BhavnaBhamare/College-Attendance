package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.BlManagerExamination;
import com.pojo.Dance;
import com.pojo.Enrolledstudents;
import com.pojo.Sports;

/**
 * Servlet implementation class AddDance
 */
@WebServlet("/AddDance")
public class AddDance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Dance Dn = new Dance();
	Enrolledstudents er= new Enrolledstudents();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDance() {
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
		
		
		String EnrollId = request.getParameter("EnrollId");
		String Dancetype = request.getParameter("Dancetype");
		
		
		er= Bl.SearchbyEnrollNo(EnrollId);
		
		Dn.setEnrolledstudents(er);
		Dn.setDanceType(Dancetype);
		
		Bl.InsertDance(Dn);
		response.sendRedirect("AddDanceDetails.jsp");
		
	}

}
