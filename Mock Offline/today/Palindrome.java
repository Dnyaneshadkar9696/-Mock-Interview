package today;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public void palindromeCheck() {

		Scanner s = new Scanner(System.in);

		String[] arr1 = new String[5];

		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<String> nonpali = new ArrayList<String>();

		System.out.println("Enter 5 Names : ");

		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = s.nextLine();

			// System.out.println(arr1[i]);

		}

		for (String d : arr1) {

			StringBuilder w = new StringBuilder(d);
			w.reverse();

			String s1 = w.toString();

//		System.out.println(w);
//		System.out.println(d);

			if (d.equals(s1)) {

//					System.out.println(paliArr[h]);
				ar.add(s1);

			} else {

				nonpali.add(d);

			}

		}

		// to print plindrome elements in array format

		System.out.println(ar);
		System.out.println(nonpali);

	}

}
