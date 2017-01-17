
public class BubbleSort {

	/* Write a program to sort a given array using the Bubble Sort Technique. 
		Given :- array = {56,47,89,2,35} */

	public static void main(String[] args) {

		//Initialize the given array
		int[] array = {56,47,89,2,35};
		int i,j;

		try{

			for(i=0; i<array.length; i++) {
				for(j=1; j<array.length -i; j++){
					if(array[j-1]>array[j]){

							//swap elements
							int temp=0;
							temp = array[j-1];
							array[j-1] = array[j];
							array[j] = temp;
					}

				}

			}	
			
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}

		//Print the sorted array
		for(int k=0; k<array.length; k++) {
			System.out.println(array[k]);
		}
	}
}