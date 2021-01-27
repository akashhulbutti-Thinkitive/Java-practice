package com.oop;

public class Sundae extends IceCream{
	
	public Sundae(String name) {
		super.name=name;
	}
	
	@Override
	public double returnCost() {
		// TODO Auto-generated method stub
		return super.returnCost()+10;
	}
}
