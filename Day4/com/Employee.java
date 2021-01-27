package com;

public class Employee {
	
	
	private int eId;
	
	public Employee(){
		System.out.println("Employee Constructor Called");
	}
	
	void printEMployee() {
		System.out.println(this.eId);
	}
	
	public Employee(int eid){
		this.eId=eid;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}
	
	

}
