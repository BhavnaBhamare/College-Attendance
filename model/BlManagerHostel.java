package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Applicationforadmission;
import com.pojo.Attendencetype;
import com.pojo.Genderforhostelroom;
import com.pojo.Hostelattendence;
import com.pojo.Hostelmess;
import com.pojo.Hostelmessfoodtype;
import com.pojo.Hostelregistration;
import com.pojo.Hostelroomsallot;
import com.pojo.Messattendence;
import com.pojo.Studentroom;


public class BlManagerHostel {

	SessionFactory sf = Hibernateutil.getSessionFactory();

	public Applicationforadmission SearchStudentById(int hid) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Applicationforadmission.class);
		cr.add(Restrictions.eq("applicationId", hid));
		Applicationforadmission a = (Applicationforadmission) cr.uniqueResult();
		return a;
	}

	public List<Studentroom> SearchAllRoomsList() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Studentroom.class);
		List<Studentroom> aList = cr.list();
		s.close();
		return aList;
	}

	public Genderforhostelroom genSerchById(String gender) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Genderforhostelroom.class);
		cr.add(Restrictions.eq("gender", gender));
		Genderforhostelroom Gr = (Genderforhostelroom) cr.uniqueResult();
		return Gr;
	}

	public Studentroom SearchGenTypeStudRoom(Genderforhostelroom gen, String RoomType) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Studentroom.class);
		cr.add(Restrictions.eq("genderforhostelroom", gen));
		cr.add(Restrictions.eq("studentRoomType", RoomType));
		Studentroom Gr = (Studentroom) cr.uniqueResult();
		return Gr;
	}

	public List<Hostelroomsallot> getAvalableRoomList(Studentroom studroom) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelroomsallot.class);
		cr.add(Restrictions.eq("studentroom", studroom));
		List<Hostelroomsallot> l = cr.list();
		return l;
	}

	public List<Hostelregistration> getAllRegApplication() {
		// status 1=application submited
		int a = 1;
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelregistration.class);
		cr.add(Restrictions.eq("status", a));
		List<Hostelregistration> l = cr.list();
		return l;
	}

	public List<Hostelregistration> getAllApprovedList() {
		// status 1=application submited
		int a = 1;
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelregistration.class);
		cr.add(Restrictions.eq("acceptStatus", a));
		List<Hostelregistration> l = cr.list();
		return l;
	}

	public void SaveHostelRegDetails(Hostelregistration hreg) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(hreg);
		t.commit();
		s.close();

	}

	public Hostelregistration getHostelRegById(int StudId) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelregistration.class);

		cr.add(Restrictions.eq("hregId", StudId));
		Hostelregistration h = (Hostelregistration) cr.uniqueResult();
		return h;

	}

	public List<Hostelmess> getAllMessIDList() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelmess.class);
		List<Hostelmess> l = cr.list();
		return l;
	}

	public Hostelroomsallot getHostelRoomAllotID(int roomId) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelroomsallot.class);

		cr.add(Restrictions.eq("hostelRoomId", roomId));
		Hostelroomsallot h = (Hostelroomsallot) cr.uniqueResult();
		return h;
	}

	public void UpdateHostelRegDetail(Hostelregistration reg) {
		/*
		 * Session s = sf.openSession(); Transaction t = s.beginTransaction();
		 * s.update(reg); t.commit(); s.close();
		 */
		//

		// date roomalot status
		int a = 0;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery(
				"update Hostelregistration set adminAllotDate=:d ,status=:s ,hostelroomsallot=:n,hostelmess=:m  where hregId=:i");
		q.setParameter("d", reg.getAdminAllotDate());
		q.setParameter("s", a);
		q.setParameter("n", reg.getHostelroomsallot());
		q.setParameter("m", reg.getHostelmess());
		q.setParameter("i", reg.getHregId());
		q.executeUpdate();
		tx.commit();

	}

	public void setAcceptStatus(Hostelregistration regId) {

		int a = 1;
		int b = 0;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Hostelregistration set acceptStatus=:n,status=:m where id=:i");
		q.setParameter("n", a);
		q.setParameter("m", b);
		q.setParameter("i", regId.getHregId());
		q.executeUpdate();
		tx.commit();

	}

	public void setRejectStatus(Hostelregistration regId, String reason) {
		int a = 0;
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Hostelregistration set acceptStatus=:n  where id=:i");
		q.setParameter("n", a);
		q.setParameter("i", regId.getHregId());
		q.executeUpdate();
		Query q1 = s.createQuery("update Hostelregistration set rejectRason=:r  where id=:i");
		q1.setParameter("r", reason);
		q1.setParameter("i", regId.getHregId());
		q1.executeUpdate();

		tx.commit();
		s.close();

		/*
		 * Session s1=sf.openSession(); Transaction tx1=s1.beginTransaction();
		 * Query q1=s1.createQuery(
		 * "update Hostelregistration set set rejectRason=:r where id=:i");
		 * q1.setParameter("r",reason); q1.setParameter("i",regId.getHregId());
		 * q1.executeUpdate(); tx1.commit(); s1.close();
		 */

	}

	public void setMessReg(Hostelmess hm) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(hm);
		t.commit();
		s.close();
	}

	public Hostelmess getmessIdOfStud(Hostelregistration applicationforadmission) {
		Session s = sf.openSession();

		Criteria cr = s.createCriteria(Hostelmess.class);
		cr.add(Restrictions.eq("hostelregistration", applicationforadmission));

		Hostelmess h = (Hostelmess) cr.uniqueResult();

		return h;
	}

	public Attendencetype getattendancetype(String attendanceType) {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Attendencetype.class);

		cr.add(Restrictions.eq("attendenceType", attendanceType));
		Attendencetype h = (Attendencetype) cr.uniqueResult();
		return h;

	}

	public void saveHostelAttendance(Hostelattendence ht) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ht);
		s.clear();
		t.commit();
		s.close();

	}

	public List<Hostelmess> getAllmessStudList() {

		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelmess.class);
		List<Hostelmess> l = cr.list();
		return l;

	}

	public Hostelmess getMessRegId(int StudId) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelmess.class);

		cr.add(Restrictions.eq("hmessId", StudId));
		Hostelmess h = (Hostelmess) cr.uniqueResult();
		return h;
	}

	public void saveMessattendance(Messattendence ht) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(ht);
		s.clear();
		t.commit();
		s.close();

	}

	public Hostelmessfoodtype GetfoodType(String hroomType) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Hostelmessfoodtype.class);

		cr.add(Restrictions.eq("foodTypeName", hroomType));
		Hostelmessfoodtype h = (Hostelmessfoodtype) cr.uniqueResult();
		return h;
	}

	public void updateHostelRoomMember(Hostelroomsallot hroomAllot) {
		
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("update Hostelroomsallot set hostelRoomMembers=:n where id=:i");
		q.setParameter("n", hroomAllot.getHostelRoomMembers());
		q.setParameter("i", hroomAllot.getHostelRoomId());
		q.executeUpdate();
		tx.commit();
		
	}

}
