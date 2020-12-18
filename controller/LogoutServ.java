package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServ
 */
@WebServlet("/LogoutServ")
public class LogoutServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 HttpSession session = request.getSession();
	        if(session != null)
	        {
	            try
	            {
	                response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
	                response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
	                response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
	                response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
	                session.setAttribute("admin_name",null);
	                session.invalidate();
	                response.sendRedirect("Login.jsp");
	            }
	            catch(Exception e)
	            {
	                System.out.println(e.getMessage());
	                System.out.println(e);
	            }

	        }
	        else
	        {


	        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       
    }

}
