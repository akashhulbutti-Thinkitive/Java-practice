package abstract_classes;

public abstract class Animal {
	
	public Animal(){
		System.out.println("Animal Instantiated...");
	}
	

	public abstract void eats();
	
	public abstract void sounds();
	
	public void sleep() {
		System.out.println(this.getClass().getName() +" is Sleeping");
	}

}
