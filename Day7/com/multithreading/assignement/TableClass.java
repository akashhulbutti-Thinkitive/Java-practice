package com.multithreading.assignement;


public class TableClass implements Runnable {
	private int num;

	public TableClass(int num) {
		this.num = num;
	}

	public synchronized int printTable(int num, int i) {
		return num * i;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread() + " : " + num + "x" + i + "=" + printTable(this.num, i));
				Thread.sleep(250);
			}
			
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}
