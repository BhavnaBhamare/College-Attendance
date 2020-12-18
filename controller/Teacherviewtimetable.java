package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.BLmanager;
import com.pojo.Classdetail;

import com.pojo.Timetable;

/**
 * Servlet implementation class Teacherviewtimetable
 */
@WebServlet("/Teacherviewtimetable")
public class Teacherviewtimetable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BLmanager bLmanager=new BLmanager();
       Timetable timetable=new Timetable();
       Classdetail classdetail=new Classdetail();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacherviewtimetable() {
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
		response.setContentType("text/html");
		String className = request.getParameter("timetableclass");
			classdetail=bLmanager.searchByClass(className);
			List<Timetable> timetable=bLmanager.selectDataTime(classdetail);
			HttpSession session = request.getSession();
			session.setAttribute("timeTable", timetable);
			response.sendRedirect("viewTimetable.jsp");
		}
	}


