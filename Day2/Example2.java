
public class Example2 {

	public static void main(String[] args) {
		float percentage = 55;
		if (percentage > 70) {
			System.out.println("Distinction");
		} else if (percentage > 60) {
			System.out.println("First Class");
		} else if (percentage > 40) {
			System.out.println("Second Class");
		} else {
			System.out.println("Fail");
		}

		int check=10%2;
		switch(check) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
				System.out.println("Fail");
		}
		
	}

}
