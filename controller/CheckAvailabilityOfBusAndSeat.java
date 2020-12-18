package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerTransInvent;
import com.pojo.Busandstop;
import com.pojo.Busdetails;
import com.pojo.Transportservicereq;

/**
 * Servlet implementation class CheckAvailabilityOfBusAndSeat
 */
@WebServlet("/CheckAvailabilityOfBusAndSeat")
public class CheckAvailabilityOfBusAndSeat extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Transportservicereq transReqObj = new Transportservicereq();
    BlManagerTransInvent bl = new BlManagerTransInvent();
    Busdetails bs = new Busdetails();
	/**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAvailabilityOfBusAndSeat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		
		int TranceReqId = Integer.parseInt(request.getParameter("TransReqId"));
		//System.out.println("TransportReqFromUser : "+TranceReqId);
		
		/*HttpSession ss = request.getSession();
		Transportservicereq transReqObj = (Transportservicereq) ss.getAttribute("ListOfTransReq");*/
		
		transReqObj = bl.getTransportationReqObjById(TranceReqId);
		Busandstop bns=transReqObj.getBusandstop();
		Busdetails busd=bns.getBusdetails();
		int totalSeats=busd.getNoOfSeat();
		//System.out.println(totalSeats+"=== total seats");
		if(totalSeats != 0)
		{
			int seats = totalSeats - 1;
			//System.out.println(seats+"=== now seats");
		    bl.UpdateNoOfSeatBusDetail(busd,seats);
		    bl.ApproveTransRequest(transReqObj);
		    response.sendRedirect("AdminViewAllTransportationRequest.jsp");
		}
		
		if(totalSeats == 0)
		{
			pw.println("<script type=\"text/javascript\">");
	        pw.println("Sorry..!! There is No Bus available");
	    	pw.println("AdminViewAllTransportationRequest.jsp");
	    	pw.println("</script>");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
