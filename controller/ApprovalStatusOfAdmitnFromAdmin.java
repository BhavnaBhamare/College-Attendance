package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerAdmission;
import com.pojo.Applicationforadmission;

/**
 * Servlet implementation class ApprovalStatusOfAdmitnFromAdmin
 */
public class ApprovalStatusOfAdmitnFromAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BlManagerAdmission bl=new BlManagerAdmission();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApprovalStatusOfAdmitnFromAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String aId=request.getParameter("AID");
		String rId=request.getParameter("RID");
		//aproval==0
		if(aId!=null && rId==null)
		{
			int apId=Integer.parseInt(aId);
			Applicationforadmission ap=bl.fetchStudentApllicationId(apId);
			bl.ApprovalOffStudentApplication(ap);
		}
		//rejection==1
		if(aId==null && rId!=null)
		{
			int reId=Integer.parseInt(rId);
			Applicationforadmission ap=bl.fetchStudentApllicationId(reId);
			bl.RejectionOffStudentApplication(ap);
		}
		
		response.sendRedirect("AdminAprovalForAdmitn.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
		
		
		
	}

}
