import java.util.Scanner;
public class Eric_Pettersson_Demo {

	public static void main(String[] args) {
		System.out.println("Geometry Calculator\r\n"
				+ "1. Calculate the Area of a Circle\r\n"
				+ "2. Calculate the Area of a Rectangle\r\n"
				+ "3. Calculate the Area of a Triangle\r\n"
				+ "4. Quit\n"
				+ "Enter your choice (1—4):");
		Scanner input = new Scanner(System.in);
		try {
			int choice = input.nextInt();
			if (choice == 1) {
                System.out.println("Enter the radius of the circle:");
                double radius = input.nextDouble();
                System.out.println("The area of the circle is " + Eric_Pettersson_Geometry.CalcluateCircleArea(radius));
			}
			else if (choice == 2) {
                System.out.println("Enter the length of the rectangle:");
                double length = input.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = input.nextDouble();
                System.out.println("The area of the rectangle is " + Eric_Pettersson_Geometry.CalculateRectangleArea(length, width));
			}
			else if (choice == 3) {
                System.out.println("Enter the base of the triangle:");
                double length = input.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double width = input.nextDouble();
                System.out.println("The area of the rectangle is " + Eric_Pettersson_Geometry.CalculateRectangleArea(length, width));
			}
			else if (choice == 4) {
                System.out.println("Goodbye");
			}
            else {
            	System.out.println("INVAILD Selection, Please rerun and choice a bumber between 1-4");
                }
		}
		catch (Exception e) {
            System.out.println("INVALID input resulting in InputMismatchException");
            e.printStackTrace();
        }
		input.close();
	}
}
