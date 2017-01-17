
public class primeNumbers {

	public static void main(String[] args) {

	  int limit = 50, counter;

	  for (int i = 2; i <= limit; i++) {

		   counter = 0;
		   for (int j = 2; j <= i / 2; j++) {

			    if (i % j == 0) {
			     counter++;
			     break;
			    }

		   }

			   if (counter == 0) {
			    System.out.println(i);
			   }
		}
 }
}