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
import com.pojo.Events;

/**
 * Servlet implementation class EventServ
 */
@WebServlet("/EventServ")
public class EventServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServ() {
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
		
		String EventName=request.getParameter("EventName");
		String Edate =request.getParameter("Edate");
		
		
		Date date1 = null;
		
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Edate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Events e=new Events();
		
		e.setEventName(EventName);
		e.setEventDate(date1);
		
		
		BlManagerADMIN bl=new BlManagerADMIN();
		bl.InsertEvents(e);
		
	}

}
