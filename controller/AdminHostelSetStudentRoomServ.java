package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.digester.RegexMatcher;
import org.hibernate.Session;

import com.model.BlManagerHostel;
import com.pojo.Hostelleaveapplication;
import com.pojo.Hostelmess;
import com.pojo.Hostelmessfoodtype;
import com.pojo.Hostelregistration;
import com.pojo.Hostelroomsallot;

/**
 * Servlet implementation class AdminHostelSetStudentRoomServ
 */
@WebServlet("/AdminHostelSetStudentRoomServ")
public class AdminHostelSetStudentRoomServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHostelSetStudentRoomServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
			
		BlManagerHostel bl=new BlManagerHostel();
		Hostelregistration reg=new Hostelregistration();
		
		Hostelregistration reg1 =(Hostelregistration) request.getAttribute("ListOfReg");
		
		
		//Hostelmess Hmess=new Hostelmess();
		
		
		/*HttpSession MessId=request.getSession();
		int messid=(int) MessId.getAttribute("MessId");
		System.out.println(messid);*/
		
		
		
		Hostelmess getHm=new Hostelmess();
		getHm=bl.getmessIdOfStud(reg1);
		
		
		//Hostel Registration Id
		HttpSession sessionHreg=request.getSession();
		Hostelregistration HReg=(Hostelregistration) sessionHreg.getAttribute("ListOfReg");
		
		//mess Id
		Hostelmess hm=new Hostelmess();
		hm.setHostelregistration(HReg);
		
	Hostelmessfoodtype hMftype=bl.GetfoodType(HReg.getHroomType());
		
		hm.setHostelmessfoodtype(hMftype);
		bl.setMessReg(hm);
		
		HttpSession messid=request.getSession();
		messid.setAttribute("MessId", "");
		
		
		
		//Hostel Room Allotment table id
	String RoomId=request.getParameter("Rid");
	Hostelroomsallot HroomAllot=bl.getHostelRoomAllotID(Integer.parseInt(RoomId));
	System.out.println("Room Allot" +HroomAllot);
	int roomMembers=HroomAllot.getHostelRoomMembers();
	int newRoomMembers=roomMembers+1;
	
	HroomAllot.setHostelRoomMembers(newRoomMembers); 
	
	bl.updateHostelRoomMember(HroomAllot); 
	
	/*HttpSession sessionHmess=request.getSession();
	Hmess =(Hostelmess) sessionHreg.getAttribute("MessId");*/
	
	
	
	//DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
/*	DateFormat df = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
	Date dateobj = new Date();
	System.out.println(dateobj);*/
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); 
	String currentDate = dateFormat.format(date);
	try {
		Date FinalDate = dateFormat.parse(currentDate);
		System.out.println("DD "+FinalDate);
		reg.setAdminAllotDate(FinalDate);
		reg.setHostelroomsallot(HroomAllot);
		reg.setStatus(2);
		reg.setHregId(HReg.getHregId());
		reg.setHostelmess(getHm);
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}                          
	
	bl.UpdateHostelRegDetail(reg);
	
	response.sendRedirect("AdminListAllotHostelMess.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
