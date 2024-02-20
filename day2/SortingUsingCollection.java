package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		 String[] comp={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list=new ArrayList<String>();
		for (int i = 0; i < comp.length; i++) {
			list.add(comp[i]);
		}
Collections.sort(list);
for (int i = list.size()-1; i >=0; i--) {
	System.out.print(list.get(i) +", ");
}		
		
		
		
		
	}

}
