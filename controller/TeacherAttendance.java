package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerADMIN;
import com.pojo.Attendencetype;
import com.pojo.Teacherattendance;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class TeacherAttendance
 */
@WebServlet("/TeacherAttendance")
public class TeacherAttendance extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		
		Teacherdetail hreg = new Teacherdetail();
		Teacherdetail hreg1 = new Teacherdetail();

		HttpSession session4 = request.getSession();
		List<Teacherdetail> teacherDetailsList = (List<Teacherdetail>) session4.getAttribute("teacherDetailsList");

		
		String[] attendanceId = request.getParameterValues("attendance");

		String AttendanceType = request.getParameter("AttendanceType");
		System.out.println(AttendanceType);

		BlManagerADMIN bl = new BlManagerADMIN();
		Attendencetype at = new Attendencetype();
		Attendencetype at1 = new Attendencetype();

		at = bl.getattendancetype(AttendanceType);

		if (at.getAttendenceType().equalsIgnoreCase("Present")) {

			if (attendanceId != null) {

				for (int a = 0; a < teacherDetailsList.size(); a++) {
					for (int i = 0; i < attendanceId.length; i++) {

						if (teacherDetailsList.get(a).getTeacherId() == (Integer.parseInt(attendanceId[i]))) {

							System.out.println(teacherDetailsList.get(a).getTeacherId());
							System.out.println(attendanceId[i]);
							
							
							hreg = bl.getTeacherbyId(Integer.parseInt(attendanceId[i]));

							Teacherattendance ta = new Teacherattendance();
							ta.setAttendencetype(at);

							ta.setTeacherdetail(hreg);
							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ta.setAttendDateAndTime(dateobj);

							bl.saveTeacherAttendance(ta);
							
							System.out.println(ta.getTeacherdetail().getTeacherId()+"  "+"Present");
						}

						else if (teacherDetailsList.get(a).getTeacherId() != (Integer.parseInt(attendanceId[i]))) {

							System.out.println(teacherDetailsList.get(a).getTeacherId());
							System.out.println(attendanceId[i]);
							
							
							String AttendanceTypeAb = "Absent";
							at1 = bl.getattendancetype(AttendanceTypeAb);

							hreg1 = bl.getTeacherbyId((teacherDetailsList.get(a).getTeacherId()));

							Teacherattendance ht1 = new Teacherattendance();
							ht1.setTeacherdetail(hreg1);
							ht1.setAttendencetype(at1);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht1.setAttendDateAndTime(dateobj);

							bl.saveTeacherAttendance(ht1);  
							
							System.out.println(ht1.getTeacherdetail().getTeacherId()+"  "+"Absent");
							
						}

					}
				}
			}
		}

		/*if (at.getAttendenceType().equalsIgnoreCase("Absent")) {

			if (attendanceId != null) {

				for (int a = 0; a < teacherDetailsList.size(); a++) {
					for (int i = 0; i < attendanceId.length; i++) {

						if (teacherDetailsList.get(a).getTeacherId() == (Integer.parseInt(attendanceId[i]))) {

							hreg = bl.getTeacherbyId(Integer.parseInt(attendanceId[i]));

							Teacherattendance ta1 = new Teacherattendance();
							ta1.setAttendencetype(at);

							ta1.setTeacherdetail(hreg);
							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ta1.setAttendDateAndTime(dateobj);

							bl.saveTeacherAttendance(ta1);
						}

						else if (teacherDetailsList.get(a).getTeacherId() != (Integer.parseInt(attendanceId[i]))) {

							String AttendanceTypeAb = "Present";
							at1 = bl.getattendancetype(AttendanceTypeAb);

							hreg1 = bl.getTeacherbyId((teacherDetailsList.get(a).getTeacherId()));

							Teacherattendance ht2 = new Teacherattendance();
							ht2.setTeacherdetail(hreg1);
							ht2.setAttendencetype(at1);

							DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
							Date dateobj = new Date();
							ht2.setAttendDateAndTime(dateobj);

							bl.saveTeacherAttendance(ht2);
						}

					}
				}
			}
		}*/
	}
}
