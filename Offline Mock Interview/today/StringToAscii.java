package today;

import java.util.Scanner;

public class StringToAscii {

	public void stringtoAcii() {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Five Names : ");
		
		int n = 5;

		for(int i = 0 ; i < n; i++) {
			
			int countVn1 = 0 ;   
			int countOn1 = 0 ;   
			
			String n1 = s.nextLine();
			
		
			// converted to the array the first element
			
			// now we have to traverse through the each element of the string
			for(int j = 0 ; j < n1.length(); j++) {
				
				char ch = n1.charAt(j);
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
				   || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					   countVn1++;
				   } 
				   else if(ch == ' ') {
					   continue;
				   }
				   else {
					   countOn1++;
				   }
			}
			
			int result = countVn1 * countOn1;
			   
			char chd = (char) result;
			   
			System.out.println("Acii  value for the name is " + chd);
		}
	}
}
