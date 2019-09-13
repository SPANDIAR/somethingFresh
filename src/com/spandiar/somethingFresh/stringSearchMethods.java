package com.spandiar.somethingFresh;

public class stringSearchMethods {

	public stringSearchMethods() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		String complete;
		String search;
		
		complete = args[0];
		search = args[1];
		System.out.println("User entered text is : " + complete);
		System.out.println("User entered search text is : " + "\'" + search + "\'");
		
		System.out.println("User search string found in user string - Case Sensitive : " + complete.contains(search));
		System.out.println("User search string found in user string - Case In-Sensitive : " + complete.toLowerCase().contains(search.toLowerCase()));
		
		//complete = "New value";
		//System.out.println("New value of complete is : " + complete);
	}

}
