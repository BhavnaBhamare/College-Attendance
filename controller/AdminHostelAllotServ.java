package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.model.BlManagerHostel;
import com.pojo.Genderforhostelroom;
import com.pojo.Hostelregistration;
import com.pojo.Hostelroomsallot;
import com.pojo.Studentroom;


/**
 * Servlet implementation class AdminHostelAllotServ
 */
@WebServlet("/AdminHostelAllotServ")
public class AdminHostelAllotServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHostelAllotServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String StudId=request.getParameter("id");
		
		
		
		
		
		BlManagerHostel bl=new BlManagerHostel();
		Hostelregistration hreg=bl.getHostelRegById(Integer.parseInt(StudId));
		
		HttpSession sessionHostelRegId=request.getSession();
		sessionHostelRegId.setAttribute("ListOfReg", hreg);
		
		//get gender of applicant
		String gen=hreg.getApplicationforadmission().getApplicantGender();
		//get gender typ value
		Genderforhostelroom gen1=bl.genSerchById(gen);
		//get studentRoomtype ac/nonac
		String studentRoomType=hreg.getHroomType();
		
		Studentroom studRoomtypId=bl.SearchGenTypeStudRoom(gen1, studentRoomType);
		
		List<Hostelroomsallot> HroomAlotList=bl.getAvalableRoomList(studRoomtypId);
		
		HttpSession sessionHallot=request.getSession();
		sessionHallot.setAttribute("HroomAlotList", HroomAlotList);
		
		response.sendRedirect("AdminStudentRoomAlot.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
