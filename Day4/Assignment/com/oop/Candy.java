package com.oop;

public class Candy extends DesertItem {
	/**
	 * This is field is of double type Candy item Weight in gms
	 */
	private double wieght;
	/**
	 * This is field is of double type Candy Item Price per kg
	 */
	private double price;

	public Candy() {
		System.out.println("Candy Instance Created...");
	}

	public Candy(String name,double wieght, double price) {
		super.name=name;
		this.price = price;
		this.wieght = wieght;
	}

	public double getWieght() {
		return wieght;
	}

	public void setWieght(double wieght) {
		this.wieght = wieght;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * This function returns Candy cost in double format
	 */
	@Override
	public double returnCost() {
		return (double)(this.wieght / this.price);
	}

	@Override
	public String toString() {
		return "Candy [wieght=" + wieght + ", price=" + price + "]";
	}
	
	

}
