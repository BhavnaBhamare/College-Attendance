package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerADMIN;
import com.pojo.Enrolledstudents;
import com.pojo.Loginstudentteacher;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class AuthLogin
 */
@WebServlet("/AuthLogin")
public class AuthLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthLogin() {
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
		
		String email=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println(email+"   "+password);
		
		
		BlManagerADMIN bl=new BlManagerADMIN();
		
		Teacherdetail td= bl.CheckEmailTeacher(email,password);
		Enrolledstudents stud=bl.CheckEnrollStudent(email); 
		
		Loginstudentteacher es=bl.checkStudentLogin(stud,password);
		
		Loginstudentteacher adminlogin=bl.CheckAdminLOgin(email,password);
		
		
		if( td!=null && es==null && adminlogin==null)
		{
			//teacherDetails Table
			HttpSession session=request.getSession();
			session.setAttribute("teacherLogin", td);
			response.sendRedirect("TEACHERDASH.jsp");			
			System.out.println("Teacher");  
			
		}
		else if(adminlogin!=null && es==null && td==null){
			
			//Loginstudentteacher table
			HttpSession session=request.getSession();
			session.setAttribute("adminLogin", adminlogin);	
			response.sendRedirect("ADMINDASH.jsp");	
			
			System.out.println("admin");
		}
		//else if(es!=null && td==null && adminlogin==null && stud.getApplicationforadmission().getAddress().getMobileNumber().equals(Long.parseLong(password))){
		else if(td==null && adminlogin==null && stud.getApplicationforadmission().getApplicatantEmailId().equals(email) &&stud.getApplicationforadmission().getAddress().getMobileNumber().equals(Long.parseLong(password))){
				
		//enrollstudent table
			HttpSession session=request.getSession();
			session.setAttribute("studentLogin", stud);	
			response.sendRedirect("STUDENTDASH.jsp");
			System.out.println("Student");
		}
		
		else{
			
			response.sendRedirect("page_404.html");
		}
		
		
	}

}
