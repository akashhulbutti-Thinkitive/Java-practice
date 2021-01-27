package abstract_classes;

public class AnimalMainClass {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eats();
		d.sounds();
		d.sleep();
		System.out.println("**************************");
		Lion l=new Lion();
		l.eats();
		l.sounds();
		l.sleep();

	}

}
