import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {

		System.out.println("Enter unit in kilometers: ");

		Scanner in = new Scanner(System.in);
		double kilometers = in.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println("After conversion: "+miles + " Miles");

	}
}