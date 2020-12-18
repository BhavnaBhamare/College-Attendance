package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class Lo
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BLmanager bl = new BLmanager();
	Teacherdetail tcher = new Teacherdetail();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String tcherEmailId = request.getParameter("tcherEmailId");
		String tcherPassword = request.getParameter("tcherPassword");
		String rol = request.getParameter("department");

		System.out.println(tcherEmailId + "   " + tcherPassword + "   " + rol);

		// HttpSession session = request.getSession();

		boolean status = bl.authenticate(tcherEmailId, tcherPassword, rol);
		System.out.println("status" + status);

		if (rol.equals("Teacher")) {

			if (status == true) {
				tcher = bl.searchByLoginId(tcherEmailId);
				
				
				String name = tcher.getTcherFirstName();
				String email = tcher.getTcherEmailId();
				session.setAttribute("UserName", name);
				session.setAttribute("Email", email);
				
				ServletContext context = request.getSession().getServletContext();
				context.setAttribute("UserName", "name");
				

				response.sendRedirect("TeacherDashboard.jsp");

			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User or password incorrect');");
				out.println("location='Login.jsp';");
				out.println("</script>");
			}
		}

		else if (rol.equals("Head Of Computer Science")) {

			if (status == true) {
				tcher = bl.searchByLoginId(tcherEmailId);
				String name = tcher.getTcherFirstName();
				String email = tcher.getTcherEmailId();
				session.setAttribute("UserName", name);
				session.setAttribute("Email", email);
				System.out.println(name);
				System.out.println("Admin");

				response.sendRedirect("TeacherDashboard.jsp");

			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User or password incorrect');");
				out.println("location='Login.jsp';");
				out.println("</script>");
			}
		}

	}
}
