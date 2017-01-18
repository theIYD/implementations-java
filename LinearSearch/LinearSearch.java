
import java.util.Scanner;

public class LinearSearch {

	/* Write a program to accept an array and search for an element using the Linear Search Technique */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int j;

		//Initialize an empty array
		int[] array = new int[5];

		//Accept the array
		System.out.println("Enter the array :-");
		for(int i=0; i<5; i++) {
			array[i] = s.nextInt();
		}

		//Accept the element to be searched
		System.out.print("Enter the value to be searched :- ");
		int find_element = s.nextInt();

		//Search for the element
		for(j=0; j<array.length; j++){
			if(array[j] == find_element) {
				System.out.println("Your element is found at "+(j+1));
				break;
			}
			
		}

		//If element not found
		if(j==array.length) {
			System.out.println("Element not found");
		}

	}
}