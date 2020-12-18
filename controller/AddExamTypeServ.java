//by Shailesh Jain
package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanager;
import com.pojo.Examtype;

/**
 * Servlet implementation class AddExamTypeServ
 */
@WebServlet("/AddExamTypeServ")
public class AddExamTypeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	Examtype examtype = new Examtype();
	BLmanager bLmanager = new BLmanager();

	public AddExamTypeServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String examTypeName = request.getParameter("examTypeName");
		examtype.setExamTypeName(examTypeName);
		//examtype.setExamTypeId(1);
		bLmanager.insertExamType(examtype);
		
		
			
			//response.getWriter().write("Record Saved Successfully!!!");
			request.getRequestDispatcher("/addExamType.jsp").include(request, response);
			
		
		
	}

}
