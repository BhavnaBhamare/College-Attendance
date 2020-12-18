package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.pojo.Applicationforadmission;
import com.pojo.Registration;

/**
 * Servlet implementation class AuthenticateLogin
 */
@WebServlet("/AuthenticateLogin")
public class AuthenticateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManager bl = new BlManager();
	Registration reg = new Registration();
	Applicationforadmission app1 = new Applicationforadmission();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthenticateLogin() {
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
		PrintWriter pw = response.getWriter();
		String StudentUsername = request.getParameter("name");
		int UserId = Integer.parseInt(StudentUsername);
		String StudentPassword = request.getParameter("password");
		String button = request.getParameter("button");

		/*
		 * String StudentFName= reg.getRegFirstName(); HttpSession
		 * s2=request.getSession(); s2.setAttribute("RegisteredStudentFName",
		 * StudentFName);
		 */

		reg = bl.AutheticateStudent(UserId, StudentPassword);
		/*System.out.println(reg.getRegFirstName());*/
		app1 = bl.CheckApplication(reg);
		if (reg != null && app1 == null) {
			if (button.equals("Login")) {

				HttpSession s1 = request.getSession();
				s1.setAttribute("RegisteredStudent", reg);

				response.sendRedirect("StudentDashBoardAfterReg.jsp");
			}
		} else if (reg != null && app1 != null) {
			if (button.equals("Login")) {

				HttpSession s1 = request.getSession();
				s1.setAttribute("RegisteredStudent", reg);

				response.sendRedirect("StudentApprovalForAdmission.jsp");
			}
		} else {
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('User or password incorrect');");
			pw.println("location='LoginForAdmission.jsp';");
			pw.println("</script>");
			response.sendRedirect("LoginForAdmission.jsp");
		}

	}

}
