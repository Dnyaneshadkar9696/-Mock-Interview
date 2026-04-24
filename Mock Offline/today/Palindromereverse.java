package today;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindromereverse {
	
	
	
	public void palindromRev() {
		
		Scanner s = new Scanner(System.in);

		String[] arr1 = new String[5];


		System.out.println("Enter 5 Names : ");
		
		
		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> nonpali = new ArrayList<String>();
		
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = s.nextLine();

			// System.out.println(arr1[i]);

		}
		
		
		
		
		for(String ds : arr1) {
			
			String temp = "";
			
			for(int j = ds.length()-1; j >= 0; j--) {
				char ch = ds.charAt(j);
				temp = temp + ch;
			}
			
			if(ds.equals(temp)) {
				
				ar.add(temp);
				
			}
			else {
				nonpali.add(temp);
				
			}
			
		}
		
		System.out.println("Palindrome: ");
		System.out.println(ar);
		System.out.println("Non - Palindrome: ");
		System.out.println(nonpali);
		
		
	}

}
