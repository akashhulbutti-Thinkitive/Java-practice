
public class StringClass {

	public static void main(String[] args) {
		String str = "hello world";
		String str1 = "hello world hello how are are you";
		String str2 = str.substring(0, 1);
		String str3 = str.substring(1, str.length());
		System.out.println("--> " + str2.toUpperCase() + str3);

		System.out.print("-->");
		for (int j = 0; j < str.length(); j++) {
			System.out.print(str.charAt(str.length() - j - 1));
		}

		System.out.println();
		System.out.print("-->");
		String[] arrStr = str1.split(" ");
		for (int i = 0; i < arrStr.length; i++) {
			str2 = arrStr[i].substring(0, 1);
			str3 = arrStr[i].substring(1, arrStr[i].length());
			System.out.print(" " + str2.toUpperCase() + str3);
		}

		System.out.println();
		System.out.print("-->");
		for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr[i].length(); j++) {
				System.out.print(arrStr[i].charAt(arrStr[i].length() - j - 1));
			}
			System.out.print(" ");
		}
Object b;
	}

}
