package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Subject;

/**
 * Servlet implementation class AddSubjectServ
 */
@WebServlet("/AddSubjectServ")
public class AddSubjectServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BLmanager bl=new BLmanager();
    Subject sub=new Subject();	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String subjectName=request.getParameter("subjectName");
		
		sub.setSubjectName(subjectName);
		
		HttpSession session=request.getSession();
		String s="Record added successfully";
		
		session.setAttribute("MsgSub", s);
		response.sendRedirect("addSubject.jsp");
		
		
	}

}
