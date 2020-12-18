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
import com.pojo.Hostelmess;
import com.pojo.Messattendence;

/**
 * Servlet implementation class MessAttendance
 */
@WebServlet("/MessAttendance")
public class MessAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MessAttendance() {
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

		Hostelmess hreg = new Hostelmess();
		Hostelmess hreg1 = new Hostelmess();

		HttpSession session5 = request.getSession();
		@SuppressWarnings("unchecked")
		List<Hostelmess> HMessList = (List<Hostelmess>) session5.getAttribute("HMessList");

		String[] attendanceId = request.getParameterValues("attendance");

		String AttendanceType = request.getParameter("AttendanceType");
		System.out.println(AttendanceType);

		BlManagerHostel bl = new BlManagerHostel();
		Attendencetype at = new Attendencetype();
		Attendencetype at1 = new Attendencetype();
		at = bl.getattendancetype(AttendanceType);
		
		
		

		if (at.getAttendenceType().equalsIgnoreCase("Present")) {

			if (attendanceId != null) {

				for (int a = 0; a < HMessList.size(); a++) {
					for (int i = 0; i < attendanceId.length; i++) {

						System.out.println((HMessList.get(a).getHmessId()));
						System.out.println(attendanceId[i]);

						if (HMessList.get(a).getHmessId() == (Integer.parseInt(attendanceId[i]))) {

							hreg = bl.getMessRegId((Integer.parseInt(attendanceId[i])));

							Messattendence ht = new Messattendence();
							ht.setHostelmess(hreg);
							ht.setAttendencetype(at);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht.setDateAndTime(dateobj);

							bl.saveMessattendance(ht);
						}

						else if (HMessList.get(a).getHmessId() != (Integer.parseInt(attendanceId[i]))) {

							String AttendanceTypeAb = "Absent";
							at1 = bl.getattendancetype(AttendanceTypeAb);

							hreg1 = bl.getMessRegId(HMessList.get(a).getHmessId());

							Messattendence ht1 = new Messattendence();
							ht1.setHostelmess(hreg1);
							ht1.setAttendencetype(at1);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht1.setDateAndTime(dateobj);

							bl.saveMessattendance(ht1);
						}

					}
				}
			}

		}


	
	
	
	
	if (at.getAttendenceType().equalsIgnoreCase("Absent")) {

		if (attendanceId != null) {

			for (int a = 0; a < HMessList.size(); a++) {
				for (int i = 0; i < attendanceId.length; i++) {

					System.out.println((HMessList.get(a).getHmessId()));
					System.out.println(attendanceId[i]);

					if (HMessList.get(a).getHmessId() == (Integer.parseInt(attendanceId[i]))) {

						hreg = bl.getMessRegId((Integer.parseInt(attendanceId[i])));

						Messattendence ht = new Messattendence();
						ht.setHostelmess(hreg);
						ht.setAttendencetype(at);

						DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
						Date dateobj = new Date();
						ht.setDateAndTime(dateobj);

						bl.saveMessattendance(ht);
					}

					else if (HMessList.get(a).getHmessId() != (Integer.parseInt(attendanceId[i]))) {

						String AttendanceTypeAb = "Present";
						at1 = bl.getattendancetype(AttendanceTypeAb);

						hreg1 = bl.getMessRegId(HMessList.get(a).getHmessId());

						Messattendence ht1 = new Messattendence();
						ht1.setHostelmess(hreg1);
						ht1.setAttendencetype(at1);

						DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
						Date dateobj = new Date();
						ht1.setDateAndTime(dateobj);

						bl.saveMessattendance(ht1);
					}

				}
			}
		}

	}

}

}
