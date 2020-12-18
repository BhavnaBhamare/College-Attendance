package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanager;
import com.pojo.Classdetail;

/**
 * Servlet implementation class cDetail
 */
@WebServlet("/cDetail")
public class cDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager = new BLmanager();
	Classdetail cs = new Classdetail();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		String className = request.getParameter("className");
		cs.setClassName(className);
		bLmanager.add(cs);
		response.sendRedirect("classDetail.jsp");

	}

}
