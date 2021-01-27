package Inheritance;

public class Calculator {
	
	public int add(int... a) {
		 int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println(cal.add(3,4,5,5));
		
	}

}
