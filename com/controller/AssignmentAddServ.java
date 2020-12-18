package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.model.BLmanager;
import com.pojo.*;

/**
 * Servlet implementation class AssignmentAddServ
 */
@WebServlet("/AssignmentAddServ")
public class AssignmentAddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Teacherdetail td = new Teacherdetail();
	BLmanager BL = new BLmanager();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AssignmentAddServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = BL.searchByLoginId(Email);
		System.out.println("eid " + eid);

		String assignSubjectName = request.getParameter("assignSubjectName");
		String assignDateOfStarting = request.getParameter("assignDateOfStarting");
		String assignDateOfEnding = request.getParameter("assignDateOfEnding");
		String assignLateSubDate = request.getParameter("assignLateSubDate");
		String assignType = request.getParameter("assignType");

		String teacherId = request.getParameter("teacherId");
		Assignment assi = new Assignment();

		assi.setAssignSubjectName(assignSubjectName);
		assi.setAssignDateOfEnding(Date.valueOf(assignDateOfStarting));
		assi.setAssignDateOfStarting(Date.valueOf(assignDateOfEnding));
		assi.setAssignLateSubDate(Date.valueOf(assignLateSubDate));
		assi.setAssignType(assignType);
		assi.setTeacherdetail(eid);
		// Set<Teacherdetail> s = new HashSet<Teacherdetail>();

		// td.setTeacherId(int.toString());

		BL.insertAssi(assi);

		response.sendRedirect("assignmentAdd.jsp");

	}

}
