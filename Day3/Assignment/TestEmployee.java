package Assignment;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(1,"Max Wilson",25000,1500);
		//emp.getEmployeeDetails();
		
		Manager mg =new Manager();
		mg.getEmployeeDetails();
		System.out.println("\n\n*************************************************\n\n");
		ManagerExecutive me=new ManagerExecutive();
		me.getEmployeeDetails();

	}

}
