package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Syllabus;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class SyllabusAddServ
 */
@WebServlet("/SyllabusAddServ")
public class SyllabusAddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Syllabus syll = new Syllabus();
	BLmanager BL = new BLmanager();
	Teacherdetail tr = new Teacherdetail();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SyllabusAddServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = BL.searchByLoginId(Email);
		System.out.println("eid " + eid);

		String syllabusClass = request.getParameter("syllabusClass");
		String syllabusSubject = request.getParameter("syllabusSubject");
		String syllabusModules = request.getParameter("syllabusModules");
		String syllabusChapters = request.getParameter("syllabusChapters");
		String syllabusChapSubPoint = request.getParameter("syllabusChapSubPoint");
		String syllabusPracticals = request.getParameter("syllabusPracticals");
		String syllabusTotalHours = request.getParameter("syllabusTotalHours");
		String syllabusDate = request.getParameter("syllabusDate");

		// System.out.println("teacher detail===" + tchername);
		syll.setSyllabusClass(syllabusClass);
		syll.setSyllabusSubject(syllabusSubject);
		syll.setSyllabusModules(syllabusModules);
		syll.setSyllabusChapters(syllabusChapters);
		syll.setSyllabusChapSubPoint(syllabusChapSubPoint);
		syll.setSyllabusPracticals(syllabusPracticals);
		syll.setSyllabusTotalHours(syllabusTotalHours);
		syll.setSyllabusDate(Date.valueOf(syllabusDate));
		syll.setTeacherdetail(eid);

		BL.insert(syll);
		// request.getRequestDispatcher("SyllabusDisplay.jsp").forward(request,
		// response);
		response.sendRedirect("syllabusAdd.jsp");

	}

}
