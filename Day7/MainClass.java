import com.serialization.Address;
import com.serialization.EmployeeSerialized;

public class MainClass {

	public static void main(String[] args) {
		EmployeeSerialized emp = new EmployeeSerialized(1022,"Max Snoop",new Address(411038,"Pune","MH"));
		emp.serializeEmployee();
	//	System.out.println(emp);
		System.out.println(emp.deserializeEmployee());
		
		EmployeeSerialized emp1 = new EmployeeSerialized(1025,"John Doe",new Address(511028,"BGLKT","KA"));
		System.out.println(emp1.deserializeEmployee());

	}

}
