package com.model;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.common.Hibernateutil;
import com.pojo.Adminaddinventory;
import com.pojo.Busandstop;
import com.pojo.Busdetails;
import com.pojo.Busdriver;
import com.pojo.Busroute;
import com.pojo.Busstop;
import com.pojo.Enrolledstudents;
import com.pojo.Inventoryrequest;
import com.pojo.Teacherdetail;
import com.pojo.Transportservicereq;


public class BlManagerTransInvent {

	 SessionFactory sf = Hibernateutil.getSessionFactory();

	 public List<Busroute> AllRouteDetails() {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busroute.class);
		List<Busroute> ListOfBusRoute = cr.list();
		t.commit();
		s.close();
		return ListOfBusRoute;
	}
	 
	 public List<Busstop> AllStopDetails() {
			// TODO Auto-generated method stub
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Criteria cr = s.createCriteria(Busstop.class);
			List<Busstop> ListOfBusStop = cr.list();
			t.commit();
			s.close();
			return ListOfBusStop;
		}

	public List<Busstop> getAllBusStopByRouteId(int rId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busstop.class);
		cr.add(Restrictions.eq("busroute", rId));
		List<Busstop> AllStopByRoute = cr.list();
		t.commit();
		s.close();
		return AllStopByRoute;
		
	}
	
	public List<Busdriver> getAllBusDrivers() {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busdriver.class);
		List<Busdriver> AllBusDriver = cr.list();
		t.commit();
		s.close();
		return AllBusDriver;
		
	}

	public void AddNewDriverDetails(Busdriver bd) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(bd);
		t.commit();
		s.close();
	}

	public Busdriver getDriverIdByName(String busDriverName) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busdriver.class);
		cr.add(Restrictions.eq("driverName", busDriverName));
		Busdriver allDriver = (Busdriver) cr.uniqueResult();
		t.commit();
		s.close();
		return allDriver;
	}

	public void AddBusDetails(Busdetails busDetail) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(busDetail);
		t.commit();
		s.close();
	}

	public Enrolledstudents getEnrollSrudObjByEnrollNumber(String enrollNum) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Enrolledstudents.class);
		cr.add(Restrictions.eq("enrollmentNumber", enrollNum));
		Enrolledstudents allEnrollStudent = (Enrolledstudents) cr.uniqueResult();
		t.commit();
		s.close();
		return allEnrollStudent;
	}

	public Busstop getbusStopObj(String stops) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busstop.class);
		cr.add(Restrictions.eq("stopName", stops));
		Busstop allBusStopDetail = (Busstop) cr.uniqueResult();
		t.commit();
		s.close();
		return allBusStopDetail;
	}

	public Busandstop busandstopbyBusstop(Busstop bstop) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busandstop.class);
		cr.add(Restrictions.eq("busstop", bstop));
		Busandstop BusAndStopDetailsObj = (Busandstop) cr.uniqueResult();
		t.commit();
		s.close();
		return BusAndStopDetailsObj;
	}

	public void SaveTranspotationServiceStud(Transportservicereq transReqStud) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(transReqStud);
		t.commit();
		s.close();
	}

	public Busroute getBusRouteObj(String route) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Busroute.class);
		cr.add(Restrictions.eq("routeName", route));
		Busroute allBusRouteDetail = (Busroute) cr.uniqueResult();
		t.commit();
		s.close();
		return allBusRouteDetail;
	}
	 
	 public List<Transportservicereq> GetWholeListOfReqTrans() {
			// TODO Auto-generated method stub
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Criteria cr = s.createCriteria(Transportservicereq.class);
			List<Transportservicereq> ListOfTransReq = cr.list();
			return ListOfTransReq;
		}

	public Transportservicereq getTransportationReqObjById(int tranceReqId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Criteria cr = s.createCriteria(Transportservicereq.class);
		cr.add(Restrictions.eq("transportServiceReqId", tranceReqId));
		Transportservicereq allTransReqDetail = (Transportservicereq) cr.uniqueResult();
		return allTransReqDetail;
	}

	public void UpdateNoOfSeatBusDetail(Busdetails bs, int seats) {
		// TODO Auto-generated method stub
		
		//System.out.println(bs.getBusDetailsId()+"  busID"+" seats "+seats);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("update Busdetails set NoOfSeat=:s where id=:i");
		q.setParameter("s", seats);
		q.setParameter("i", bs.getBusDetailsId());
		q.executeUpdate();
		t.commit();
		s.close();
	}

	public void ApproveTransRequest(Transportservicereq transReqObj) {
		// TODO Auto-generated method stub
		int a=1;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("update Transportservicereq set Status=:n where id=:i");
		q.setParameter("n", a);
		q.setParameter("i", transReqObj.getTransportServiceReqId());
		q.executeUpdate();
		t.commit();
	}

	public Teacherdetail getTeacherDetailsObjById(int teacherId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Criteria cr = s.createCriteria(Teacherdetail.class);
		cr.add(Restrictions.eq("teacherId", teacherId));
		Teacherdetail allTeacherDetail = (Teacherdetail) cr.uniqueResult();
		t.commit();
		s.close();
		return allTeacherDetail;
		
	}

	public void InsertInventory(Inventoryrequest inventoryReq) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(inventoryReq);
		t.commit();
		s.close();
	}

	public List<Inventoryrequest> GetWholeListOfInventoryReq() {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Inventoryrequest.class);
		List<Inventoryrequest> ListOfInventoryReq = cr.list();
		return ListOfInventoryReq;
	}

	public Inventoryrequest getInventoryReqObj(int approveId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Criteria cr = s.createCriteria(Inventoryrequest.class);
		cr.add(Restrictions.eq("inventoryRequestId", approveId));
		Inventoryrequest AppTransReqDetail = (Inventoryrequest) cr.uniqueResult();
		return AppTransReqDetail;
	}

	public void UpdateInventoryStatus(Inventoryrequest inventoryReq, int status) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("update Inventoryrequest set InventoryStatus =:s where id=:i");
		q.setParameter("s", status);
		q.setParameter("i", inventoryReq.getInventoryRequestId());
		q.executeUpdate();
		t.commit();
		s.close();
	}

	public List<Inventoryrequest> GetApprovedListOfInventoryReq(String status) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Inventoryrequest.class);
		cr.add(Restrictions.eq("inventoryStatus", status));
		List<Inventoryrequest> ApprovedListOfInventoryReq = cr.list();
		return ApprovedListOfInventoryReq;
	}

	public Teacherdetail getObjOfTechDetailsById(int teachId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Criteria cr = s.createCriteria(Teacherdetail.class);
		cr.add(Restrictions.eq("teacherId", teachId));
		Teacherdetail techDetailObj = (Teacherdetail) cr.uniqueResult();
		return techDetailObj;
	}


	public void InsertInventoryItems(Adminaddinventory addInventory) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(addInventory);
		t.commit();
		s.close();
	}

	public Inventoryrequest getInventoryObj(int inReqId) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		 Criteria cr = s.createCriteria(Inventoryrequest.class);
		cr.add(Restrictions.eq("inventoryRequestId", inReqId));
		Inventoryrequest inventoryObj = (Inventoryrequest) cr.uniqueResult();
		return inventoryObj;
	}


	

}
