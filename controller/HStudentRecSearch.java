package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerHostel;
import com.pojo.Applicationforadmission;
import com.pojo.Studentroom;

/**
 * Servlet implementation class HStudentRecSearch
 */
@WebServlet("/HStudentRecSearch")
public class HStudentRecSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HStudentRecSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int Hid=Integer.parseInt(request.getParameter("StudId"));
		 System.out.println(Hid);
		
		BlManagerHostel blManagerHostel=new BlManagerHostel();
		Applicationforadmission StudApp=new Applicationforadmission();
		
		StudApp=blManagerHostel.SearchStudentById(Hid);
		
		if(StudApp==null){
			response.sendRedirect("HostelStudentFormOne.jsp");
		}
		else {
			HttpSession session =request.getSession();
			session.setAttribute("StudHostelFrm", StudApp);	
			response.sendRedirect("HostelStudentForm.jsp");
				
		}
		
		
		
		
	}

}
