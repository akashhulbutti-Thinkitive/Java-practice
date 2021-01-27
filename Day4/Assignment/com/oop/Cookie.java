package com.oop;

public class Cookie extends DesertItem{
	
	private int unit;
	private double price;
	
	public Cookie() {
		
	}
	
	public 	Cookie(String name,int unit,double price){
		super.name=name;
		this.unit=unit;
		this.price=price;		
	}
	
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double returnCost() {
		return (double)(this.unit*(12/this.price));
	}

	@Override
	public String toString() {
		return "Cookie [unit=" + unit + ", price=" + price + "]";
	}

	
}
