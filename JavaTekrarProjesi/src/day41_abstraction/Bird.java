package day41_abstraction;

public abstract class Bird extends Animal{

	
	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breathe() {
		System.out.println("Bird breathing");
		
	}
	
	public abstract void fly();

}
