package com.multithreading;

import com.multithreading.assignement.TableClass;

public class MainClass {
	public static void main(String[] args) {
//		MyClassExtendsThreadClass m1 = new MyClassExtendsThreadClass('a');
//		MyClassExtendsThreadClass m2 = new MyClassExtendsThreadClass('A');
//		MyClassExtendsThreadClass2 m3 = new MyClassExtendsThreadClass2();
//		m1.start();
//		System.out.println("Hello");
//		m2.start();
//		m3.start();
		
//		MyClassimplementsRunnable1 mr1 = new MyClassimplementsRunnable1();
//		Thread t=new Thread(mr1);
//		t.start();
		
		TableClass tb1=new TableClass(10);
		TableClass tb2=new TableClass(11);
		
		Thread t1 =new Thread(tb1);
		Thread t2 =new Thread(tb2);
	
		t1.start();
		System.out.println();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
