package com.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLmanager;
import com.pojo.Examtransaction;
import com.pojo.Examtype;
import com.pojo.Studentdetail;
import com.pojo.Subject;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class UpdateExamTransaction
 */
@WebServlet("/UpdateExamTransaction")
public class UpdateExamTransaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	BLmanager bLmanager=new BLmanager();
	Examtransaction extr=new Examtransaction();
	
    public UpdateExamTransaction() {
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
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		String Email = (String) session.getAttribute("Email");
		System.out.println("Email=" + Email);

		Teacherdetail eid = bLmanager.searchByLoginId(Email);
		System.out.println("eid " + eid);
		
		int id=Integer.parseInt(request.getParameter("studId"));
		System.out.println("id "+id);
		
		String className=request.getParameter("className");
		String divName=request.getParameter("divName");
		
		String date=request.getParameter("examTransDate");
		int examTransId=Integer.parseInt(request.getParameter("examTransId"));
		int obThMarks=Integer.parseInt(request.getParameter("examTransThObtMark"));
		int toThMarks=Integer.parseInt(request.getParameter("examTransThOutOfMark"));
		int obPrMarks=Integer.parseInt(request.getParameter("examTransPractObtMark"));
		int toPrMarks=Integer.parseInt(request.getParameter("examTransPractOutOfMark"));
		int toObMarks=Integer.parseInt(request.getParameter("examTransTotalObtMark"));
		int toMarks=Integer.parseInt(request.getParameter("examTransTotalOutOfMark"));
		double toPercMarks=Double.parseDouble(request.getParameter("examTransPercentage"));
		
		int subjectId=Integer.parseInt(request.getParameter("subjectName"));
		int examTypeId=Integer.parseInt(request.getParameter("examType"));
						
		System.out.println(subjectId+" "+examTypeId);
		
		extr.setExamTransDate(Date.valueOf(date));
		extr.setExamTransThObtMark(obThMarks);
		extr.setExamTransThOutOfMark(toThMarks);
		extr.setExamTransPractObtMark(obPrMarks);
		extr.setExamTransPractOutOfMark(toPrMarks);
		extr.setExamTransTotalObtMark(toObMarks);
		extr.setExamTransTotalOutOfMark(toMarks);
		extr.setExamTransPercentage(toPercMarks);
		
		Studentdetail sd=bLmanager.searchBystudId(id);
		
		System.out.println(sd.getStudName());
		
		Subject sb=bLmanager.searchSubject(subjectId);
		Examtype exTp=bLmanager.searchExamType(examTypeId);
		
		extr.setExamTransId(examTransId);
		extr.setExamtype(exTp);
		extr.setSubject(sb);
		extr.setStudentdetail(sd);
		extr.setTeacherdetail(eid);
		
		bLmanager.updateExamTransaction(extr);
		
		response.sendRedirect("updateMarks.jsp?className="+className+"&divName="+divName+"&examType="+examTypeId+"&subjectName="+subjectId);
	}

}
