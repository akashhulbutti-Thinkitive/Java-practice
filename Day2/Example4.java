
public class Example4 {
	public static void main(String[] args) {
		int a[] = { 97, 59, 88, 45, 90 };
		for (int j = 0; j < a.length; j++) {
			int num = a[j];
			int flag=0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println(num+" is not prime");
			}else {
				System.out.println(num+" is prime");
			}
		}
		
		System.out.println("*********************************");
		int b[]= { 97, 59, 88, 45, 90 };
		int c[]= { 97, 59, 88, 45, 89, 90 };
		
		int abCheck=0;
		for(int aVal:a) {
			for(int bVal:b) {
				if(aVal==bVal)
					abCheck++;
			}
		}
		
		if(abCheck==a.length && abCheck==b.length) {
			System.out.println("A & B are Same");
		}else {
			System.out.println("A & B are not Same");
		}
		
		
		int acCheck=0;
		for(int aVal:a) {
			for(int cVal:c) {
				if(aVal==cVal)
					acCheck++;
			}
		}
		
		if(acCheck==a.length && acCheck==c.length) {
			System.out.println("A & C are Same");
		}else {
			System.out.println("A & C are not Same");
		}
		
	}
}
