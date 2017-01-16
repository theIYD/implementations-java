
import java.util.Scanner;

public class hextoBinary {

	/* A program to convert Hexadecimal number to Binary */

	public static int hextobinary(String s) {

		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();

		int value = 0;

		for(int i=0; i<s.length(); i++) {

			char character = s.charAt(i);
			int temp = digits.indexOf(character);
			value = 16*value + temp;
		}
		return value;
	}

	public static void main(String[] args) {

		String hexDecNum;
		int decNum, i=1, j;
		int binaryNum[] = new int[100];

		Scanner s = new Scanner(System.in);

		try{
				System.out.println("Enter Hex Number :- ");
				hexDecNum = s.nextLine();

				decNum = hextobinary(hexDecNum);

				while(decNum!=0) {
					binaryNum[i++] = decNum%2;
					decNum = decNum/2;
				}

				System.out.print("Equivalent Binary Number is :- \n");
				for(j=i-1; j>0; j--) {
					System.out.print(binaryNum[j]);
				}

				System.out.println("");

			}catch(Exception e) {
				System.out.println("Invalid Number !");
			}

		
	}
}