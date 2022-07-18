package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abhi.dbcon.DbUtil;
import com.abhi.pojo1.Teacher;

public class TeacherDAO {

	
//		public int insertstudent(Student s) throws ClassNotFoundException, SQLException {
//			Connection con=DbUtil.getConn();
//			String sql="insert into student11 values(?,?,?)";
//			PreparedStatement ps=con.prepareStatement(sql);
//			ps.setString(1,s.getId());
//			ps.setString(2,s.getName());
//			ps.setString(3,s.getEmail());
//			return ps.executeUpdate();
//		}
	//	
		
		public List<Teacher> getallTeacher() throws ClassNotFoundException, SQLException{
			ArrayList<Teacher> list=new ArrayList<>();
			Connection con=DbUtil.getConn();
			String sql="select * from teacher";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Teacher s=new Teacher();
				s.setId(rs.getString(1));
				s.setFname(rs.getString(2));
				s.setLname(rs.getString(3));
				s.setDate(rs.getString(4));
				s.setAddress(rs.getString(5));
				s.setPhoneno(rs.getString(6));
				s.setDesignation(rs.getString(7));
				
				list.add(s);
				
			}
			return list;
		}

	}

