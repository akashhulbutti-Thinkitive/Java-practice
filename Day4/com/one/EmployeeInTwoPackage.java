package com.one;

import com.Employee;

public class EmployeeInTwoPackage {
	
	public static void main(String[] args) {
		Employee e =new Employee(123);
		System.out.println("Employee id: "+e.geteId());	
	}
	
}
