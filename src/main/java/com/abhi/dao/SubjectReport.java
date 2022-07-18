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
 * Servlet implementation class SubjectReport
 */
public class SubjectReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectReport() {
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

		    try {
				Connection con = DbUtil.getConn();
				
				response.setContentType("text/html");
				
				PrintWriter pw = response.getWriter();
				
				String subject = request.getParameter("subject");
				
				System.out.println("fine-1");
				
				String sql = "select * from subject_teacher where subject=?";
				
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, subject);
				
				System.out.println("fine-2");
				
				ResultSet r = ps.executeQuery();
				
				System.out.println("fine-3");
				
				pw.println("<html><body ><h1>Class Reports</h1><table border='1'><tr><th>ID</th><th>Subject</th><th>Teacher</th></tr>");
				
				while(r.next())
				{
					pw.println("<tr><td>"+r.getString(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td></tr>");
				}
				
				pw.println("</table></body></html>");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}