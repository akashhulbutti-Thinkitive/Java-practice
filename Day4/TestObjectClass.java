
public class TestObjectClass {

	public static void main(String[] args) {
		ObjectClass oc1 =new ObjectClass(10,"Sam Samson");
		ObjectClass oc2 =new ObjectClass(20,"Cat Catson");
		ObjectClass oc3 =new ObjectClass(20,"Cat Catson");
		System.out.println("\n********** toString Method **********\n");
		System.out.println(oc1);
		System.out.println(oc2);
		System.out.println("\n********** equals Method **********\n");
		System.out.println(""+oc1.equals(oc2));
		System.out.println(oc2.equals(oc3));
		System.out.println("\n********** hashCode Method **********\n");
		System.out.println(oc1.hashCode());
		System.out.println(oc2.hashCode());
		System.out.println(oc3.hashCode());

	}

}
