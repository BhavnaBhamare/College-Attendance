package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerADMIN;
import com.pojo.Collegeemployee;

/**
 * Servlet implementation class newEmployeeServ
 */
@WebServlet("/newEmployeeServ")
public class newEmployeeServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newEmployeeServ() {
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
		
	String ename=request.getParameter("ename");
	String eaddress=request.getParameter("eaddress");
	String emob1=request.getParameter("emob1");
	String emob2=request.getParameter("emob2");
	String esubject=request.getParameter("esubject");
	String edept=request.getParameter("edept");
	String ejoindate=request.getParameter("ejoindate");
	
	Date date1 = null;
	
	try {
		date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ejoindate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	String epancardnumber=request.getParameter("epancardnumber");
	String bankaccnumber=request.getParameter("bankaccnumber");
	String bankname=request.getParameter("bankname");
	
	
	Collegeemployee cg=new Collegeemployee();
	
	cg.setEmpName(ename);
	cg.setEmpAddress(eaddress);
	cg.setEmpMobNo(Long.parseLong(emob1));
	cg.setEmpMobNo2(Long.parseLong(emob2));
	cg.setEmpSubject(esubject);
	cg.setEmpDept(edept);
	cg.setEmpJoinDate(date1);
	cg.setEmpPanNumber(Long.parseLong(epancardnumber));
	cg.setEmpBankAccNumber(bankaccnumber);
	cg.setEmpBankName(bankname);
	
	
	BlManagerADMIN bladmin=new BlManagerADMIN();
	
	bladmin.saveAdmin(cg);
	
	
	response.sendRedirect("EmployeeADD.jsp");
		
		
		
	}

}
