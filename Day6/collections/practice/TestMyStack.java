package collections.practice;

import collections.list.arraylist.Employee;

public class TestMyStack {

	public static void main(String[] args) {
		

		System.out.println("******** MyStack Integer type *********");
		MyStack<Integer> intStack=new MyStack<Integer>();
		intStack.push(100);
		intStack.push(200);
		intStack.push(300);
		
		intStack.printAllStackData();
		
		intStack.pop();
		
		intStack.printAllStackData();
		
		System.out.println("********MyStack Employee type *********");
		
		MyStack<Employee> empStack =new MyStack<Employee>();
		
		empStack.push(new Employee(1001,"EMP 1",25000));
		empStack.push(new Employee(1002,"EMP 2",35000));
		empStack.push(new Employee(1003,"EMP 3",35000));
		empStack.push(new Employee(1004,"EMP 4",15000));
		
		empStack.printAllStackData();
		
		empStack.pop();
		System.out.println("--> "+empStack.length);
		
		empStack.printAllStackData();
	}

}
