
public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	
	private Employee(){
		this.setEmpId(1001);
		this.setEmpName("John Doe");;
		this.setEmpSalary(50000f);
	}
	
	public static Employee returnEmployyeObject() {
		return new Employee();
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee Id : "+this.getEmpId());
		System.out.println("Employee Name : "+this.getEmpName());
		System.out.println("Employee Salary : "+this.getEmpSalary());
	}

}
