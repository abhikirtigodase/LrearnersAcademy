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
 * Servlet implementation class Insertsubject
 */
public class UpdateSubject_Teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSubject_Teacher() {
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
			String subject = request.getParameter("subject");
			String teacher = request.getParameter("teacher");
			
			System.out.println("fine-1");
			
			String sql = "update subject_teacher set subject=?, teacher=? where id=?";
			
			System.out.println("fine-2");
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			System.out.println("fine-3");
			
			
			ps.setString(3, id);
			ps.setString(1, subject);
			ps.setString(2, teacher);
			
			System.out.println("fine-4");
			
			int r = ps.executeUpdate();
			
			
			System.out.println("fine-5");
			
			if(r>0) {
				pw.println("Updated");
			}
			
			else
			{
				pw.println("not Not Updated");
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