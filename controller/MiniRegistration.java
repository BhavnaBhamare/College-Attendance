package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;





import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.model.BlManagerAdmission;
import com.pojo.Registration;

/**
 * Servlet implementation class MiniRegistration
 */
@WebServlet("/MiniRegistration")
public class MiniRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerAdmission bl=new BlManagerAdmission();
	Registration r=new Registration();
	Registration r1=new Registration();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiniRegistration() {
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
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("firstname");
		String middleName = request.getParameter("middlename");
		String lastName = request.getParameter("lastname");
		String gender = request.getParameter("gender"); 		
		String birthDate = request.getParameter("birthdate");
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		Date d = null;
		try {
			d = (Date) df.parse(birthDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String emailId = request.getParameter("emailid");
		String mobilenumber = request.getParameter("mobilenumber");
		Long mobileNumber=Long.parseLong(mobilenumber);
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmpassword");
		String securityQuestion = request.getParameter("securityquestion");
		String answer = request.getParameter("answer");
		
		r.setRegFirstName(firstName);
		r.setRegMiddleName(middleName);
		r.setRegLastName(lastName);
		r.setRegGender(gender);
		r.setRegDob(d);
		r.setRegPrimaryEmailId(emailId);
		r.setRegPhoneNumber(mobileNumber);
		r.setRegPassword(password);
		r.setRegConfirmPassword(confirmPassword);
		r.setRegSecurityQuestion(securityQuestion);
		r.setRegAnswer(answer);
		
		int StoredregId=bl.InsertRegistration(r);
		
		r1=bl.fetchstoredstudent(StoredregId);
		String StudentFName=r1.getRegFirstName();
		
		
		HttpSession s3=request.getSession();
		s3.setAttribute("RegisteredStudentFName", StudentFName);
		
		HttpSession s1=request.getSession();
		s1.setAttribute("RegisteredStudent", r1);
		
		response.sendRedirect("StudentDashBoardAfterRegistration.jsp");
		
	}

}
