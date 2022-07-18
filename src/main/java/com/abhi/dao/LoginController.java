package com.abhi.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dbcon.DbUtil;

/**
 * Servlet implementation class Loginmatched
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		

		Connection con;
		
			try {
				con = DbUtil.getConn();
				
				PrintWriter pw = response.getWriter();
				
				

				String username = request.getParameter("username");
		        String password = request.getParameter("password");
				
			
		        PreparedStatement ps = con.prepareStatement("select username,password from login where username=? and password=?");
	            ps.setString(1, username);
	            ps.setString(2, password);
	            
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	            	
	            	pw.print("True");
	                //response.sendRedirect("success.html");
	                return;
	            }
	           // response.sendRedirect("error.html");
	            
	            pw.print("False");
	            return;
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
//			String sql = "select * from login";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setString(1, username);
//			ps.setString(2, password);
//
//			ResultSet rs = ps.executeQuery();
//
//			if(rs.next())
//			{
//				pw.println("login");
//			}
//
//			else
//			{
//				pw.println("not login");
//			}

			
	

		




		
	}

}