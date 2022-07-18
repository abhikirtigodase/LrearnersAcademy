package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abhi.dbcon.DbUtil;
import com.abhi.pojo2.Subject;
import com.abhi.pojo2.Subject;

public class SubjectDAO {
	
	public List<Subject> getallsubject() throws ClassNotFoundException, SQLException
	{
		
		ArrayList <Subject> list = new ArrayList<>();
		Connection con = DbUtil.getConn();
		
		String sql = "Select * from subject";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			Subject s = new Subject();
			s.setId(rs.getString(1));
			s.setSubjectname(rs.getString(2));
			
			list.add(s);
		}
		
		return null;
		
	}

}