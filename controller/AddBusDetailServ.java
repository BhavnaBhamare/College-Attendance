package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerTransInvent;
import com.pojo.Busdetails;
import com.pojo.Busdriver;

/**
 * Servlet implementation class AddBusDetailServ
 */
@WebServlet("/AddBusDetailServ")
public class AddBusDetailServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BlManagerTransInvent bl = new BlManagerTransInvent();
	Busdriver bd = new Busdriver();
	Busdetails busDetail = new Busdetails();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBusDetailServ() {
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
		
		String busDriverName = request.getParameter("busDriverName");
		String BusNumber = request.getParameter("BusNumber");
		String tripTime = request.getParameter("tripTime");
		String busType = request.getParameter("busType");
		int noOfSeats = Integer.parseInt(request.getParameter("noOfSeats"));
		/*System.out.println(noOfSeats);
		System.out.println(busDriverName);
		System.out.println(BusNumber);
		System.out.println(busType);
		System.out.println(tripTime);*/
		
		bd = bl.getDriverIdByName(busDriverName);
		/*System.out.println(bd);*/
		busDetail.setBusdriver(bd);
		busDetail.setBusNumber(BusNumber);
		busDetail.setNoOfSeat(noOfSeats);
		busDetail.setBusType(busType);
		busDetail.setTripTime(tripTime);
		
		bl.AddBusDetails(busDetail);

		response.sendRedirect("AddBusDetails.jsp");

		
	}

}
