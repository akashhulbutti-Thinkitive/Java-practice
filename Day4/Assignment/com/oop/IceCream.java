package com.oop;

public class IceCream extends DesertItem{
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(String name) {
		super.name=name;
	}

	@Override
	public double returnCost() {
		return 20;
	}

}
