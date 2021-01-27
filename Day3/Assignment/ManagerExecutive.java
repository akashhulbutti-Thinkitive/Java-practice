package Assignment;

public class ManagerExecutive extends Employee{
	
	private float touralAllowances;
	private float phoneAllowances;
	
	public ManagerExecutive() {
		super(1002,"Sam Kens",45000,14500);
		this.setTouralAllowances(super.basicSalary*0.08f);
		this.setPhoneAllowances(1500f);
	}
	
	public float getTouralAllowances() {
		return touralAllowances;
	}
	public void setTouralAllowances(float touralAllowances) {
		this.touralAllowances = touralAllowances;
	}
	public float getPhoneAllowances() {
		return phoneAllowances;
	}
	public void setPhoneAllowances(float phoneAllowances) {
		this.phoneAllowances = phoneAllowances;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Emplaoyee Id : "+this.empId);
		System.out.println("Emplaoyee Name: "+this.empName);
		System.out.println("***************************");
		System.out.println("Basic Salary \t : "+this.basicSalary);
		System.out.println("HRA \t\t : "+this.hra);
		System.out.println("PF \t\t : "+this.pf);
		System.out.println("PT \t\t : "+this.pt);
		System.out.println("Toural Allowances \t : "+this.touralAllowances);
		System.out.println("Phone Allowances \t : "+this.phoneAllowances);
		System.out.println("****************************");
		System.out.println("Gross Salary \t : "+this.calculateGrossSalary());
		System.out.println("Net Salary \t : "+this.calculateNetSalary());
	}
	
	public float calculateGrossSalary() {
		float grossSalary=0;
		grossSalary=super.calculateGrossSalary()+this.getTouralAllowances()+this.getPhoneAllowances();
		return grossSalary;
	}
	
	public float calculateNetSalary() {
		float netSalary=0;
		netSalary=super.calculateNetSalary()+this.calculateGrossSalary();
		return netSalary;
	}
	
	
}
