package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Applicationforadmission;
import com.pojo.Attendencetype;
import com.pojo.Collegeemployee;
import com.pojo.Enrolledstudents;
import com.pojo.Events;
import com.pojo.Holidays;
import com.pojo.Hostelregistration;
import com.pojo.Loginstudentteacher;
import com.pojo.Teacher;
import com.pojo.Teacherattendance;
import com.pojo.Teacherdetail;

public class BlManagerADMIN {

	SessionFactory sf = Hibernateutil.getSessionFactory();

	public Teacherdetail CheckEmailTeacher(String email, String password) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Teacherdetail.class);
		cr.add(Restrictions.eq("tcherEmailId", email));
		cr.add(Restrictions.eq("tcherPassword", password));

		Teacherdetail t = (Teacherdetail) cr.uniqueResult();

		return t;
	}

	public Enrolledstudents CheckEnrollStudent(String email) {
		Session s = sf.openSession();

		Criteria cr2 = s.createCriteria(Applicationforadmission.class);
		cr2.add(Restrictions.eq("applicatantEmailId", email));
		Applicationforadmission ap = (Applicationforadmission) cr2.uniqueResult();

		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("applicationforadmission", ap));
		Enrolledstudents t = (Enrolledstudents) cr.uniqueResult();

		/*
		 * Criteria cr1=s.createCriteria(Loginstudentteacher.class);
		 * cr1.add(Restrictions.eq("enrolledstudents", t));
		 * cr1.add(Restrictions.eq("password",password)); Loginstudentteacher
		 * lt=(Loginstudentteacher) cr1.uniqueResult();
		 */

		return t;
	}

	public Loginstudentteacher CheckAdminLOgin(String email, String password) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Loginstudentteacher.class);
		cr.add(Restrictions.eq("adminEmail", email));
		cr.add(Restrictions.eq("password", password));
		Loginstudentteacher t = (Loginstudentteacher) cr.uniqueResult();
		return t;
	}

	public void InsertHolidays(Holidays hd) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(hd);
		t.commit();
		s.close();

	}

	public void InsertEvents(Events e) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();

	}

	public List<Holidays> HolidayList() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Holidays.class);
		List<Holidays> l = cr.list();
		return l;
	}

	public List<Events> EventList() {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Events.class);
		List<Events> l = cr.list();
		return l;
	}

	public Loginstudentteacher checkStudentLogin(Enrolledstudents stud, String password) {
		Session s = sf.openSession();

		Criteria cr1 = s.createCriteria(Loginstudentteacher.class);
		cr1.add(Restrictions.eq("enrolledstudents", stud));
		cr1.add(Restrictions.eq("password", password));
		Loginstudentteacher lt = (Loginstudentteacher) cr1.uniqueResult();
		return lt;
	}

	public void saveAdmin(Collegeemployee cg) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(cg);
		t.commit();
		s.close();

	}

	public List<Collegeemployee> collegeEmployeeList() {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Collegeemployee.class);
		List<Collegeemployee> l = cr.list();
		return l;
	}

	public List<Teacherdetail> teacherDetailsList() {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Teacherdetail.class);
		List<Teacherdetail> l = cr.list();
		return l;
	}

	public Attendencetype getattendancetype(String attendanceType) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Attendencetype.class);

		cr.add(Restrictions.eq("attendenceType", attendanceType));
		Attendencetype h = (Attendencetype) cr.uniqueResult();
		return h;
	}

	public Teacherdetail getTeacherbyId(int id) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Teacherdetail.class);

		cr.add(Restrictions.eq("teacherId", id));
		Teacherdetail h = (Teacherdetail) cr.uniqueResult();
		return h;
	}

	public void saveTeacherAttendance(Teacherattendance ta) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ta);
		t.commit();
		s.close();
		
	}

}
