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

import com.abhi.dbcon.DbUtil;

/**
 * Servlet implementation class UpdateClasses
 */
public class US extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public US() {
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
		
		PrintWriter pw = response.getWriter();
		
		
		try {
			Connection con = DbUtil.getConn();
			
			String id = request.getParameter("id");
			String fname  = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String date  = request.getParameter("date");
			String address = request.getParameter("address");
			String phoneno  = request.getParameter("phoneno");
			String select1 = request.getParameter("select1");
				
			String sql = "update student set fname=?,lname=?,date=?,address=?,phoneno=?,select1=? where id=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
            ps.setString(7, id);
			
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, date);
			ps.setString(4, address);
			ps.setString(5, phoneno);
			ps.setString(6, select1);
		
			int r = ps.executeUpdate();
			
			if(r>0)
			{
				pw.println("updated");
			}
			
			else
			{
				pw.println("not updated");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}