// Count the number of times a character repeats in a paragraph

package com.spandiar.somethingFresh;

public class searchCharacterCount {

	public searchCharacterCount() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		byte alphabet;
		String paragraph = "Hello there, U lets check uuuu which character is repeated the most zzz";
		int[] charCount = new int[26];
		//char[] charCount = new char[26];
		char[] searchString = paragraph.toUpperCase().toCharArray();
		
		for (i=0;i<searchString.length;i++) {
			
			alphabet = (byte)searchString[i];
			if ((alphabet >= 'A') && (alphabet <= 'Z'))
			charCount[alphabet - 'A']++;
		}
		
		System.out.println("Character counts below");
		
		for(i='A';i<='Z';i++) {
			System.out.println("Character " + (char) i + " repeats " + charCount[i-65] + " times");
		}
		

	}

}
