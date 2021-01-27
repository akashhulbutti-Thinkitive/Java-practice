package collections.comparator.assignment;

public class Employee{
	private int eId;
	private String eName;
	private double eSalary;
	private Address eAddress;
	
	public Employee(int eId, String eName, double eSalary,Address eAddress) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eAddress=eAddress;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	public Address geteAddress() {
		return eAddress;
	}
	public void seteAddress(Address eAddress) {
		this.eAddress = eAddress;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eAddress=" + eAddress + "]";
	}

	
}
