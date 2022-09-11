package day43_polymorpism;

public class TestShake {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw(); /** durum 1-check Circle class and if there overridden(draw method), run it
					         durum 2-yukaridaki durum yoksa yani bir metod overridden yapilmamis ise,
						     check Circle class and if not overriden, run it from parent class(Shape class)*/
	}

}
