package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManagerTransInvent;
import com.pojo.Adminaddinventory;
import com.pojo.Inventoryrequest;
import com.pojo.Teacherdetail;
import com.pojo.Transportservicereq;

/**
 * Servlet implementation class AdminAddInventoryServ
 */
@WebServlet("/AdminAddInventoryServ")
public class AdminAddInventoryServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Inventoryrequest inReq = new Inventoryrequest();
	Adminaddinventory addInventory = new Adminaddinventory();
	Teacherdetail td = new Teacherdetail();

	BlManagerTransInvent bl = new BlManagerTransInvent();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminAddInventoryServ() {
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

		HttpSession session1 = request.getSession();
		@SuppressWarnings("unchecked")
		List<Inventoryrequest> updatedList = (List<Inventoryrequest>) session1.getAttribute("ListOfInventoryReq");
		Inventoryrequest size = updatedList.get(updatedList.size() - 1);

		Iterator ir = updatedList.iterator();
		int i = 0;
		while (ir.hasNext()) {
			i++;
			ir.next();
		}

		String ReceivedQty[] = request.getParameterValues("ReceivedQty");
		for (int k = 0; k < i; k++) {

		    int inReqId = updatedList.get(k).getInventoryRequestId();
		    inReq = bl.getInventoryObj(inReqId);
			
			
			int recQty = (Integer.parseInt(ReceivedQty[k]));

			try {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				String todayDateTemp = dateFormat.format(date);
				Date ItemReceivedDate;

				ItemReceivedDate = dateFormat.parse(todayDateTemp);

				addInventory.setInventoryrequest(inReq);
				addInventory.setReceivedQuantity(recQty);
				addInventory.setReceivedItemsDate(ItemReceivedDate);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bl.InsertInventoryItems(addInventory);
		}
		response.sendRedirect("AdminAddInventoryItems.jsp");
	}

}
