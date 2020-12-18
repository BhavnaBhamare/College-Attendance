package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerTransInvent;
import com.pojo.Inventoryrequest;
import com.pojo.Teacherdetail;

/**
 * Servlet implementation class AddInventoryServ
 */
@WebServlet("/AddInventoryServ")
public class AddInventoryServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	BlManagerTransInvent bl = new BlManagerTransInvent();
	Inventoryrequest inventoryReq = new Inventoryrequest();
	Teacherdetail td = new Teacherdetail();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddInventoryServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub

		int teacherId = Integer.parseInt(request.getParameter("teacherId"));
		String itemName = request.getParameter("itemName");
		int Qty = Integer.parseInt(request.getParameter("qty"));

		/*System.out.println(teacherId);
		System.out.println(itemName);
		System.out.println(Qty);*/
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		Date date = new Date();
		// System.out.println(dateFormat.format(date));
		 String todayDateTemp = dateFormat.format(date);
		 try {
			Date InventoryAddedDate = dateFormat.parse(todayDateTemp);
			td = bl.getTeacherDetailsObjById(teacherId);
			inventoryReq.setTeacherdetail(td);
			inventoryReq.setQuantity(Qty);
			inventoryReq.setInventoryName(itemName);
			inventoryReq.setInventoryRequestDateTime(InventoryAddedDate);
			
			bl.InsertInventory(inventoryReq);
			response.sendRedirect("TeacherAddInventory.jsp");
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
