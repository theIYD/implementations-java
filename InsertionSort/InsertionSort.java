
public class InsertionSort {

	/* Write a program to sort the given array using Insertion Sort Technique.
		Given: array = {98,75,46,1,0,65,3} */

	public static void main(String[] args) {

		//Initialize given array
		int[] array = {98,75,46,1,0,65,3};

		for(int i=1; i<array.length; i++){
			int key = array[i];
			int j = i-1;

			//Shifting process
			while((j>-1) && (array[j]>key)){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}

		//Print the sorted array
		for(int z = 0; z<array.length; z++) {
			System.out.println(array[z]);
		}
	}
}