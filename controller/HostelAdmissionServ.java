package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerHostel;
import com.pojo.Applicationforadmission;
import com.pojo.Genderforhostelroom;
import com.pojo.Hostelregistration;
import com.pojo.Hostelroomsallot;
import com.pojo.Studentroom;

/**
 * Servlet implementation class HostelAdmissionServ
 */
@WebServlet("/HostelAdmissionServ")
public class HostelAdmissionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostelAdmissionServ() {
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
		
		Applicationforadmission studApp=new Applicationforadmission();
		//Hostelroomsallot HroomAllot=new Hostelroomsallot();
		Studentroom studroom=new Studentroom();
		
		Hostelregistration Hreg=new Hostelregistration();
		
		
		BlManagerHostel bl=new BlManagerHostel();
		
		
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		String Mname=request.getParameter("Mname");
		
		String gender=request.getParameter("gender");
		String LocalAddress=request.getParameter("LocalAddress");
		
		String RoomType=request.getParameter("RoomType");
		String FoodType=request.getParameter("FoodType");
		
	//Gender type object
		Genderforhostelroom gen=new Genderforhostelroom();
		gen=bl.genSerchById(gender);
		
		//studroom gender type 
		studroom=bl.SearchGenTypeStudRoom(gen,RoomType);
		
		HttpSession session =request.getSession();
		studApp=(Applicationforadmission) session.getAttribute("StudHostelFrm");
		
		
		Hreg.setApplicationforadmission(studApp);
		Hreg.setHroomType(RoomType);
		Hreg.setHlocalAddress(LocalAddress);
		Hreg.setMessFoodType(FoodType);
		
		//status show that application submited 
		int status=1;
		Hreg.setStatus(status);
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		
		Hreg.setFormSubmitDate(dateobj);
		
		bl.SaveHostelRegDetails(Hreg);
		
		System.out.println("Application Submited");
		
		
		
		response.sendRedirect("HostelStudentFormOne.jsp");

		
		
		
		
		
		
		
	}

}
