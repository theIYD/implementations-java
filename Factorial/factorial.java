
import java.util.Scanner;

/* Write a program to display the factorial of a number. Accept the number from user. */

public class factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int fact=1;

		System.out.println("Enter a number :-");
		int acceptNumber = s.nextInt();

		for(int i=1; i<=acceptNumber; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial of inputted number :- "+ fact);
	}
}