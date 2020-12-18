package com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerADMIN;
import com.pojo.Holidays;

/**
 * Servlet implementation class HolidayServ
 */
@WebServlet("/HolidayServ")
public class HolidayServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolidayServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String HolidayName=request.getParameter("HolidayName");
		String Hdate=request.getParameter("Hdate");
		Date date1 = null;
		
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Hdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Holidays hd=new Holidays();
		hd.setHolidayName(HolidayName);
		
		
		
		hd.setHolidayDate(date1);
		
		BlManagerADMIN bl=new BlManagerADMIN();
		
		bl.InsertHolidays(hd);
		
	}

}
