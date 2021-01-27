package com.multithreading;

public class MyClassExtendsThreadClass extends Thread {
	
	private char ch=0;
	public MyClassExtendsThreadClass(char character) {
		this.ch=character;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.print(" "+ch);
			ch++;
			try {
				Thread.sleep(25);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
