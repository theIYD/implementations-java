
import java.util.Scanner;

public class palindrome {

	/* Write a program to check if the number entered 
		by the user is a palindrome or not. Display the required result */

	public static void checkPalindrome(int number) {

		int temp = number;
		int sum=0, remainder;

		while(number>0) {
			remainder = number%10;
			sum = (sum*10) + remainder;
			number = number/10;
		}

		if(temp==sum) {
			System.out.println("A Palindrome number");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number :- ");
		int acceptNumber = s.nextInt();

		//Call checkPalindrome() function 
		checkPalindrome(acceptNumber);

	}
}