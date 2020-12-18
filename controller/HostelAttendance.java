package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerHostel;
import com.pojo.Attendencetype;
import com.pojo.Hostelattendence;
import com.pojo.Hostelregistration;

/**
 * Servlet implementation class HostelAttendance
 */
@WebServlet("/HostelAttendance")
public class HostelAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HostelAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		Hostelregistration hreg = new Hostelregistration();
		Hostelregistration hreg1 = new Hostelregistration();

		HttpSession session3 = request.getSession();
		List<Hostelregistration> HRegIdList = (List<Hostelregistration>) session3.getAttribute("HRoomAppList");

		// Hostelregistration hr=HRegIdList.get(1);

		String[] attendanceId = request.getParameterValues("attendance");

		String AttendanceType = request.getParameter("AttendanceType");
		System.out.println(AttendanceType);

		BlManagerHostel bl = new BlManagerHostel();
		Attendencetype at = new Attendencetype();
		Attendencetype at1 = new Attendencetype();
		at = bl.getattendancetype(AttendanceType);

		if (at.getAttendenceType().equalsIgnoreCase("Present")) {

			if (attendanceId != null) {
				
				for (int a = 0; a < HRegIdList.size(); a++) {
				for (int i = 0; i < attendanceId.length; i++) {

					System.out.println((HRegIdList.get(a).getHregId()));
					System.out.println(attendanceId[i]);
						
						if (HRegIdList.get(a).getHregId()==(Integer.parseInt(attendanceId[i]))  ) {

							hreg = bl.getHostelRegById(Integer.parseInt(attendanceId[i]));

							Hostelattendence ht = new Hostelattendence();
							ht.setHostelregistration(hreg);
							ht.setAttendencetype(at);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht.setDateAndTime(dateobj);

							bl.saveHostelAttendance(ht);
						}

						else if(HRegIdList.get(a).getHregId()!=(Integer.parseInt(attendanceId[i]))) {

							String AttendanceTypeAb = "Absent";
							at1 = bl.getattendancetype(AttendanceTypeAb);

							hreg1 = bl.getHostelRegById((HRegIdList.get(a).getHregId()));

							Hostelattendence ht = new Hostelattendence();
							ht.setHostelregistration(hreg1);
							ht.setAttendencetype(at1);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht.setDateAndTime(dateobj);

							bl.saveHostelAttendance(ht);
						}

					}
				}
			}

			/*
			 * else if (at.getAttendenceType().equalsIgnoreCase("Absent")) {
			 * 
			 * if (attendanceId != null) { for (int i = 0; i <
			 * attendanceId.length; i++) { hreg =
			 * bl.getHostelRegById(Integer.parseInt(attendanceId[i]));
			 * 
			 * Hostelattendence ht = new Hostelattendence();
			 * ht.setHostelregistration(hreg); ht.setAttendence(at);
			 * 
			 * DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss"); Date
			 * dateobj = new Date(); ht.setDateAndTime(dateobj);
			 * 
			 * bl.saveHostelAttendance(ht); } }
			 */

			/*
			 * if (attendanceId != null) { for (int i = 0; i <
			 * attendanceId.length; i++) { System.out.println(attendanceId[i]);
			 * 
			 * } }
			 */

		}
		
		
		
		
		if (at.getAttendenceType().equalsIgnoreCase("Absent")) {

			if (attendanceId != null) {
				
				for (int a = 0; a < HRegIdList.size(); a++) {
				for (int i = 0; i < attendanceId.length; i++) {

					System.out.println((HRegIdList.get(a).getHregId()));
					System.out.println(attendanceId[i]);
						
						if (HRegIdList.get(a).getHregId()==(Integer.parseInt(attendanceId[i]))  ) {

							hreg = bl.getHostelRegById(Integer.parseInt(attendanceId[i]));

							Hostelattendence ht = new Hostelattendence();
							ht.setHostelregistration(hreg);
							ht.setAttendencetype(at);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht.setDateAndTime(dateobj);

							bl.saveHostelAttendance(ht);
						}

						else if(HRegIdList.get(a).getHregId()!=(Integer.parseInt(attendanceId[i]))) {

							String AttendanceTypeAb = "Present";
							at1 = bl.getattendancetype(AttendanceTypeAb);

							hreg1 = bl.getHostelRegById((HRegIdList.get(a).getHregId()));

							Hostelattendence ht = new Hostelattendence();
							ht.setHostelregistration(hreg1);
							ht.setAttendencetype(at1);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht.setDateAndTime(dateobj);

							bl.saveHostelAttendance(ht);
						}

					}
				}
			}

			

		}

	}
}
