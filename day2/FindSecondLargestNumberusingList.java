package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		 int[] num={3, 2, 11, 4, 6, 7};
		 List<Integer> list= new ArrayList<Integer>();
		 for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
		}
	
		Collections.sort(list);
		System.out.println("The secong largest number is " +list.get(list.size()-2));
		
		
		
		
		
		
	}

}
