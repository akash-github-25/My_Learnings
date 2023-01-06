package com.question4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.que4.Student;
@Repository
public class StudentDaoImpl implements StudentDao{
	@Value("${db.name}")
	String name;
	@Value("${db.marks}")
	int marks;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String insertStudentDetails() {
		// TODO Auto-generated method stub
		String message=null;
		try(Connection conn= Conn.provideConnection()) {
		 
		 
		
		 PreparedStatement ps=conn.prepareStatement("insert into student values(?,?)");
		 ps.setString(1, name);
	     ps.setInt(2,marks);
	     
		int x=ps.executeUpdate();
		 
		 if(x > 0)
			 System.out.println("data inserted in student sucessfully..!");
		 else
			 System.out.println(" data not inserted in department");
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			message=e.getMessage();
		}
		
		return message;
	}

	

	

}
