
import java.util.Scanner;

public class Floyd {

	/* Write a program to print a Floyd's Triangle using nested loops */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of rows :- ");
		int row_number = s.nextInt();

		int n=1;

		//Usage of Nested Loops
		for(int i=1; i<=row_number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}
}