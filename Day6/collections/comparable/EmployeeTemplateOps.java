package collections.comparable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTemplateOps {
	List<Employee> list=new ArrayList<Employee>();
	private int listLength=0;
	
	public void saveEmployee(Employee employee) {
		listLength++;
		list.add(employee);
	}
	
	public Employee removeEmployee() {
		if(list.size()>0) {
			listLength--;
			return list.remove(list.size()-1);
		}
		return null;
	}
	
	public Employee removeThisEmployee(int eId) {
		Employee emp=null;
		if(list.size()>0) {
			for(Employee newEmp:list) {
				if(newEmp.geteId()==eId) {
					emp=newEmp;
					listLength--;
					list.remove(emp);
					return emp;
				}
			}
			
		}
		return null;
	}


	public Employee findThisEmployee(int eId) {
		Employee emp=null;
		if(list.size()>0) {
			for(Employee newEmp:list) {
				if(newEmp.geteId()==eId) {
					emp=newEmp;
				}
			}
		}
		return emp;
	}
	
	public void printAllEmployees() {
		if(list.size()>0) {
			int i=1;
			for(Employee newEmp:list) {
				System.out.println((i++)+" : "+newEmp.geteId()+" - "+newEmp.geteName()+" : "+newEmp.geteSalary());
			}
		}
	}
	
	
}
