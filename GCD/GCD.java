
import java.util.Scanner;

public class GCD {

	/* Write a program to calculate the GCD among two numbers using the Euclidean's Algorithm */

	public static void calculateGCD(int numb1, int numb2) {

		if(numb1!=numb2) {
			int remain1 = numb1%numb2; 
			int remain2 = numb2%remain1; 

			// Handle Exception
			try {
				int remain3 = remain1%remain2;

				if(remain3==0) {
					System.out.println("GCD is :- "+ remain2);
				}
				else {
					System.out.println(remain1);
				}

			}catch(ArithmeticException a) {
				System.out.println("error");
			}	

		} 
		else {
			System.out.println("Numbers equal");
		}

	}

	public static void main(String[] args) {

			calculateGCD(119,68);
	}
}