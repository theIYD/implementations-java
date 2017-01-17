
import java.util.Scanner;

public class fibonacci {

	/* Write a program to print the Fibonacci series */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the limit :-");
		int limit = s.nextInt();

		int firstnum = 0;
		int secondnum = 1;
		int randomNum;

		int n;

		for (n=2; n<limit; n++) {

			randomNum = firstnum + secondnum;
			System.out.println(randomNum);
			firstnum = secondnum;
			secondnum = randomNum;

		}
	}
}