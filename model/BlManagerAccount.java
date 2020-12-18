package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Applicationforadmission;
import com.pojo.Course;
import com.pojo.Coursefees;
import com.pojo.Enrolledstudents;
import com.pojo.Hostelfees;
import com.pojo.Hostelregistration;
import com.pojo.Studentadmitnfees;
import com.pojo.Studenttransportfees;
import com.pojo.Transportservicereq;

public class BlManagerAccount {
	SessionFactory sf = Hibernateutil.getSessionFactory();
	
	public void SoreStudentFees(Studentadmitnfees fp) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(fp);
		t.commit();
		s.close();
		
	}
	public List<Applicationforadmission> AprovalListOfStudents() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("approvalStatus", 0));
		
		List app1=cr.list();
		t.commit();
		
		return app1;
	}
	
	public List<Hostelregistration> AprovalListForHostelStudents() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Hostelregistration.class);
		cr.add(Restrictions.eq("acceptStatus", 1));
		
		List app1=cr.list();
		t.commit();
		
		return app1;
	}
	
	public List<Transportservicereq> AprovalListForTransportStudents() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Transportservicereq.class);
		cr.add(Restrictions.eq("status", 1));
		
		List app1=cr.list();
		t.commit();
		
		return app1;
	}
	
	
	
	public Applicationforadmission fetchStudentApllicationId(int ap1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("applicationId", ap1));
		Applicationforadmission app1 = (Applicationforadmission) cr.uniqueResult();
		t.commit();
		
		return app1;
	}
	
	public Hostelregistration fetchHStudentApllicationId(Applicationforadmission ap1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Hostelregistration.class);
		cr.add(Restrictions.eq("applicationforadmission", ap1));
		Hostelregistration app1 = (Hostelregistration) cr.uniqueResult();
		t.commit();
		
		return app1;
	}
	public Enrolledstudents fetchStudentEnrolledId(Applicationforadmission ap1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("applicationforadmission", ap1));
		Enrolledstudents app1 = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		
		return app1;
	}
	public Transportservicereq fetchTStudentApllicationId(Enrolledstudents en) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Transportservicereq.class);
		cr.add(Restrictions.eq("enrolledstudents", en));
		Transportservicereq app1 = (Transportservicereq) cr.uniqueResult();
		t.commit();
		
		return app1;
	}
	
	public Course FetchCourseId(int c) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseId", c));
		Course c1 = (Course) cr.uniqueResult();
		t.commit();
		s.close();
		return c1;
	}
	
	public Coursefees FetchCourseFeesId(Course c1) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Coursefees.class);
		cr.add(Restrictions.eq("course", c1));
		Coursefees cf = (Coursefees) cr.uniqueResult();
		t.commit();
		s.close();
		return cf;
	}
	public void StoreHostelFees(Hostelfees fp) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(fp);
		t.commit();
		s.close();
		
		
	}
	public void storeTransportFees(Studenttransportfees st) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(st);
		t.commit();
		s.close();
		
	}
	
}
