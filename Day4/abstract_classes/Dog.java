package abstract_classes;

public class Dog extends Animal{
	

	public Dog() {
		System.out.println("Dog Class Called..");
	}
	@Override
	public void eats() {
		System.out.println(this.getClass().getName()+" eats Vegies");
	}

	@Override
	public void sounds() {
		System.out.println(this.getClass().getName()+" Barks");	
	}	
}
