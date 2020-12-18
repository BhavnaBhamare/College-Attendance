package com.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.model.BlManagerTransInvent;
import com.pojo.Busdetails;
import com.pojo.Busdriver;

/**
 * Servlet implementation class AdminAddNewDriverServ
 */
@WebServlet(name = "AdminAddNewDriverServ", urlPatterns = {"/AdminAddNewDriverServ"})
@MultipartConfig
public class AdminAddNewDriverServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BlManagerTransInvent bl = new BlManagerTransInvent();
	Busdriver bd = new Busdriver();
	Busdetails busDetails = new Busdetails();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAddNewDriverServ() {
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
			String driverName =  request.getParameter("driverName");
			String driverAddress =  request.getParameter("driverAddress");
			String driverEmail =  request.getParameter("driverEmail");
			String chooseLicenceType =  request.getParameter("chooseLicenceType");
			
			long driverContactNum =  Long.parseLong(request.getParameter("driverContactNum"));
			long driverLicenceNum =  Long.parseLong(request.getParameter("driverLicenceNum"));
			
			SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
			Date licenceApprovalDate = formatter.parse(request.getParameter("licenceApprovalDate"));
			Date licenceExpiryDate = formatter.parse(request.getParameter("licenceExpiryDate"));
			Date driverDOB = formatter.parse(request.getParameter("driverDOB"));
			
			int driverAge = Integer.parseInt(request.getParameter("driverAge"));
			
			Part Imgfile = request.getPart("driverPhoto");
			FileInputStream fin = (FileInputStream) Imgfile.getInputStream();
			byte []bFile = new byte[fin.available()];
			fin.read(bFile);	 
			
			bd.setDriverName(driverName);
			bd.setDriverAddress(driverAddress);
			bd.setDriverAge(driverAge);
			bd.setDriverContactNum(driverContactNum);
			bd.setDriverEmailId(driverEmail);
			bd.setDriverDateOfBirth(driverDOB);
			bd.setDriverLicenceNumber(driverLicenceNum);
			bd.setDriverLicenceType(chooseLicenceType);
			bd.setLicenceApprovalDate(licenceApprovalDate);
			bd.setLicenceExpiryDate(licenceExpiryDate);
			bd.setDriverPhoto(bFile);
			
			bl.AddNewDriverDetails(bd);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("AddDriverDetails.jsp");
		}

}
