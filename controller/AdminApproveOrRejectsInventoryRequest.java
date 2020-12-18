package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManagerTransInvent;
import com.pojo.Inventoryrequest;

/**
 * Servlet implementation class AdminApproveOrRejectsInventoryRequest
 */
@WebServlet("/AdminApproveOrRejectsInventoryRequest")
public class AdminApproveOrRejectsInventoryRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerTransInvent bl = new BlManagerTransInvent();
	Inventoryrequest inventoryReq = new Inventoryrequest();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminApproveOrRejectsInventoryRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ApproveId = request.getParameter("ApproveId");
		String RejectId = request.getParameter("RejectId");

		System.out.println(ApproveId);

		if (ApproveId != null && RejectId == null) {
			inventoryReq = bl.getInventoryReqObj(Integer.parseInt(ApproveId));
			int status = 1;
			bl.UpdateInventoryStatus(inventoryReq, status);
			response.sendRedirect("AdminViewInventoryDetails.jsp");
		}

		if (RejectId != null && ApproveId == null) {
			inventoryReq = bl.getInventoryReqObj(Integer.parseInt(RejectId));
			int status = 0;
			bl.UpdateInventoryStatus(inventoryReq, status);
			response.sendRedirect("AdminViewInventoryDetails.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		// TODO Auto-generated method stub

	}

}
