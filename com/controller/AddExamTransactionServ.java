

// by Shailesh Jain 

package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
 * Servlet implementation class AddExamTransactionServ
 */
@WebServlet("/AddExamTransactionServ")
public class AddExamTransactionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Examtransaction extr=new Examtransaction();
	BLmanager bLmanager=new BLmanager();
    public AddExamTransactionServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
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
		Date dt=Date.valueOf(date);
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
		
		
		
		Studentdetail sd=bLmanager.searchBystudId(id);
		Subject sb=bLmanager.searchSubject(subjectId);
		Examtype exTp=bLmanager.searchExamType(examTypeId);
		
		
		
			
		
		
		extr.setExamTransDate(dt);
		extr.setExamTransThObtMark(obThMarks);
		extr.setExamTransThOutOfMark(toThMarks);
		extr.setExamTransPractObtMark(obPrMarks);
		extr.setExamTransPractOutOfMark(toPrMarks);
		extr.setExamTransTotalObtMark(toObMarks);
		extr.setExamTransTotalOutOfMark(toMarks);
		extr.setExamTransPercentage(toPercMarks);
		extr.setExamtype(exTp);
		extr.setSubject(sb);
		extr.setStudentdetail(sd);
		extr.setTeacherdetail(eid);
		
		bLmanager.insertExamTransaction(extr);
		
		
		
		/*response.sendRedirect("addExamTransaction.jsp?id="+id);*/
		
		response.sendRedirect("viewStudListbyClass.jsp?className="+className+"&divName="+divName);
			
		}
	}


