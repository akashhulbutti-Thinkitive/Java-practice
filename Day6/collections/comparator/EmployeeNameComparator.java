package collections.comparator;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee arg0, Employee arg1) {
		return arg0.geteName().compareTo(arg1.geteName());
	}
}
