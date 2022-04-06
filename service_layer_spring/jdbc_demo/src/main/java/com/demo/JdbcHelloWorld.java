package com.demo;
import java.sql.*;
public class JdbcHelloWorld {
	
	public static void main(String[] args) {
		//create jdbc code
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("drier is loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//I need to get a connection object
		Connection connection=null;
		try {
			 connection=DriverManager.
					getConnection("jdbc:mysql://localhost:3306/infi", "root", "root");
			//now i need to print all the records from db
			
			PreparedStatement pstmt=connection.prepareStatement("select * from emp");
			
			ResultSet rs=pstmt.executeQuery(); //executeQuery() vs executeUpdate(): insert/delete/update
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+ rs.getString(2)+": "+ rs.getDouble(3));
			}
			System.out.println("conn is done");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
