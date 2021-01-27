package collections.comparator.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List empStack = new ArrayList<Employee>();

		empStack.add(new Employee(78, "EMP 4", 60000,new Address("Pune", 411038)));
		empStack.add(new Employee(1090, "EMP 3", 70000,new Address("Mumbai",987000)));
		empStack.add(new Employee(2000, "EMP 2", 50000,new Address("Thane", 12345)));
		empStack.add(new Employee(1008, "EMP 1", 10000,new Address("Lonavala", 11038)));
		
		System.out.println(empStack);
		
		AddressCityComp city = new AddressCityComp();
		AddressCityComp pincode = new AddressCityComp();
		
		Collections.sort(empStack,city);
		System.out.println(empStack);
		
		Collections.sort(empStack,pincode);
		System.out.println(empStack);
		
		
	}

}
