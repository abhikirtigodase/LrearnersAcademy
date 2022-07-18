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
 * Servlet implementation class Insertstudent
 */
public class InsertTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeacher() {
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
			Connection con=DbUtil.getConn();
			String id = request.getParameter("id");
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String date = request.getParameter("date");
			String address = request.getParameter("address");
			String phoneno = request.getParameter("phoneno");
			String designation = request.getParameter("designation");
			
			String sql = "insert into teacher values(?,?,?,?,?,?,?)";
			
			 PreparedStatement ps = con.prepareStatement(sql);
			 System.out.println("fine-1");
			 ps.setString(1, id);
			 ps.setString(2, fname);
			 ps.setString(3, lname);
			 ps.setString(4, date);
			 ps.setString(5, address);
			 ps.setString(6, phoneno);
			 ps.setString(7, designation);
			 System.out.println("fine-2");
			 int r = ps.executeUpdate();
			 System.out.println("fine-3");
			 if(r>0)
			 {
				 pw.println("fine");
			 }
			 
			 else
			 {
				 pw.println("not fine");
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