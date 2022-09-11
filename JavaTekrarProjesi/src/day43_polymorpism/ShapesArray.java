package day43_polymorpism;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3]; //this is array and holding 3 objects 
		
		/**Extra information
		int[] x = new int[3]; //this is array and holding 3 int value*/
		
		shapes[0] = new Shape();
		
		shapes[1] = new Triangle();
		
		shapes[2] = new Circle();
		
		for (Shape sh : shapes) {
			//System.out.println(sh.getClass().getName());
			// sh.draw(); // do you know which class is running from 
			System.out.println(sh.getClass().getSimpleName());
			
		}

	}

}
