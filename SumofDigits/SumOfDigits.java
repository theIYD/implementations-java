import java.util.Scanner;

public class SumOfDigits {
 
	int total;

		public int CalcSumWithRec(int numb){
 
			if(numb==0){
				return total;
			}

			else{
 
				 total+=numb%10;
				 CalcSumWithRec(numb/10);
				 
				} 
 
					return total;
		}

		public static void main(String[] args) {
 
			int number;
			Scanner s = new Scanner(System.in);
			 
			System.out.println("Please enter a number");
			 
			number=s.nextInt(); 
			 
			SumOfDigits obj = new SumOfDigits();
			System.out.println("Sum of Digits = "+obj.CalcSumWithRec(number));
			 
		}
 
}