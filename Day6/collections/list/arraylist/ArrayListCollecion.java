package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollecion {

	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add(new Employee(1001,"EMP 1",25000));
		l.add(new Employee(1002,"EMP 2",35000));
		l.add(new Employee(1003,"EMP 3",35000));
		l.add(new Employee(1004,"EMP 4",15000));
		
		for(int i=0;i<l.size();i++) {
			Employee e=(Employee)l.get(i);
			System.out.println(e.geteId()+" : "+e.geteName()+" : "+e.geteSalary());
		}
		
	}

}
