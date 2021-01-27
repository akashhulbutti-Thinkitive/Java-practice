package com.multithreading;

public class MyClassimplementsRunnable1 implements Runnable{

	@Override
	public void run() {
		try {
		for(int i=1;i<=10;i++) {
			System.out.println(i*100);
			Thread.sleep(i*100);
		}
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	
	
	
}
