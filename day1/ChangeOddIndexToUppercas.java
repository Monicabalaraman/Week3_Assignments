package week3.day1;

public class ChangeOddIndexToUppercas {

	public static void main(String[] args) {
		String data="changeme";
		char[] Arstr = data.toCharArray();
		for (int i = 0; i < Arstr.length; i++) {
			if ((i%2)!=0) {
				System.out.print(Character.toUpperCase(Arstr[i]));
			}else {
				System.out.print(Arstr[i]);
			}
			
		}
		
		
		
		

	}

}
