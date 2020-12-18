package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerHostel;
import com.pojo.Hostelregistration;

/**
 * Servlet implementation class AdminHostelRejectServ
 */
@WebServlet("/AdminHostelRejectServ")
public class AdminHostelRejectServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BlManagerHostel bl=new BlManagerHostel();
	Hostelregistration reg=new Hostelregistration();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHostelRejectServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String Aid=request.getParameter("Aid");
		String Rid=request.getParameter("Rid");
		
		
		if(Aid != null && Rid==null){
			
			//set application Accepted
		int a=Integer.parseInt(Aid);
		
		Hostelregistration regId=new Hostelregistration();
		regId=bl.getHostelRegById(a);
		
		
		bl.setAcceptStatus(regId);
		
		response.sendRedirect("AdminHostelRoomApplicationList.jsp");
		
		}else {
			
			//set application rejected
			int a=Integer.parseInt(Rid);
			Hostelregistration regId=new Hostelregistration();
			regId=bl.getHostelRegById(a);
			
			String reason="Seats are Full";
			bl.setRejectStatus(regId,reason);
			
			response.sendRedirect("AdminHostelRoomApplicationList.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
