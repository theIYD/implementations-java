
import java.util.Scanner;

public class SwapTwoNumbers {

	/* Write a program to swap two numbers without using a temporary variable */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter 1st number: ");
		int var_1 = s.nextInt();

		System.out.print("Enter 2nd number: ");
		int var_2 = s.nextInt();

		//Display the original numbers
		System.out.println("Before Swap 1st number is: "+var_1+" 2nd number is: "+var_2);

		//Work is done over here 
		var_1 = var_1 + var_2;
		var_2 = var_1 - var_2;
		var_1 = var_1 - var_2;

		System.out.println("After Swap 1st number is: "+var_1+" 2nd number is: "+var_2);
	}
}