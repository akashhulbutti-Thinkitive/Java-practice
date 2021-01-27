package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class MyJDBCClass {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/training","root","root");
			Statement stmt=con.createStatement();
			//stmt.execute("create table employee(eid int primary key,empName varchar(64),salary int)");
			stmt.execute("insert into employee values(1,'Akash H')");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
