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
import com.pojo.Invigilationduties;
import com.pojo.Results;
import com.pojo.Subjects;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class AddDuties2
 */
@WebServlet("/AddDuties2")
public class AddDuties2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BlManagerExamination Bl = new BlManagerExamination();
	Teacherdetail td = new Teacherdetail();
    Subjects sb = new Subjects();  
    Enrolledstudents er = new Enrolledstudents();
    Examtimetable Extime = new Examtimetable();
    Results rs = new Results();
    
    Invigilationduties duty = new Invigilationduties();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDuties2() {
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
		
		
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<Examtimetable> ExTable = (List<Examtimetable>) session
				.getAttribute("Timetabledetails");
		Examtimetable size = ExTable.get(ExTable.size() - 1);
		Iterator ir = ExTable.iterator();
		int i = 0;
		while (ir.hasNext()) {
			i++;
			ir.next();
		}
		//int Year = 2027;
		String Building[] = request.getParameterValues("Building");
		String RoomNo[] = request.getParameterValues("RoomNo");
		String Teachername[] = request.getParameterValues("Teachername");
		System.out.println(i);
		for (int k = 0; k < i; k++) {
			
			int Exid=ExTable.get(k).getExamTimeTableId();
			Extime= Bl.searchexid(Exid);
			
			String Tname= Teachername[k];
			td = Bl.searchbyteacherName(Tname);
			
			String building= Building[k];
			
			int roomno = Integer.parseInt(RoomNo[k]);
			
			duty.setExamtimetable(Extime);
			duty.setBuilding(building);
			duty.setRoomNo(roomno);
			duty.setTeacherdetail(td);
			
			Bl.saveExamDuties(duty);
			
			
		}
		response.sendRedirect("AdminAddDuties1.jsp");

	}
	

}
