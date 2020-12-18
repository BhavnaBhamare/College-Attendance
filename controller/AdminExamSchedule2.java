package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.pojo.Examtimetable;
import com.pojo.Studentfees;
import com.pojo.Subjects;

/**
 * Servlet implementation class AdminExamSchedule2
 */
@WebServlet("/AdminExamSchedule2")
public class AdminExamSchedule2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Branch brch = new Branch();
	
	Course crs = new Course();
    Subjects sb = new Subjects();  
    
    Examtimetable Extime = new Examtimetable();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminExamSchedule2() {
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
		
		
		String exdate[] = request.getParameterValues("date");
		String extime[] = request.getParameterValues("time");
		 HttpSession session = request.getSession();
		 List<Subjects> stusub= (List<Subjects>) session
					.getAttribute("stusub");
		
		 Subjects size = stusub.get(stusub.size() - 1);
		 System.out.println(size);
			Iterator ir = stusub.iterator();
			int i = 0;
			while (ir.hasNext()) {
				i++;
				ir.next();
			}
			System.out.println(i);
			for (int k = 0; k < i; k++) {
				
				
				Integer sem= stusub.get(k).getSemester();
				String subcode= stusub.get(k).getSubCode();
				String subname= stusub.get(k).getSubName();
				int branchid=stusub.get(k).getBranch().getBranchId();
				int courseid = stusub.get(k).getCourse().getCourseId();
				int subid= stusub.get(k).getSubId();
				 String extypes= (String) session.getAttribute("extype");
				String exdd= exdate[k];
				String extim = extime[k];
				Extime.setSemester(sem);
				Extime.setSubCode(subcode);
				Extime.setSubName(subname);
				brch=Bl.getStudentBranchDetail(branchid);
				Extime.setBranch(brch);
				crs = Bl.getStudentCourseDetail(courseid);
				Extime.setCourse(crs);
			sb = Bl.getsubdetails(subid);
				Extime.setSubjects(sb);
				Extime.setExType(extypes);
				
				SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
				Date date;
				try {
					date = formatter.parse(exdd);
					Extime.setExdate(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Extime.setExTime(extim);
				
				
				
				
				
				Bl.generatetimetable(Extime);
				
				
				
				
				
				
				
			}
		response.sendRedirect("AdminExTimeTable1.jsp");
	}

}
