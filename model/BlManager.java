package com.model;
import java.util.List;

import javax.security.auth.Subject;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Address;
import com.pojo.Applicationforadmission;
import com.pojo.Bachelordetail;
import com.pojo.Branch;
import com.pojo.Course;
import com.pojo.Currentstudentinfo;
import com.pojo.Dance;
import com.pojo.Diplomadetail;
import com.pojo.Enrolledstudents;
import com.pojo.Examtimetable;
import com.pojo.Hscdetail;
import com.pojo.Masterdetail;
import com.pojo.Music;
import com.pojo.Registration;
import com.pojo.Sports;
import com.pojo.Sscdetail;
import com.pojo.Subjects;
import com.pojo.Uploadeddocuments;
import com.pojo.Studentfees;

public class BlManager {
	
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

	public Course SearchbycourseName(String course) {
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
	
	public Integer InsertRegistration(Registration r) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(r);
		Integer id = r.getRegId();
		t.commit();
		s.close();
		return id;

	}

	public Registration AutheticateStudent(int userId, String studentPassword) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("regId", userId));
		cr.add(Restrictions.eq("regPassword", studentPassword));
		Registration reg = (Registration) cr.uniqueResult();
		t.commit();
		s.close();
		return reg;
	}

	public Registration fetchstoredstudent(int storedregId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Registration.class);
		cr.add(Restrictions.eq("regId", storedregId));
		Registration reg = (Registration) cr.uniqueResult();
		t.commit();
		s.close();
		return reg;
	}

	public Integer InsertApplication(Applicationforadmission ap) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ap);
		Integer id = ap.getApplicationId();
		t.commit();
		s.close();
		return id;
	}

	public int InsertApplicantAddress(Address ad) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ad);
		Integer id = ad.getAddressId();
		t.commit();
		s.close();
		return id;
	}

	public Address fetchStoredStudentAddress(int adId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Address.class);
		cr.add(Restrictions.eq("addressId", adId));
		Address ad1 = (Address) cr.uniqueResult();
		t.commit();
		s.close();
		return ad1;
	}

	public List<Course> SearchAllCourses() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		@SuppressWarnings("unchecked")
		List<Course> aList = cr.list();
		t.commit();
		s.close();
		return aList;
	}

	public List<Branch> SearchAllBranches() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Branch.class);
		@SuppressWarnings("unchecked")
		List<Branch> aList = cr.list();
		t.commit();
		s.close();
		return aList;
	}

	public Branch MatchBranch(String selectedBranch) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Branch.class);
		cr.add(Restrictions.eq("branchName", selectedBranch));
		Branch b1 = (Branch) cr.uniqueResult();
		t.commit();
		s.close();
		return b1;
	}

	public Course MatchCourse(String selectedCourse) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseName", selectedCourse));
		Course c1 = (Course) cr.uniqueResult();
		t.commit();
		s.close();
		return c1;
	}

	public int InsertApplicantSSCDetail(Sscdetail ssc) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ssc);
		Integer id = ssc.getSscdetailId();
		t.commit();
		s.close();
		return id;
	}

	public Sscdetail fetchStoredStudentSSCDetail(int sscId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Sscdetail.class);
		cr.add(Restrictions.eq("sscdetailId", sscId));
		Sscdetail ssc1 = (Sscdetail) cr.uniqueResult();
		t.commit();
		s.close();
		return ssc1;
	}

	public int InsertApplicantHSCDetail(Hscdetail hsc) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(hsc);
		Integer id = hsc.getHscdetailId();
		t.commit();
		s.close();
		return id;
	}

	public Hscdetail fetchStoredStudentHSCDetail(int hscId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Hscdetail.class);
		cr.add(Restrictions.eq("hscdetailId", hscId));
		Hscdetail hsc1 = (Hscdetail) cr.uniqueResult();
		t.commit();
		s.close();
		return hsc1;
	}

	public int InsertApplicantDiplomaDetail(Diplomadetail dip) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(dip);
		Integer id = dip.getDiplomaDetailId();
		t.commit();
		s.close();
		return id;
	}

	public Diplomadetail fetchStoredStudentDiplomaDetail(int dipId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Diplomadetail.class);
		cr.add(Restrictions.eq("diplomaDetailId", dipId));
		Diplomadetail dip1 = (Diplomadetail) cr.uniqueResult();
		t.commit();
		s.close();
		return dip1;
	}

	public int InsertApplicantBachelorDetail(Bachelordetail bach) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(bach);
		Integer id = bach.getBachelorDetailId();
		t.commit();
		s.close();
		return id;
	}

	public Bachelordetail fetchStoredStudentBachelorDetail(int bachId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Bachelordetail.class);
		cr.add(Restrictions.eq("bachelorDetailId", bachId));
		Bachelordetail bach1 = (Bachelordetail) cr.uniqueResult();
		t.commit();
		s.close();
		return bach1;
	}

	public int InsertApplicantMasterDetail(Masterdetail mast) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(mast);
		Integer id = mast.getMasterDetailId();
		t.commit();
		s.close();
		return id;
	}

	public Masterdetail fetchStoredStudentMasterDetail(int mastId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Masterdetail.class);
		cr.add(Restrictions.eq("masterDetailId", mastId));
		Masterdetail mast1 = (Masterdetail) cr.uniqueResult();
		t.commit();
		s.close();
		return mast1;
	}

	public int InsertApplicantUploadedDocs(Uploadeddocuments upl) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(upl);
		Integer id = upl.getUploadedDocId();
		t.commit();
		s.close();
		return id;
	}

	public Uploadeddocuments fetchStoredStudentUploadedDocs(int uplId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Uploadeddocuments.class);
		cr.add(Restrictions.eq("uploadedDocId", uplId));
		Uploadeddocuments upl1 = (Uploadeddocuments) cr.uniqueResult();
		t.commit();
		s.close();
		return upl1;
	}
	
	
	public Applicationforadmission fetchStudentApllicationId(int ap1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("applicationId", ap1));
		Applicationforadmission app1 = (Applicationforadmission) cr.uniqueResult();
		t.commit();
		s.close();
		return app1;
	}

	public Applicationforadmission CheckApplication(Registration reg) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("registration", reg));
		Applicationforadmission app1 = (Applicationforadmission) cr.uniqueResult();
		t.commit();
		s.close();
		return app1;
	}

	public List<Applicationforadmission> AprovalListOfStudents() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("approvalStatus", 2));
		List app1=cr.list();
		t.commit();
		
		return app1;
	}
	public List<Applicationforadmission> ApprovedListOfStudents() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("approvalStatus", 0));
		List app1=cr.list();
		t.commit();
		
		return app1;
	}

		
	public void ApprovalOffStudentApplication(Applicationforadmission ap) {
		
		int a=0;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Applicationforadmission set ApprovalStatus=:n where id=:i");
		q.setParameter("n", a);
		q.setParameter("i", ap.getApplicationId());
		q.executeUpdate();
		tx.commit();

	}

public void RejectionOffStudentApplication(Applicationforadmission ap) {
		
		int a=1;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Applicationforadmission set ApprovalStatus=:n where id=:i");
		q.setParameter("n", a);
		q.setParameter("i", ap.getApplicationId());
		q.executeUpdate();
		tx.commit();

	}


}
