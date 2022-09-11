package day43_polymorpism;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {

	public static void main(String[] args) {

		Shape sh = new Circle();
		
		if (sh instanceof Triangle) {
			System.out.println("Triangle");
		}else if(sh instanceof Circle) {
			System.out.println("Circle");
		}else {
			System.out.println("Square");
		}
		
		List<Shape> shapeList = new ArrayList<>();
		shapeList.add(new Triangle());
		shapeList.add(new Circle());

	}

}
