package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerAdmission;
import com.model.BlManagerAccount;
import com.pojo.Applicationforadmission;
import com.pojo.Coursefees;
import com.pojo.Studentadmitnfees;

/**
 * Servlet implementation class AccountantTakingFees
 */

public class AccountantTakingAdmitionFees extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerAccount bl = new BlManagerAccount();
	Studentadmitnfees fp = new Studentadmitnfees();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountantTakingAdmitionFees() {
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

		PrintWriter pw = response.getWriter();
		String totalfees = request.getParameter("totalfees");
		System.out.println(totalfees);
		Double total = Double.parseDouble(totalfees);
		String paidfees = request.getParameter("paid");
		Double paid = Double.parseDouble(paidfees);
		String remainingfees = request.getParameter("remaining");
		Double remaining = Double.parseDouble(remainingfees);
		String payment = request.getParameter("payment");
		HttpSession s = request.getSession();
		Applicationforadmission ap = (Applicationforadmission) s.getAttribute("GoForPayment");

		HttpSession s2 = request.getSession();
		Coursefees cf = (Coursefees) s2.getAttribute("CourseFees");

		HttpSession s1 = request.getSession();
		Date d = (Date) s1.getAttribute("currentDate");

		fp.setCourse(ap.getCourse());
		fp.setSemester(cf.getSemester());
		fp.setPaymentMode(payment);
		fp.setPaymentDate(d);
		fp.setApplicationforadmission(ap);
		fp.setTotalFees(total);
		fp.setPaidFees(paid);
		fp.setRemainingFees(remaining);

		bl.SoreStudentFees(fp);

	}

}
