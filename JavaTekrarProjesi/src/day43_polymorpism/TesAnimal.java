package day43_polymorpism;

public class TesAnimal {

	public static void main(String[] args) {
	
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Bird();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Bird();
		
		//Parent		child----> Burada parent child kurali olmadigi icin ERROR verir, sol taraf parent sag 
		//Bird bx = new Dog(); taraf child olmak zorunda burada her ikiside child olmaz
	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

