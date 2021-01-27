package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeOps {
	JDBCConnection jdbc=null;
	
	public EmployeeOps() {
		this.jdbc=new JDBCConnection();
	}

	public void saveEmployee(Employee emp) {
		try {
			PreparedStatement stmt=this.jdbc.getPreparedStatement("insert into employee values(?,?,?)");
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getEmpName());
			stmt.setInt(3, emp.getSalary());
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee emp) {
		try {
			PreparedStatement stmt=this.jdbc.getPreparedStatement("Update employee set empName=?,salary=? where eid=?");
			stmt.setInt(3, emp.getEmpId());
			stmt.setString(1, emp.getEmpName());
			stmt.setInt(2, emp.getSalary());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void viewEmployee() {
		try {
			ResultSet rs=this.jdbc.getSimpleStatement().executeQuery("select * from employee");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
			}
			System.out.println();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteEmployee(int empId) {
		try {
			PreparedStatement stmt=this.jdbc.getPreparedStatement("delete from employee where eid=?");
			stmt.setInt(1, empId);
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
