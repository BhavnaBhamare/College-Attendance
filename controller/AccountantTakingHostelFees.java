package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerAccount;
import com.pojo.Applicationforadmission;
import com.pojo.Coursefees;
import com.pojo.Hostelfees;
import com.pojo.Hostelregistration;

/**
 * Servlet implementation class AccountantTakingHostelFees
 */
public class AccountantTakingHostelFees extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerAccount bl = new BlManagerAccount();
	Hostelfees fp = new Hostelfees();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccountantTakingHostelFees() {
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

		String totalfees = request.getParameter("totalfees");
		System.out.println(totalfees);
		Double total = Double.parseDouble(totalfees);
		String paidfees = request.getParameter("paid");
		Double paid = Double.parseDouble(paidfees);
		String remainingfees = request.getParameter("remaining");
		Double remaining = Double.parseDouble(remainingfees);
		String payment = request.getParameter("payment");
		HttpSession s = request.getSession();
		Hostelregistration ap = (Hostelregistration) s.getAttribute("GoForPayment");
		fp.setHostelregistration(ap);
		fp.setTotalFees(total);
		fp.setPaidFees(paid);
		fp.setRemainingFees(remaining);

		bl.StoreHostelFees(fp);
	}

}
