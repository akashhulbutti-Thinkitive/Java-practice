package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyEmployeeMainTest {

	public static void main(String[] args) {
		List<Employee> empStack = new ArrayList<Employee>();

		empStack.add(new Employee(78, "EMP 2", 65000));
		empStack.add(new Employee(1090, "EMP 3", 1000));
		empStack.add(new Employee(2000, "EMP 4", 5000));
		empStack.add(new Employee(1008, "EMP 1", 15000));

		EmployeeIdComparator idComp = new EmployeeIdComparator();
		EmployeeNameComparator nameComp = new EmployeeNameComparator();
		EmployeeSalaryComparator salComp = new EmployeeSalaryComparator();

		Collections.sort(empStack, idComp);
		System.out.println(empStack);

		Collections.sort(empStack, nameComp);
		System.out.println(empStack);

		Collections.sort(empStack, salComp);
		System.out.println(empStack);

	}

}
