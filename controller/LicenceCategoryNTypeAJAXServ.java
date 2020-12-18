package com.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.gson.Gson;

/**
 * Servlet implementation class LicenceCategoryNTypeAJAXServ
 */
@WebServlet("/LicenceCategoryNTypeAJAXServ")
public class LicenceCategoryNTypeAJAXServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LicenceCategoryNTypeAJAXServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String driverLicenceCategory = request.getParameter("driverLicenceCategory");
		List<String> list = new ArrayList<String>();
		String json = null;

		if (driverLicenceCategory.equals("MediumSizedVehicles")) {
			list.add("Category C1");
			list.add("Category C1E");
			

		} else if (driverLicenceCategory.equals("LargeVehicles")) {
			list.add("Category C");
			list.add("Category CE");

		} else if (driverLicenceCategory.equals("Minibuses")) {
			list.add("Category D1");
			list.add("Category D1E");


		} else if (driverLicenceCategory.equals("Buses")) {
			list.add("Category D");
			list.add("Category DE");
		}
		//json = new Gson().toJson(list);
		response.setContentType("application/json");
		response.getWriter().write(json);
		response.sendRedirect("AddDriverDetails.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
