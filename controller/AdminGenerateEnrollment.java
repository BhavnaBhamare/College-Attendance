package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerAdmission;
import com.pojo.Admissionyear;
import com.pojo.Enrolledstudents;
import com.pojo.Studentadmitnfees;

/**
 * Servlet implementation class AdminGenerateEnrollment
 */
public class AdminGenerateEnrollment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerAdmission bl = new BlManagerAdmission();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminGenerateEnrollment() {
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

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = new Date();
		System.out.println(df.format(currentDate));
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		Admissionyear y1=bl.selectYear(year);
		System.out.println(y1);
		String FeesId = request.getParameter("AID");
		System.out.println(FeesId);
		int fId = Integer.parseInt(FeesId);
		System.out.println(fId);
		Studentadmitnfees sf = bl.FetchStudentPaymentId(fId);
		System.out.println(sf.getCourse().getCourseName());
		String enrollmentNumber = bl.generateEnroll(sf, year);
		System.out.println(enrollmentNumber);

		Enrolledstudents en = new Enrolledstudents();
		en.setApplicationforadmission(sf.getApplicationforadmission());
		en.setBranch(sf.getApplicationforadmission().getBranch());
		en.setCourse(sf.getCourse());
		en.setAdmissionyear(y1);
		en.setEnrollmentNumber(enrollmentNumber);
		en.setCreatedDateTime(currentDate);
		bl.StoreEnrollMentNo(en);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
