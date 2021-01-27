import java.util.Arrays;

public class MaxOddNum {
	
	public int returnOddNum(int[] arr) {
		if(arr.length>0) {
			int max=0;
			for(int i=0;i<arr.length;i++) {
				max=max+arr[i];
			}
			return (int)Math.floor(max/arr.length);
		}
		return 0;
	}

	public static void main(String[] args) {
		
		int[] a= {2,5,3,7};
		MaxOddNum m=new MaxOddNum();
System.out.println(m.returnOddNum(a));

}
}
