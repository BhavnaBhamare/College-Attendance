package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLmanager;
import com.pojo.Department;
import com.pojo.Subject;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class AddTeacherDetailServ
 */
@WebServlet("/AddTeacherDetailServ")
public class AddTeacherDetailServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BLmanager bl=new BLmanager();
	Teacherdetail tech=new Teacherdetail();
	Subject sub=new Subject();
	Department dept=new Department();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacherDetailServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String tcherFirstName=request.getParameter("tcherFirstName");
		String tcherMiddleName=request.getParameter("tcherMiddleName");
		String tcherLastName=request.getParameter("tcherLastName");
		String tcherEmailId=request.getParameter("tcherEmailId");
		String tcherPassword=request.getParameter("tcherPassword");
		String tcherGender=request.getParameter("tcherGender");
		String tcherPhoneNumber=request.getParameter("tcherPhoneNumber");
		String tcherQualification=request.getParameter("tcherQualification");
		String tcherPreviousCollegeName=request.getParameter("tcherPreviousCollegeName");
		String tcherExperience=request.getParameter("tcherExperience");
		String tcherSalary=request.getParameter("tcherSalary");
		String tcherPeremanantAddress=request.getParameter("tcherPeremanantAddress");
		String subjectName=request.getParameter("subjectName");
		String departmentName=request.getParameter("departmentName");
		
		tech.setTcherFirstName(tcherFirstName);
		tech.setTcherMiddleName(tcherMiddleName);
		tech.setTcherLastName(tcherLastName);
		tech.setTcherEmailId(tcherEmailId);
		tech.setTcherPassword(tcherPassword);
		tech.setTcherGender(tcherGender);
		tech.setTcherPhoneNumber(tcherPhoneNumber);
		tech.setTcherQualification(tcherQualification);
		tech.setTcherPreviousCollegeName(tcherPreviousCollegeName);
		tech.setTcherExperience(tcherExperience);
		tech.setTcherSalary(Double.valueOf(tcherSalary));
		tech.setTcherPeremanantAddress(tcherPeremanantAddress);
		
		sub=bl.searchSubject(subjectName);
		tech.setSubject(sub);
		
		dept=bl.searchDept(departmentName);
		
		
		
		tech.setDepartment(dept);
		
		
		
		bl.insertTeacherInfo(tech);
		
		
		
		
		
		
		
		
		
		
	}

}
