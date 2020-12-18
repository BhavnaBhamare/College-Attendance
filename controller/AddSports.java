package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.model.BlManagerExamination;
import com.pojo.Dance;
import com.pojo.Enrolledstudents;
import com.pojo.Sports;
/**
 * Servlet implementation class AddSports
 */
@WebServlet("/AddSports")
public class AddSports extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Sports sp = new Sports();
	Enrolledstudents er= new Enrolledstudents();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSports() {
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
		
		
		
		String EnrollId = request.getParameter("EnrollId");
		String Sportstype = request.getParameter("Sportstype");
		
		
		er= Bl.SearchbyEnrollNo(EnrollId);
		
		sp.setEnrolledstudents(er);
		sp.setSportsType(Sportstype);
		
		Bl.InsertSports(sp);
		response.sendRedirect("AddSportsDetails.jsp");
		
	}

}
