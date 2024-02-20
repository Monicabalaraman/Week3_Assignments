package week3.day1;

public class ReverseOddStrings {

	public static void main(String[] args) {
		String text="I am a software tester";
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (!(i%2==0)) {
				char[] charArray = split[i].toCharArray();
				for (int j =charArray.length-1; j>=0 ; j--) {
					System.out.print(charArray[j]);
				}
					
			} else {
System.out.print(" " +split[i] +" ");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
