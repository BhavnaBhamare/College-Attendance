package com.model;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Assignment;
import com.pojo.Attendance;
import com.pojo.Classdetail;
import com.pojo.Department;
import com.pojo.Division;
import com.pojo.Examtransaction;
import com.pojo.Examtype;
import com.pojo.Notice;
import com.pojo.Studentdetail;
import com.pojo.Subject;
import com.pojo.Syllabus;
import com.pojo.Teacherdetail;
import com.pojo.Timetable;

public class BLmanager {

	SessionFactory sf = new Configuration().configure().buildSessionFactory();

	public boolean authenticate(String tcherEmailId, String tcherPassword, String rol) {

		Teacherdetail val = searchByLoginId(tcherEmailId);

		if (val.getTcherEmailId().equals(tcherEmailId) && val.getTcherPassword().equals(tcherPassword)
				&& val.getDepartment().getDepartmentName().equals(rol)) {
			return true;
		} else {
			return false;
		}
	}

	public Teacherdetail searchByLoginId(String tcherEmailId) {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Teacherdetail.class);
		criteria.add(Restrictions.eq("tcherEmailId", tcherEmailId));

		Teacherdetail t = (Teacherdetail) criteria.uniqueResult();
		return t;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> searchBySubjectList() {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Subject.class);
		List<Subject> t = criteria.list();
		return t;
	}

	@SuppressWarnings("unchecked")
	public List<Department> searchByDepartmentList() {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Department.class);
		List<Department> t = criteria.list();
		return t;
	}

	public void insertTeacherInfo(Teacherdetail tech) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(tech);
		transaction.commit();
		session.close();

	}

	public Subject searchSubject(String subjectName) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		criteria.add(Restrictions.eq("subjectName", subjectName));
		Subject s = (Subject) criteria.uniqueResult();

		return s;
	}

	public Department searchDept(String departmentName) {
		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Department.class);
		criteria.add(Restrictions.eq("departmentName", departmentName));
		Department d = (Department) criteria.uniqueResult();

		return d;
	}

	// ujjval

	public void insert(Syllabus sy) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(sy);
		transaction.commit();
		session.close();

	}

	public void insertAssi(Assignment assi) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(assi);
		transaction.commit();
		session.close();

	}

	public List<Classdetail> searchData1() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Notice.class);
		@SuppressWarnings("unchecked")
		List<Classdetail> list = criteria.list();
		return list;

	}

	@SuppressWarnings("unchecked")
	public List<Classdetail> searchByclassname() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		List<Classdetail> s1 = criteria.list();

		return s1;

	}

	// Karan

	@SuppressWarnings("unchecked")
	public List<Classdetail> searchByClassList() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		List<Classdetail> c1 = criteria.list();
		return c1;

	}

	// blmanager for attendance
	// show student name.

	// search by div
	public Division searchByDivision(String divname) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Division.class);

		criteria.add(Restrictions.eq("divName", divname));
		Division class1 = (Division) criteria.uniqueResult();

		return class1;
	}

	public Attendance searchByAttndId(int attid) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Attendance.class);
		criteria.add(Restrictions.eq("attndId", attid));
		Attendance att = (Attendance) criteria.uniqueResult();
		return att;
	}

	/*
	 * //searchByclass public Classdetail searchByClass(String cname){ Session
	 * session=sf.openSession(); Criteria
	 * criteria=session.createCriteria(Classdetail.class);
	 * 
	 * criteria.add(Restrictions.eq("className",cname)); Classdetail
	 * class1=(Classdetail) criteria.uniqueResult();
	 * 
	 * return class1;
	 */

	// search student name
	@SuppressWarnings("unchecked")
	public List<Studentdetail> searchStudentName(Classdetail classdetail, Division division) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Studentdetail.class)
				.add(Restrictions.eq("classdetail", classdetail)).add(Restrictions.eq("division", division));

		List<Studentdetail> list = criteria.list();

		System.out.println("bl===" + list);
		return list;
	}

	// search attendance by class and subject
	public Classdetail searchAttndByclass(String attndclass) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		criteria.add(Restrictions.eq("className", attndclass));
		Classdetail d1 = (Classdetail) criteria.uniqueResult();
		session.close();
		return d1;
	}

	// search by studentenroll
	public Studentdetail searchbyEnroll(String enrollstring) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Studentdetail.class);
		criteria.add(Restrictions.eq("studEnrollmentN", enrollstring));

		Studentdetail r1 = (Studentdetail) criteria.uniqueResult();

		return r1;

	}

	// save attendance
	public void saveAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(attendance);
		transaction.commit();
		session.close();

	}

	// search for view attendance class
	public Classdetail searchByAttnd(String cls) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		criteria.add(Restrictions.eq("className", cls));
		Classdetail d1 = (Classdetail) criteria.uniqueResult();
		session.close();

		return d1;

	}

	// search for view Attendance subject
	public Subject searchByAttndBysubject(String attndsub) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		criteria.add(Restrictions.eq("subjectName", attndsub));
		Subject d2 = (Subject) criteria.uniqueResult();
		session.close();
		return d2;
	}

	// search by div list
	@SuppressWarnings("unchecked")
	public List<Division> searchByDivList() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Division.class);
		List<Division> c1 = criteria.list();

		System.out.println(c1);
		return c1;

	}

	// search data as per critera for view date,type,status
	@SuppressWarnings("unchecked")
	public List<Attendance> searchByAttendance(Date date, String type, Subject subject, Classdetail classdetail,
			String status) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Attendance.class);
		criteria.add(Restrictions.eq("attndDate", date)).add(Restrictions.eq("attndType", type))
				.add(Restrictions.eq("subject", subject)).add(Restrictions.eq("classdetail", classdetail))
				.add(Restrictions.eq("attndStaus", status));
		List<Attendance> list1 = criteria.list();

		return list1;
	}

	// Timetable search sub,class
	public Subject searchByTimeTableSubName(String subname) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		criteria.add(Restrictions.eq("subjectName", subname));
		Subject d = (Subject) criteria.uniqueResult();
		session.close();

		return d;

	}

	public Classdetail searchByTimeClassName(String classname) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		criteria.add(Restrictions.eq("className", classname));
		Classdetail d1 = (Classdetail) criteria.uniqueResult();
		session.close();

		return d1;
	}

	public void saveTimetable(Timetable timetable) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(timetable);
		transaction.commit();
		session.close();
	}

	// view Timetable check class
	public Classdetail searchByClass(String cname) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);

		criteria.add(Restrictions.eq("className", cname));
		Classdetail class1 = (Classdetail) criteria.uniqueResult();

		return class1;
	}

	public List<Timetable> selectDataTime(Classdetail classdetail) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Timetable.class).add(Restrictions.eq("classdetail", classdetail));

		List<Timetable> list = criteria.list();
		return list;

	}

	public List<Syllabus> Syllabus() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Syllabus.class);
		@SuppressWarnings("unchecked")
		List<Syllabus> userList = criteria.list();
		return userList;
	}

	public Syllabus searchSyllabus(String syllabusName) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Syllabus.class);
		criteria.add(Restrictions.eq("syllabusName", syllabusName));
		Syllabus syl = (Syllabus) criteria.uniqueResult();

		return syl;
	}

	/* ashwini */
	public void add(Classdetail cs) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(cs);
		transaction.commit();
		session.close();
	}

	public void updateNote(Notice n) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(n);
		transaction.commit();
		session.close();

	}

	public List<Notice> searchData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Notice.class);
		criteria.addOrder(Order.desc("noticeId"));
		@SuppressWarnings("unchecked")
		List<Notice> list = criteria.list();
		return list;

	}

	public Classdetail serclassname(String name) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		criteria.add(Restrictions.eq("className", name));
		Classdetail Mid = (Classdetail) criteria.uniqueResult();
		return Mid;

	}

	public Notice searchbyid(int id1) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Notice.class);
		criteria.add(Restrictions.eq("noticeId", id1));
		Notice Mid = (Notice) criteria.uniqueResult();
		return Mid;
	}

	public void insert(Notice n1) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(n1);
		transaction.commit();
		session.close();

	}

	/* shailesh */
	public Classdetail searchByClassId(int classId){
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Classdetail.class);
		criteria.add(Restrictions.eq("classId", classId));
		Classdetail cd = (Classdetail) criteria.uniqueResult();
		return cd;
		
	}
	
	public Division searchByDivId(int divId) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Division.class);

		criteria.add(Restrictions.eq("divId", divId));
		Division div = (Division) criteria.uniqueResult();

		return div;
	}
	
	public List<Division> viewDivision() {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Division.class);
		List<Division> t = criteria.list();
		s.close();
		return t;
	}
	
	
	public List<Classdetail> viewClassDetails() {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Classdetail.class);
		List<Classdetail> t = criteria.list();
		s.close();
		return t;
	}

	public List<Examtype> viewExamTypeList() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Examtype.class);

		List<Examtype> list = criteria.list();
		session.close();
		return list;
	}

	public void insertExamTransaction(Examtransaction extr) {
		// TODO Auto-generated method stub
		int status = 0;
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(extr);
		transaction.commit();
		session.close();

	}

	public Examtype searchExamType(int examTypeId) {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Examtype.class);
		criteria.add(Restrictions.eq("examTypeId", examTypeId));
		Examtype exTp = (Examtype) criteria.uniqueResult();
		session.close();
		return exTp;

	}

	public Subject searchSubject(int subjectId) {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Subject.class);
		criteria.add(Restrictions.eq("id", subjectId));
		Subject s = (Subject) criteria.uniqueResult();
	//	System.out.println(s.getId());
		session.close();
		return s;
	}

	public List<Studentdetail> seachByStudList(String className, String divName) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Studentdetail.class, "stud");
		cr.createAlias("stud.classdetail", "cls");
		cr.createAlias("stud.division", "dv");

		cr.add(Restrictions.eq("cls.className", className));
		cr.add(Restrictions.eq("dv.divName", divName));

		List<Studentdetail> r = cr.list();
		//s.close();
		return r;

	}

	public List<Studentdetail> viewStudList() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Studentdetail.class);

		List<Studentdetail> list = criteria.list();

		return list;
	}

	public Studentdetail searchBystudId(int id) {
		Session s = sf.openSession();
		Criteria criteria = s.createCriteria(Studentdetail.class);
		criteria.add(Restrictions.eq("studId", id));

		Studentdetail sd = (Studentdetail) criteria.uniqueResult();

		return sd;
	}

	public void insertExamType(Examtype examtype) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(examtype);
		transaction.commit();
		session.close();
	}

	public List<Examtransaction> searchByExamType(int examTypeId, int subjectId, int classId, int divId) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Examtransaction.class, "extr");
		cr.createAlias("extr.examtype", "et");
		cr.createAlias("extr.subject", "sb");
		cr.createAlias("extr.studentdetail", "sdtl");
		cr.createAlias("sdtl.division", "div");
		cr.createAlias("sdtl.classdetail", "cls");

		cr.add(Restrictions.eq("et.examTypeId", examTypeId));
		cr.add(Restrictions.eq("sb.id", subjectId));
		cr.add(Restrictions.eq("cls.classId", classId));
		cr.add(Restrictions.eq("div.divId", divId));
		
		List<Examtransaction> r = cr.list();
		return r;

	}

	public void updateExamTransaction(Examtransaction extr) {
		// TODO Auto-generated method stub
	//	System.out.println(extr.getExamTransDate()+" "+extr.getExamTransId());
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(extr);
		transaction.commit();
		session.close();
	}
	
	public List<Examtransaction> searchMarkListByClass(int examTypeId, int classId, int divId) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Examtransaction.class, "extr");
		cr.createAlias("extr.examtype", "et");
		//cr.createAlias("extr.subject", "sb");
		cr.createAlias("extr.studentdetail", "sdtl");
		cr.createAlias("sdtl.division", "div");
		cr.createAlias("sdtl.classdetail", "cls");

		cr.add(Restrictions.eq("et.examTypeId", examTypeId));
		//cr.add(Restrictions.eq("sb.id", subjectId));
		cr.add(Restrictions.eq("cls.classId", classId));
		cr.add(Restrictions.eq("div.divId", divId));
		
		List<Examtransaction> r = cr.list();
		return r;

	}

	
	public void updateattendance(Attendance attendance) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(attendance);
		transaction.commit();
		session.close();
		
	}
	/*public Attendance searchByAttndId(int attid) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class);
		criteria.add(Restrictions.eq("attndId", attid));
		Attendance att=(Attendance)criteria.uniqueResult();
		return att;
	}*/

	public Attendance searchByAttndid(int aid) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class);
		criteria.add(Restrictions.eq("attndId", aid));
		Attendance att=(Attendance)criteria.uniqueResult();
		return att;
		
	}

	public List<Notice> searchData1(Classdetail s, Date dt) {
		Session session=sf.openSession();
		Criteria critera=session.createCriteria(Notice.class);
		critera.add(Restrictions.eq("classdetail",s)).add(Restrictions.eq("noticeDate", dt));
		List<Notice> l=critera.list();
		return l;
	}

	public void deleteNote(Notice n1) {
		Session session=sf.openSession();
	  Transaction transaction=session.beginTransaction();
	  session.delete(n1);
	  transaction.commit();
	  session.close();
		
	}
//view Assignment
	@SuppressWarnings("unchecked")
	public List<Assignment> searchAssignmentData(String subjectName) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Assignment.class);
		criteria.add(Restrictions.eq("assignSubjectName",subjectName ));
		List<Assignment> l=criteria.list();
		return l;
		
		
		
	}
//view Syllabus
	@SuppressWarnings("unchecked")
	public List<Syllabus> searchSyllabusData(String subjectName) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Syllabus.class);
		criteria.add(Restrictions.eq("syllabusSubject",subjectName ));
		List<Syllabus> l1=criteria.list();
		return l1;
		
	}

	public long countPresent(Date dt, 
			String attndType, String status) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Query query = session.createQuery(
		        "select count(*) from Attendance attendance where attendance.attndDate=:dt  and attendance.attndType=:type and attendance.attndStaus=:st");
		query.setString("dt", "dt");
		//query.setString("cls", "classdetail");
		//query.setString("sub", "subject");
		query.setString("type",attndType);
		query.setString("st", status);
		
		Long count = (Long)query.uniqueResult();
		return count;
	}

	public List<Attendance> countsProj(Date dt, Subject subject,
			Classdetail classdetail, String attndType, String status, Division division) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class,"attnd");
		criteria.add(Restrictions.eq("attndDate", dt));
		criteria.add(Restrictions.eq("classdetail", classdetail));
		criteria.add(Restrictions.eq("subject", subject));
		criteria.add(Restrictions.eq("attndType", attndType));
		criteria.add(Restrictions.eq("attndStaus",status));
		criteria.createAlias("attnd.studentdetail", "stud");
		criteria.add(Restrictions.eq("stud.division",division));
		criteria.setProjection(Projections.rowCount());
		List<Attendance> list=criteria.list();
		return list;
	}

	public List<Attendance> countsProj1(Date dt, Subject subject,
			Classdetail classdetail, String attndType, String statusAb,
			Division division) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class,"attnd");
		criteria.add(Restrictions.eq("attndDate", dt));
		criteria.add(Restrictions.eq("classdetail", classdetail));
		criteria.add(Restrictions.eq("subject", subject));
		criteria.add(Restrictions.eq("attndType", attndType));
		criteria.add(Restrictions.eq("attndStaus",statusAb));
		criteria.createAlias("attnd.studentdetail", "stud");
		criteria.add(Restrictions.eq("stud.division",division));
		criteria.setProjection(Projections.rowCount());
		List<Attendance> list=criteria.list();
		return list;
	}

	public List<Attendance> searchStudePresent(Date dt, Subject subject,
			Classdetail classdetail, String attndType, String status,
			Division division) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class,"attnd");
		criteria.add(Restrictions.eq("attndDate", dt));
		criteria.add(Restrictions.eq("classdetail", classdetail));
		criteria.add(Restrictions.eq("subject", subject));
		criteria.add(Restrictions.eq("attndType", attndType));
		criteria.add(Restrictions.eq("attndStaus",status));
		criteria.createAlias("attnd.studentdetail", "stud");
		criteria.add(Restrictions.eq("stud.division",division));
		List<Attendance> list=criteria.list();
		return list;
		
	}

	public List<Attendance> SearchStudeAbsent(Date dt, Subject subject,
			Classdetail classdetail, String attndType, String statusAb,
			Division division) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Attendance.class,"attnd");
		criteria.add(Restrictions.eq("attndDate", dt));
		criteria.add(Restrictions.eq("classdetail", classdetail));
		criteria.add(Restrictions.eq("subject", subject));
		criteria.add(Restrictions.eq("attndType", attndType));
		criteria.add(Restrictions.eq("attndStaus",statusAb));
		criteria.createAlias("attnd.studentdetail", "stud");
		criteria.add(Restrictions.eq("stud.division",division));
		
		List<Attendance> list=criteria.list();
		return list;
		
	}

	public List<Examtransaction> searchExamList(Studentdetail sd, Subject sb, Examtype exTp,Date dt) {
	
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Examtransaction.class);
		criteria.add(Restrictions.eq("studentdetail", sd));
		criteria.add(Restrictions.eq("subject", sb));
		criteria.add(Restrictions.eq("examtype", exTp));
		criteria.add(Restrictions.eq("examTransDate",dt));
		List<Examtransaction> l=criteria.list();
		
		return l;
		
		
		
		
		
		
		
		
		
	}
}