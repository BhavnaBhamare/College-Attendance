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
import com.pojo.Music;

/**
 * Servlet implementation class AddMusic
 */
@WebServlet("/AddMusic")
public class AddMusic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Music ms = new Music();
	Enrolledstudents er= new Enrolledstudents();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMusic() {
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
		String Instrumenttype = request.getParameter("Instrumenttype");
		
		
		er= Bl.SearchbyEnrollNo(EnrollId);
		
		ms.setEnrolledstudents(er);
		ms.setInstruments(Instrumenttype);
		
		Bl.InsertMusic(ms);
		response.sendRedirect("AddMusicDetails.jsp");
		
	}

}
