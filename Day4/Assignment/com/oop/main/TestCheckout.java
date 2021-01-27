package com.oop.main;

import com.oop.Candy;
import com.oop.Cookie;
import com.oop.IceCream;
import com.oop.Sundae;
import com.oop.utility.Checkout;

public class TestCheckout {

	public static void main(String[] args) {
		
		Candy cnd1=new Candy("Milky Way",500,100);
		Candy cnd2=new Candy("Laffy Taffy",500,100);
		
		Cookie ck1=new Cookie("Raisin Cookies",20,120);
		Cookie ck2=new Cookie("Peanut Cookies",50,100);
		Cookie ck3=new Cookie("Almond Cookies",50,100);
		
		IceCream ic=new IceCream("Vanilla");
		Sundae sun = new Sundae("Vanilla-Chocolate");
		
		
		System.out.println();
		Checkout chkOut=new Checkout(cnd1,ck1,cnd2,ck2,ck3);
		
		System.out.println();
		System.out.println("Total Desert Items : "+chkOut.getDesertCount());
		
		System.out.println();
		System.out.println("Total Cost is : "+chkOut.getTotalCostOfAll());
		System.out.println();
		chkOut.getAllDesertItems();
		System.out.println();
		if(chkOut.clearDesertItems()){
			System.out.println("Desert Items Cleared...");
		};

	}

}
