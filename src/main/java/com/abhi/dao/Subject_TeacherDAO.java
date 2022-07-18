package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abhi.dbcon.DbUtil;
import com.abhi.pojo.Student;
import com.abhi.pojo4.Subject_Teacher;


public class Subject_TeacherDAO {


	
	public List<Subject_Teacher> getallsubject_teacher() throws ClassNotFoundException, SQLException{
		List<Subject_Teacher> list=new ArrayList<>();
		Connection con=DbUtil.getConn();
		String sql="select * from Subject_Teacher";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Subject_Teacher s=new Subject_Teacher();
			s.setId(rs.getString(1));
			s.setSubject(rs.getString(2));
			s.setTeachername(rs.getString(3));
			
			list.add(s);
			
		}
		return list;
	}

}