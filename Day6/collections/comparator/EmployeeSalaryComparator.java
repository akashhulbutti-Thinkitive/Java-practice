package collections.comparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.geteSalary()>arg1.geteSalary()) {
			return 1;
		}else if(arg0.geteSalary()>arg1.geteSalary()) {
			return -1;
		}else
		return 0;
	}
}
