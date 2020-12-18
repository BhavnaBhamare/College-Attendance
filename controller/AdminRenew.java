package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.model.BlManagerExamination;
import com.pojo.*;

/**
 * Servlet implementation class AdminRenew
 */
@WebServlet("/AdminRenew")
public class AdminRenew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BlManagerExamination Bl = new BlManagerExamination();
	Branch brch = new Branch();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRenew() {
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
		String branch = request.getParameter("branch");
		String sem=request.getParameter("sem");
	/*	int sem = Integer.parseInt(request.getParameter("sem"));*/
		
		brch=Bl.SearchbybranchName(branch);
		System.out.println(brch);
		
		List<Studentfees> stuinfo=Bl.Searchbysem(sem,brch);
		int s=stuinfo.indexOf(1);
		/*System.out.println(s);*/
		 HttpSession session = request.getSession();
			session.setAttribute("renewlist",stuinfo);
			
			response.sendRedirect("AdminRenew.jsp");
	}

}
