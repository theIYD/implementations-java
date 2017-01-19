
import java.util.Scanner;
import java.util.Random;

public class RNGenerator {

	public static final int MIN = 1000;
	public static final int MAX = 100000;

	public static void main(String [] args) {

		Scanner s = new Scanner(System.in);

		Random rand = new Random();
		int range = (MAX - MIN) + 1;
		int randomNum = rand.nextInt(range) + MIN;

		System.out.println("Random Number :- "+randomNum);
	}
}