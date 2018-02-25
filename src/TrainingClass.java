import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//============Variables==========================================
		
		int x; // 1, 2 or 3
		double radius;
		double circleAreaR;
		int radiusOrC;
		double circ;
		double circleAreaC;
		double squareSide;
		double squareArea;
		
		//============Variables===========================================
		
				/////////////////////////////////////
		
		System.out.println("Welcome to my area calculator");
		System.out.println("Please choose one of the following things to calculate: ");

		do { // First DoWhile start

			System.out.println("1: Area of a cirle");
			System.out.println("2: Area of a square/rectangle");
			System.out.println("3: Area of a triangle");

			x = dd.nextInt();
			//==================================================CIRCLE======================================================
			if (x == 1) { ///// START OF FIRST IF

				System.out.println("You chose Circle.");

				

				do {
					System.out.println("Do you have the 1:radius or the 2:circumference"); // Radius or Circumference?
					radiusOrC = dd.nextInt(); // Radius or Circumference input
					if (radiusOrC == 1) { // IF Radius
						System.out.println("please enter the radius of the circle:"); // Radius input

						radius = dd.nextDouble(); 

						circleAreaR = Math.PI * radius * radius; // Area of a circle using the radius

						System.out.println("the area of the circle is " + df.format(circleAreaR)); // Print Area using Radius

					} else if (radiusOrC == 2) { // IF Circumference

						System.out.println("please enter the circumference of the circle:"); // Circumference input

						circ = dd.nextDouble();

						circleAreaC = (circ * circ) / (Math.PI * 4); // Area of a circle using circumference

						System.out.println("The area of the circle is " + df.format(circleAreaC)); // Print Area using Circumference

					} else {
						System.out.println("error"); // unknown input (not 1 or 2)
					}

				} while (radiusOrC != 1 && radiusOrC != 2); // if input is unknown then Loop
				
				//================================================CIRCLE========================================================
				
												/////////////////////////////////////////
				
			//====================================================SQUARE========================================================				
				
			} else if (x == 2) {
				System.out.println("You chose square");
				System.out.println("Please enter the Hight/Width:");
				squareSide = dd.nextDouble();
				squareArea = squareSide * squareSide;
				System.out.println("The area of the square is: " + df.format(squareArea));
			
			//====================================================SQUARE========================================================
		
												///////////////////////////////////////
				
			//====================================================TRIANGLE======================================================	
			} else if (x == 3) {
				System.out.println("triangle");
			} else {
				System.out.println("Unknown answer");
			}
		} while (x != 1 && x != 2 && x != 3); // if input is not 1, 2 or 3 then loop /// First DoWhile END
	}

}
