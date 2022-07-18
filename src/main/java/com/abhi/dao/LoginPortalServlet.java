package com.abhi.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginPortalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPortalServlet() {
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
		//Connection con=DbUtil.getConn();
		
		response.setContentType("text/html");  
		
        String user =request.getParameter("user");
        
		String password = request.getParameter("password");
	
		String main_user = "admin";
		 
		String main_password = "admin";
		
		PrintWriter pw = response.getWriter();
		
		
		try {
			
			if(main_user.contentEquals(user) && main_password.contentEquals(password) )
			{
				response.sendRedirect("AfterLogin.jsp");	
				

			}
			else
			{
				//response.sendRedirect("Failed.html");	
				pw.println("Login Failed...Please Enter Your username and password Correctlly.............");

			}
			
		}
		
		catch(Exception e)
		{
			pw.println("Error by"+e.getMessage());
		}
		
		
		
		
	}

}
