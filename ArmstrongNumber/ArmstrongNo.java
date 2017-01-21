
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {

		int number, sum=0, temp, r;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number :- ");
		number = s.nextInt();

		temp = number;
		while(temp!=0) {

			r=temp%10;
			sum = sum + r*r*r;
			temp = temp/10;
		}

		if(number==sum) {
			System.out.println(number + " is an Amstrong Number !");
		}
		else{
			System.out.println(number + " is not an Armstrong Number !");
		}
	}
}