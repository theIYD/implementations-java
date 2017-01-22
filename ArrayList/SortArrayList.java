
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {

	public static void main(String[] args) {

		//Create ArrayList object
		ArrayList arraylist = new ArrayList();

		//Add elements 
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);

		//use reverseOrder() function from Collections
		Comparator comparator = Collections.reverseOrder();
		System.out.println("Before sort :- "+arraylist);

		//use sort(List list, Comparator com) from Collections
		Collections.sort(arraylist, comparator);
		System.out.println("After Sort :- "+arraylist);

	}
}