package Encapsulation;

public class Employee {
	
	// Fields - Instance Members
	 int eId;
	 String ename;
	 int salary;
	 Employee(int id,String name,int sal){
		 eId=id;
		 ename=name;
		 salary=sal;
	 }
	 
//	// Methods = Instance Methods
//	 public void getData() {
//		 eId=1;
//		 ename="John";
//		 salary=50000;
//	 }
	 
	 public void printData() {
		System.out.println("Employee Id - "+eId);
		System.out.println("Employee Name - "+ename);
		System.out.println("Employee Salary - "+salary);
	}
}
