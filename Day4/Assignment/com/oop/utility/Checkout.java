package com.oop.utility;

import com.oop.DesertItem;

public class Checkout {
	private DesertItem[] desertArrayList=new DesertItem[50];
	static int count = 0;

	public Checkout() {
		
	}

	public Checkout(DesertItem... desertItems) {
		for (int itr = 0; itr < desertItems.length; itr++) {
			this.desertArrayList[itr]=desertItems[itr];
			//desertArrayList[itr] = desertItems;
			count++;
		}
		System.out.println(count+" Deserts Have been Added to Desert List");
	}

	public static int getDesertCount() {
		return count;
	}

	public double getTotalCostOfAll() {
		double finalCost = 0;
		for (int itr = 0; itr < count; itr++) {
			//System.out.print(" "+this.desertArrayList[itr].returnCost());
			finalCost=finalCost+this.desertArrayList[itr].returnCost();
			//finalCost += this.desertArrayList[itr].returnCost();
		}
		return finalCost;
	}
	
	public void getAllDesertItems() {
		for (int itr = 0; itr < count; itr++) {
			System.out.println((itr+1)+" : "+this.desertArrayList[itr].returnName()+" \t: "+this.desertArrayList[itr].returnCost());
		}
	}
	public boolean clearDesertItems() {
		desertArrayList=null;
		return true;
	}
}
