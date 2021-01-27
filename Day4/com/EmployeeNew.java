package com;

public class EmployeeNew {
	
	private int privateId;
	int defaultId;
	public int publicId;
	protected int protectedId;
	
	public EmployeeNew() {
		System.out.println("EMployeeNew Constructor CAlled...");
	}
	
	protected EmployeeNew(int eId) {
		this.privateId=eId;
		this.protectedId=eId;
		this.defaultId=eId;
		this.publicId=eId;
		
	}

}
