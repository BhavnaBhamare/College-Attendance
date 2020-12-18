package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.pojo.Enrolledstudents;
import com.pojo.Studentfees;

/**
 * Servlet implementation class CancellationAmountDeductionServ
 */
public class CancellationAmountDeductionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BlManager bl = new BlManager();
    Studentfees fees = new Studentfees();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancellationAmountDeductionServ() {
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
	
		HttpSession session = request.getSession();
		Enrolledstudents enrollStudet = (Enrolledstudents) session.getAttribute("enrollStudent");
		System.out.println(enrollStudet.getEnrolledId());
		response.sendRedirect("Student.jsp");
	
		
	}

}
