package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abhi.dbcon.DbUtil;
import com.abhi.pojo.Student;
import com.abhi.pojo3.Classes;

public class ClassesDAO {
	
	
	public List<Classes> getallsubject_teacher() throws ClassNotFoundException, SQLException{
		ArrayList<Classes> list=new ArrayList<>();
		Connection con=DbUtil.getConn();
		String sql="select subject from subject_teacher";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Classes s=new Classes();
			s.setId(rs.getString(1));
			s.setClassname(rs.getString(2));
			
			list.add(s);
			
		}
		return list;
	
	
	}
	
}
