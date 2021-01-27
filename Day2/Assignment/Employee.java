package Assignment;

public class Employee {
	int empId;
	String empName;
	float basicSalary;
	float hra;
	float pf;
	float pt;
	float medicalAllowances;
	float netSalary;
	
	public Employee() {
		System.out.println("Constructor Instantiated...");
	}
	
	Employee(int empId,String empName,int basicSalary,float medicalAllowances){
		
		this();
		
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
		this.hra=this.basicSalary*0.5f;
		this.pf=this.basicSalary*0.12f;
		this.pt=200;
		
	}
	
	public void getEmployeeDetails() {
		System.out.println("Emplaoyee Id : "+this.empId);
		System.out.println("Emplaoyee Name: "+this.empName);
		System.out.println("***************************");
		System.out.println("Basic Salary \t : "+this.basicSalary);
		System.out.println("HRA \t : "+this.hra);
		System.out.println("PF \t : "+this.pf);
		System.out.println("PT \t : "+this.pt);
		System.out.println("****************************");
		System.out.println("Gross Salary \t : "+this.calculateGrossSalary());
		System.out.println("Net Salary \t : "+this.calculateNetSalary());
	}
	
	public float calculateGrossSalary() {
		float grossSalary=0;
		grossSalary=this.basicSalary+this.hra+this.medicalAllowances;
		return grossSalary;
	}
	
	public float calculateNetSalary() {
		float netSalary=0;
		netSalary=this.calculateGrossSalary()-this.pf+this.pt;
		return netSalary;
	}
}
