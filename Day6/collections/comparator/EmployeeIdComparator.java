package collections.comparator;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.geteId()>arg1.geteId()) {
			return 1;
		}else if(arg0.geteId()>arg1.geteId()) {
			return -1;
		}else
		return 0;
	}

}
