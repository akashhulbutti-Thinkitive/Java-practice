
public class Calculator {
	
	public int add(int a,int b) {
		System.out.println("int");
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	
//	public float add(float a , float b) {
//		System.out.println("FLoat");
//		return a+b;
//	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public float div(int a,int b) {
		if(a!=0)
			return a/b;
		return 0;
	}
	
	public void pl(int a) {
		System.out.println(a);
	}
	
//	public void pl(char a) {
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("Add - "+cal.add(10,2));
		System.out.println("Sub - "+cal.sub(10,2));
		System.out.println("Multiply - "+cal.multiply(10,2));
		System.out.println("Division - "+cal.div(10,2));
		
		cal.pl('S');
		cal.pl(6);

	}

}
