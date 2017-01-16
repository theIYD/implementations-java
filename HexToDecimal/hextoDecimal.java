
import java.util.Scanner;

public class hextoDecimal {

	/* Write a program to illustrate the use of parseInt function by converting 
	a Hexa Decimal Number to a Decimal Number. Display the required output. */


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the hex code :- ");
		String acceptHex = s.nextLine();

		try{

			int displayDec = Integer.parseInt(acceptHex, 16);
			System.out.println("Decimal Equivalent :- " + displayDec);

		}catch(NumberFormatException n) {
			System.out.println("Invalid input !");
		}
	}
}