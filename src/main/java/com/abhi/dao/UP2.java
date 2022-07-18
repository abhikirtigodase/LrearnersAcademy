package com.abhi.dao;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dbcon.DbUtil;



/**
 * Servlet implementation class Retrive
 */
public class UP2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UP2() {
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
		// TODO Auto-generated method stub
		
		PrintWriter pw = response.getWriter();
		System.out.println("not fine-1");
		//String id=request.getParameter("id");
		System.out.println("not fine-2");
		try {
			
			
			Connection con=DbUtil.getConn();
			
			System.out.println("not fine-3");
			Statement st = con.createStatement();
			
			
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			
			System.out.println("not fine-4");
			String sql = "update student11 set name=?,email=? where id=?";
			System.out.println("not fine-5");
			
			 PreparedStatement ps = con.prepareStatement(sql);
			 System.out.println("not fine-6");
			 
			// ps.setString(1, "id");
			 
			 System.out.println("not fine-7");
			 
			ps.setString(1, name);
			
			System.out.println("not fine-8");
			
			ps.setString(2, email);
			ps.setString(3, id);
			
			System.out.println("not fine-9");
			
			int r = ps.executeUpdate();
			
			System.out.println("not fine-10");
			
			if(r>0)
			{
				pw.println("updated");
			}
			
			else {
				pw.println("not updated");
			}
			
			System.out.println("not fine-11");
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}