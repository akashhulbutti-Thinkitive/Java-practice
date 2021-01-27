package com.multithreading;

public class MyClassExtendsThreadClass2 extends Thread{
	
	public int calFact(int num) {
		if(num<=1)
			return 1;
		else
			return num*calFact(num-1);
	}
	
	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(" Factorial is : "+calFact(i));
			}
			Thread.sleep(25);
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
