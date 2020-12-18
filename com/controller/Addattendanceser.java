package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Classdetail;
import com.pojo.Division;
import com.pojo.Studentdetail;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class Addattendanceser
 */
@WebServlet("/Addattendanceser")
public class Addattendanceser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLmanager bLmanager = new BLmanager();
	Studentdetail studentdetail = new Studentdetail();
	Classdetail classdetail = new Classdetail();
	Division division = new Division();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Addattendanceser() {
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
		
		
		
		
		
		
		
		response.setContentType("text/html");
		String attndclassname = request.getParameter("attendanceclass");
		String attnddivname = request.getParameter("attnddiv");

		// check with classsdetail pojo
		classdetail = bLmanager.searchByClass(attndclassname);
		division = bLmanager.searchByDivision(attnddivname);
		ServletContext context = getServletContext();
		context.setAttribute("class", attndclassname);

		// if(attndclassname.equals("FyBsc")&& attnddivname.equals("A")){
		List<Studentdetail> list = bLmanager.searchStudentName(classdetail, division);

		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// }
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("InsertAttendance.jsp");
		requestDispatcher.forward(request, response);
		// response.sendRedirect("InsertAttendance.jsp");
	}

}
