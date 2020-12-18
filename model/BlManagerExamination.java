package com.model;


import java.util.List;

import javax.security.auth.Subject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Applicationforadmission;
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Currentstudentinfo;
import com.pojo.Dance;
import com.pojo.Enrolledstudents;
import com.pojo.Examtimetable;
import com.pojo.Invigilationduties;
import com.pojo.Music;
import com.pojo.Registration;
import com.pojo.Results;
import com.pojo.Sports;
import com.pojo.Studentfees;
import com.pojo.Subjects;
import com.pojo.Teacherdetail;


public class BlManagerExamination {
	
	SessionFactory sf = Hibernateutil.getSessionFactory();

	public Enrolledstudents SearchEnrolledStudent(String enrollId) {
	 
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("enrollmentNumber", enrollId));
		Enrolledstudents Eid = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		s.close();
		return Eid;
		
	}

	public Studentfees SearchStufees(Enrolledstudents er) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Studentfees.class);
		cr.add(Restrictions.eq("enrolledstudents", er));
		Studentfees Eid = (Studentfees) cr.uniqueResult();
		t.commit();
		s.close();
		return Eid;
		
	}

	public Currentstudentinfo searchcurrentinfo(Enrolledstudents er) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Currentstudentinfo.class);
		cr.add(Restrictions.eq("enrolledstudents", er));
		Currentstudentinfo crid = (Currentstudentinfo) cr.uniqueResult();
		t.commit();
		s.close();
		return crid;
	}

	public void renewinfo(Currentstudentinfo cr) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(cr);
		t.commit();
		s.close();
	}

	public Enrolledstudents SearchEnrolledStudentbyid(int enroll) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("enrolledId", enroll));
		Enrolledstudents erid = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		s.close();
		return erid;
	}
	
//	------------------------------------------------d method----------------
	public Applicationforadmission getStudentDetails(
			Integer integer) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("applicationId", integer));
		Applicationforadmission StudentDetail = (Applicationforadmission) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentDetail;
	}
	

	
	

	public Branch getStudentBranchDetail(int studentBranchId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Branch.class);
		cr.add(Restrictions.eq("branchId", studentBranchId));
		Branch StudentBranchDetail = (Branch) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentBranchDetail;
	}

	public Course getStudentCourseDetail(int studentCourseId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseId", studentCourseId));
		Course StudentCourseDetail = (Course) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentCourseDetail;
	}

	public List<Studentfees> Searchbysem(String sem, Branch brch) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Studentfees.class);
		cr.add(Restrictions.eq("branch", brch));
		
		cr.add(Restrictions.eq("semester", sem));
		
		List<Studentfees> dlist = cr.list();
		t.commit();
		s.close();
		return dlist;
	}

	public Branch SearchbybranchName(String branch) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Branch.class);
		cr.add(Restrictions.eq("branchName", branch));
		Branch Studentbranch = (Branch) cr.uniqueResult();
		t.commit();
		s.close();
		return Studentbranch;
	}

	public void Updatestuinfo(Currentstudentinfo crs) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Currentstudentinfo.class);
		//cr.add(Restrictions.eq("enrolledId", enroll));
		s.update(crs);
		/*s.flush();
		s.clear();*/
		t.commit();
		s.close();

	}

	public Currentstudentinfo searchstuidbyenroll(Enrolledstudents ers) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Currentstudentinfo.class);
		cr.add(Restrictions.eq("enrolledstudents", ers));
		Currentstudentinfo Studentinfo = (Currentstudentinfo) cr.uniqueResult();
		t.commit();
		s.close();
		return Studentinfo;
	}

	public Applicationforadmission Searchbyappid(Integer appid) {
		// TODO Auto-generated method stub
				Session s = sf.openSession();
				Transaction t = s.beginTransaction();
				Criteria cr = s.createCriteria(Applicationforadmission.class);
				cr.add(Restrictions.eq("applicationId", appid));
				Applicationforadmission StudentDetail = (Applicationforadmission) cr.uniqueResult();
				t.commit();
				s.close();
				return StudentDetail;
	}

	public void savetoapp(Applicationforadmission appadd2) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(appadd2);
		t.commit();
		s.close();
	}

	public Registration searchbyregrstration(Integer regid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("regId", regid));
		Registration Regid = (Registration) cr.uniqueResult();
		t.commit();
		s.close();
		return Regid;
	}

	public com.pojo.Course SearchbycourseName(String course) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseName", course));
		Course StudentCourse = (Course) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentCourse;
	}

	public List<Subjects> Searchforsubject(Course crs, Branch brch, int sem) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Subjects.class);
		cr.add(Restrictions.eq("branch", brch));
		
		cr.add(Restrictions.eq("semester", sem));
		cr.add(Restrictions.eq("course", crs));
		
		
		List<Subjects> subjectlist = cr.list();
		t.commit();
		s.close();
		return subjectlist;
	}

	public Enrolledstudents SearchbyEnrollNo(String enrollId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("enrollmentNumber", enrollId));
		Enrolledstudents StudentEnrolldid = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentEnrolldid;
	}

	public void InsertSports(Sports sp) {
		// TODO Auto-generated method stub
		
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(sp);
		t.commit();
		s.close();
		
	}

	public void InsertDance(Dance dn) {
		// TODO Auto-generated method stub
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(dn);
		t.commit();
		s.close();
		
	}

	public void InsertMusic(Music ms) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ms);
		t.commit();
		s.close();
	}

	
	public List<Sports> listsports() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Sports.class);
		
		
		List<Sports> slist = cr.list();
		t.commit();
		s.close();
		return slist;
	}

	
	public List<Dance> listDance() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Dance.class);
		
		
		List<Dance> dlist = cr.list();
		t.commit();
		s.close();
		return dlist;
	}
	
	
	
	public List<Music> listMusic() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Music.class);
		
		
		List<Music> mlist = cr.list();
		t.commit();
		s.close();
		return mlist;
	}

	public void generatetimetable(Examtimetable extime) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(extime);
		t.commit();
		s.close();
		
	}

	public Subjects getsubdetails(int subid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Subjects.class);
		cr.add(Restrictions.eq("subId", subid));
		Subjects StudentsubDetail = (Subjects) cr.uniqueResult();
		t.commit();
		s.close();
		return StudentsubDetail;
	}

	public List<Examtimetable> searchlistforview(Branch br, Course cour, int sem1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Examtimetable.class);
		cr.add(Restrictions.eq("branch", br));
		cr.add(Restrictions.eq("course", cour));
		cr.add(Restrictions.eq("semester", sem1));
		List<Examtimetable> mlist = cr.list();
		
		return mlist;
	}

	public Currentstudentinfo Searchsemester(Enrolledstudents er) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Currentstudentinfo.class);
		cr.add(Restrictions.eq("enrolledstudents", er));
		Currentstudentinfo Studentsem = (Currentstudentinfo) cr.uniqueResult();
		return Studentsem;
	}

	public List<Examtimetable> AdminlistExTimeTable(Course crs, Branch brch,
			int sem, String examType) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Examtimetable.class);
		cr.add(Restrictions.eq("branch", brch));
		
		cr.add(Restrictions.eq("semester", sem));
		cr.add(Restrictions.eq("course", crs));
		cr.add(Restrictions.eq("exType", examType));
		
		
		List<Examtimetable> subjectlist = cr.list();
		t.commit();
		s.close();
		return subjectlist;
	}

	public Teacherdetail searchbyTeacherid(int teacherid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Teacherdetail.class);
		cr.add(Restrictions.eq("teacherId", teacherid));
		Teacherdetail tid = (Teacherdetail) cr.uniqueResult();
		return tid;
	}

	public List<Subjects> searchteachersub(Teacherdetail tds) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Subjects.class);
		cr.add(Restrictions.eq("teacherdetail", tds));
		List<Subjects> subjectlist = cr.list();
		t.commit();
		s.close();
		return subjectlist;
	}

	public Subjects seachsubid(int subid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Subjects.class);
		cr.add(Restrictions.eq("subId", subid));
		Subjects tid = (Subjects) cr.uniqueResult();
		t.commit();
		s.close();
		return tid;
	}

	public Course searchcourse(int courseid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseId", courseid));
		Course cid = (Course) cr.uniqueResult();
		t.commit();
		s.close();
		return cid;
	}

	public Branch searchbranch(int branchid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Branch.class);
		cr.add(Restrictions.eq("branchId", branchid));
		Branch bid = (Branch) cr.uniqueResult();
		t.commit();
		s.close();
		return bid;
	}

	public List<Enrolledstudents> marksstulist(Course crs, Branch brch, int sem) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("branch", brch));
		
		cr.add(Restrictions.eq("semester", sem));
		cr.add(Restrictions.eq("course", crs));
		
		
		
		List<Enrolledstudents> stulist = cr.list();
		t.commit();
		s.close();
		return stulist;
	}

	public void saveresults(Results rs) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(rs);
		t.commit();
		s.close();
		
	}

	public Enrolledstudents SearchbyErollno(int enrollno) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("enrolledId", enrollno));
		Enrolledstudents bid = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		s.close();
		return bid;
	}

	
	public List<Teacherdetail> SearchAllTeacher() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Teacherdetail.class);
		
		
		List<Teacherdetail> tlist = cr.list();
		t.commit();
		s.close();
		return tlist;
	}

	public Examtimetable searchexid(int exid) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Examtimetable.class);
		cr.add(Restrictions.eq("examTimeTableId", exid));
		Examtimetable bid = (Examtimetable) cr.uniqueResult();
		t.commit();
		s.close();
		return bid;
	}

	public Teacherdetail searchbyteacherName(String tname) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Teacherdetail.class);
		cr.add(Restrictions.eq("tcherFirstName", tname));
		Teacherdetail tnameid = (Teacherdetail) cr.uniqueResult();
		t.commit();
		s.close();
		return tnameid;
	}

	public void saveExamDuties(Invigilationduties duty) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(duty);
		t.commit();
		s.close();
	}

	public List<Invigilationduties> searchteacherdutylist(Teacherdetail tds) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Invigilationduties.class);
		cr.add(Restrictions.eq("teacherdetail", tds));
		List<Invigilationduties> list = cr.list();
		t.commit();
		s.close();
		return list;
	}



}
