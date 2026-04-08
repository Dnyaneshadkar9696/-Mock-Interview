package today;

import java.util.Scanner;

public class StringToAscii {
	
	public void stringtoAcii() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Five Names : ");
		String n1 = s.nextLine();
		String n2 = s.nextLine();
		String n3 = s.nextLine();
		String n4 = s.nextLine();
		String n5 = s.nextLine();

		
	

		
	
		
		
		// for each name we have to find vowel and consonants and then print them
		
	   n1.toCharArray();
	   n1.toCharArray();
	   n1.toCharArray();
	   n1.toCharArray();
	   n1.toCharArray();

	
	  
	   // 1
	   int countVn1 = 0;
	   int countOn1 = 0;
	   for(int i = 0; i < n1.length(); i++) {
		   char ch = n1.charAt(i);
		   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   countVn1++;
		   }else if(ch == ' ') {
			   continue;
		   }
		   else {
			   countOn1++;
		   }
	   }
	   
	   int result = countVn1 * countOn1;
	   
	   char chd = (char) result;
	   
	   System.out.println("Acii  value is 1st name: "+chd);
	   
	   
	   
	// 2
	   int countVn2 = 0;
	   int countOn2 = 0;
	   for(int i = 0; i < n2.length(); i++) {
		   char ch = n2.charAt(i);
		   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   countVn2++;
		   }else if(ch == ' ') {
			   continue;
		   }
		   else {
			   countOn2++;
		   }
	   }
	   
	   int result2 = countVn2 * countOn2;
	   
	   char chd2 = (char) result2;
	   
	   System.out.println("Acii  value is Second Name: "+chd2);
	   
	   
	   
		// 3
	   int countVn3 = 0;
	   int countOn3 = 0;
	   for(int i = 0; i < n3.length(); i++) {
		   char ch = n3.charAt(i);
		   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   countVn3++;
		   }else if(ch == ' ') {
			   continue;
		   }
		   else {
			   countOn3++;
		   }
	   }
	   
	   int result3 = countVn3 * countOn3;
	   
	   char chd3 = (char) result3;
	   
	   System.out.println("Acii  value is Third Name: "+chd3);
	   
	   
		// 4
	   int countVn4 = 0;
	   int countOn4 = 0;
	   for(int i = 0; i < n4.length(); i++) {
		   char ch = n4.charAt(i);
		   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   countVn4++;
		   }else if(ch == ' ') {
			   continue;
		   }
		   else {
			   countOn4++;
		   }
	   }
	   
	   int result4 = countVn4 * countOn4;
	   
	   char chd4 = (char) result4;
	   
	   System.out.println("Acii  value is Fourth Name: "+chd4);
	   
	   
		// 5
	   int countVn5 = 0;
	   int countOn5 = 0;
	   for(int i = 0; i < n5.length(); i++) {
		   char ch = n5.charAt(i);
		   
			   
		   
		   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			   countVn5++;
		   }
		   else if(ch == ' ') {
			   continue;
		   }
		   else {
			   countOn5++;
		   
		   }
	   }
	   
	   int result5 = countVn5 * countOn5;
	   
	   char chd5 = (char) result5;
	   
	   System.out.println("Acii  value is Fifth Name: "+chd5);


		
	}

}
