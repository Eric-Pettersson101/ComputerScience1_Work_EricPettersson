import java.util.Scanner;
public class Eric_Pettersson_Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Choose a medium for the sound wave:");
        System.out.println("1 - Air");
        System.out.println("2 - Water");
        System.out.println("3 - Steel");

        int choice = input.nextInt();

        Eric_Pettersson_AssignmentThree soundWave = new Eric_Pettersson_AssignmentThree();

        switch(choice) {
            case 1:
                System.out.println("This is the slowest way.");
                System.out.println("Enter the distance the sound wave will travel in air:");
                soundWave.setDistance(input.nextDouble());
                System.out.println("It will take " + soundWave.getSpeedInAir() + " seconds to travel this distance in air.");
                break;
            case 2:
                System.out.println("This is the coolest way.");
                System.out.println("Enter the distance the sound wave will travel in water:");
                soundWave.setDistance(input.nextDouble());
                System.out.println("It will take " + soundWave.getSpeedInWater() + " seconds to travel this distance in water.");
                break;
            case 3:
                System.out.println("This is the fastest way.");
                System.out.println("Enter the distance the sound wave will travel in steel:");
                soundWave.setDistance(input.nextDouble());
                System.out.println("It will take " + soundWave.getSpeedInSteel() + " seconds to travel this distance in steel.");
                break;
            default:
                System.out.println("INVALID material chosen.");
                break;
        }

        input.close();
	}

}
