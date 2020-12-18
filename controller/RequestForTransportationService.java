package com.controller;

import java.io.FileInputStream;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

//import com.google.gson.Gson;
import com.model.BlManagerTransInvent;
import com.pojo.Busandstop;
import com.pojo.Busroute;
import com.pojo.Busstop;
import com.pojo.Enrolledstudents;
import com.pojo.Transportservicereq;

/**
 * Servlet implementation class RequestForTransportationService
 */
@WebServlet(name = "RequestForTransportationService", urlPatterns = {"/RequestForTransportationService"})
@MultipartConfig
public class RequestForTransportationService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Busroute busRoute = new Busroute();
	BlManagerTransInvent bl = new BlManagerTransInvent();
	Enrolledstudents enrollStud = new Enrolledstudents();
	Busstop bstop = new Busstop();
	Busroute broute = new Busroute();
    Transportservicereq TransReqStud = new Transportservicereq();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestForTransportationService() {
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
		
		
		try {
			String EnrollNum = request.getParameter("EnrollNum");
			String route = request.getParameter("route");
			String stops = request.getParameter("stops");
			String passValidity = request.getParameter("passValidity");
		     long passFees = Long.parseLong(request.getParameter("passFees"));
			
			SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
			Date passStartDate = formatter.parse(request.getParameter("passStartDate"));
			Date passExpiryDate = formatter.parse(request.getParameter("passExpiryDate"));
			
			Part Imgfile = request.getPart("studPhoto");
			FileInputStream fin = (FileInputStream) Imgfile.getInputStream();
			byte []bFile = new byte[fin.available()];
			fin.read(bFile);	
			
			
		
			enrollStud = bl.getEnrollSrudObjByEnrollNumber(EnrollNum);
		
			broute = bl.getBusRouteObj(route);
			
			
			bstop = bl.getbusStopObj(stops);
			/*System.out.println("BusObj "+bstop);*/
			Busandstop busAndStopObj=bl.busandstopbyBusstop(bstop);
			
			/*System.out.println("OOOO"+busAndStopObj);*/
			TransReqStud.setEnrolledstudents(enrollStud);
			TransReqStud.setBusandstop(busAndStopObj);
			TransReqStud.setPassValidityMonths(passValidity);
			TransReqStud.setAmountPaid(passFees);
			TransReqStud.setPassValidityStartDate(passStartDate);
			TransReqStud.setPassValidityEndtDate(passExpiryDate);
			TransReqStud.setStudentPhoto(bFile);
			
			bl.SaveTranspotationServiceStud(TransReqStud);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		response.sendRedirect("StudentRequestForTransportationService.jsp");
		
		
	}	
		

}
