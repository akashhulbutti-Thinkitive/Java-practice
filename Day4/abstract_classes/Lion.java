package abstract_classes;

public class Lion extends Animal{
	
	Lion(){
		System.out.println("Lion Object Instantiated...");
	}

	@Override
	public void eats() {
		System.out.println(this.getClass().getName()+" eats Meat");
	}

	@Override
	public void sounds() {
		System.out.println(this.getClass().getName()+" Roars");	
	}	

}
