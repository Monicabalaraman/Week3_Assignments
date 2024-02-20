package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 10, 6, 8};
		List<Integer> missing=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			missing.add(arr[i]);
		}
	Collections.sort(missing);
	Integer largest = missing.get(missing.size()-1);
	System.out.print("The missing elements are ");
	 for (int i = 1; i < largest; i++) {
		if (!(missing.contains(i))) {
			System.out.print(" "+i);
		}
	}
		
		
		
		
		
	}

}
