package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerAccount;
import com.pojo.Applicationforadmission;
import com.pojo.Studenttransportfees;
import com.pojo.Transportservicereq;

/**
 * Servlet implementation class AccountantTakingTransportFees
 */
public class AccountantTakingTransportFees extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerAccount bl=new BlManagerAccount();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountantTakingTransportFees() {
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
		
		String paidfees = request.getParameter("paid");
		Double paid = Double.parseDouble(paidfees);
		

		HttpSession s1 = request.getSession();
		Date d = (Date) s1.getAttribute("currentDate");
		
		HttpSession s = request.getSession();
		Transportservicereq ap = (Transportservicereq) s.getAttribute("GoForPayment");
		
		Studenttransportfees st=new Studenttransportfees();
		st.setEnrolledstudents(ap.getEnrolledstudents());
		st.setPaidFees(paid);
		st.setPaymentDate(d);
		
		bl.storeTransportFees(st);
		
	}

}
