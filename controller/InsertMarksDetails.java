package com.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.model.BlManagerExamination;
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Enrolledstudents;
import com.pojo.Examtimetable;
import com.pojo.Results;
import com.pojo.Studentfees;
import com.pojo.Subjects;

/**
 * Servlet implementation class InsertMarksDetails
 */
@WebServlet("/InsertMarksDetails")
public class InsertMarksDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Branch brch = new Branch();
	
	Course crs = new Course();
    Subjects sb = new Subjects();  
    Enrolledstudents er = new Enrolledstudents();
    Examtimetable Extime = new Examtimetable();
    Results rs = new Results();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMarksDetails() {
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
	
		
		
		
		
		HttpSession session1 = request.getSession();
		@SuppressWarnings("unchecked")
		List<Enrolledstudents> updatedList = (List<Enrolledstudents>) session1
				.getAttribute("enrollstu");
		Enrolledstudents size = updatedList.get(updatedList.size() - 1);
		
		
		
		HttpSession session2 = request.getSession();
		sb=(Subjects) session2.getAttribute("sub");
		
		Iterator ir = updatedList.iterator();
		int i = 0;
		while (ir.hasNext()) {
			i++;
			ir.next();
		}
		//int Year = 2027;
		String ObtainMark[] = request.getParameterValues("ObtainMarks");
		String totalMark[] = request.getParameterValues("TotalMarks");
		String result[] = request.getParameterValues("results");
		System.out.println(i);
		for (int k = 0; k < i; k++) {
			
			int enrollno=updatedList.get(k).getEnrolledId();
			er=Bl.SearchbyErollno(enrollno);
			double obmark= (Double.parseDouble(ObtainMark[k]));
			double totalmark= (Double.parseDouble(totalMark[k]));
			String res= result[k];
			
			rs.setEnrolledstudents(er);
			
			System.out.println(obmark);
			rs.setObtainMarks(obmark);
			
			rs.setSubjects(sb);
			System.out.println(totalmark);
			rs.setTotalMarks(totalmark);
			
			
			rs.setResults(res);
			
			
			Bl.saveresults(rs);
			
			
		}
		response.sendRedirect("TeacherSubList.jsp");

	}
		
		
		
	

}
