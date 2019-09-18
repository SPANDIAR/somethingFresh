package com.spandiar.somethingFresh;

import java.util.HashMap;
import java.util.Map;

public class someSubstringExercise {

	public someSubstringExercise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "abcdeabc";
		String target;
		char[] checkDuplicates;
		HashMap<String, Integer> targetCollection = new HashMap<String, Integer>();
		boolean addToMap;
		//char[] findSource = source.toCharArray();
		
		for(int i=0; i<source.length();i++) {
			for (int j=i+1;j<=source.length();j++) {
				
				addToMap = true;
				target = source.substring(i, j);
				
				// check if the same character is repeated in the substring
				checkDuplicates = target.toCharArray();
				
				for (int k=0; k<checkDuplicates.length;k++) {
					
					if((target.indexOf(checkDuplicates[k], k+1)) > 0) {
						addToMap = false;
						break;
					} 
				}
				
				if (addToMap) 
					// add to the map only if there are no repeating characters
					targetCollection.put(target, target.length());
			}
		}
		
		//System.out.println("Possible Substring values below");
		System.out.println("Possible combinations are : " + targetCollection.size());
		System.out.println("\n");
		
		for(Map.Entry<String, Integer> subStrings: targetCollection.entrySet() ) {
			System.out.println("Substring is: " + subStrings.getKey() + " and size is: " + subStrings.getValue());
		}
		
	}
}



