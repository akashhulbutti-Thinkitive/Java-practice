package collections.crud;

import java.util.Collections;

public class MyEmployeeMainTest {

	public static void main(String[] args) {
		EmployeeTemplateOps empStack = new EmployeeTemplateOps();
		empStack.removeEmployee();

		
		  empStack.saveEmployee(new Employee(78, "EMP 1", 25000));
		  empStack.saveEmployee(new Employee(1090, "EMP 2", 35000));
		  empStack.saveEmployee(new Employee(2000, "EMP 3", 35000));
		 empStack.saveEmployee(new Employee(1008, "EMP 4", 15000));
		 
		  empStack.printAllEmployees(); Employee emp = empStack.findThisEmployee(1002);
		  if (emp != null) { System.out.println(emp.geteId() + " - " + emp.geteName() +
		  " : " + emp.geteSalary()); } else {
		  System.out.println("Employee is not Available"); }
		  
		  Employee emp1 = empStack.findThisEmployee(1005); if (emp1 != null) {
		  System.out.println(emp1.geteId() + " - " + emp1.geteName() + " : " +
		  emp1.geteSalary()); } else { System.out.println("Employee is not Available");
		  }
		  
		  empStack.removeEmployee();
		  
		  empStack.printAllEmployees();
		 
		 
		
	}

}
