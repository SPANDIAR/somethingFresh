package com.spandiar.somethingFresh;

public class stringManipulations {

	public stringManipulations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nameStraight, nameReverse;
		
		
		nameStraight = args[0];
		int i=nameStraight.length();
		int j=0;
		char[] charNameReverse = new char[i];
		
		System.out.println("Input string is : " + nameStraight);
		
		do {
			i--;
			System.out.println(nameStraight.charAt(i));
			charNameReverse[j]=nameStraight.charAt(i);
			j++;
		}while(i>0);
	
		nameReverse = new String(charNameReverse);
		System.out.println("Reversed string is : " + nameReverse);
		
		//byte[] nameArray = new byte[]();
//		byte[] nameArray;
//		
//		
//		int i=0;
//		int j;
//		
//		nameStraight = "Tanishka";
//		nameArray = nameStraight.getBytes();
//		
//		
//		//System.out.println("Character Stream is " + nameStraight.chars());
//		
//		j = nameArray.length;
//		byte[] nameArrayReverse = new byte[j];
//		i=0;
//		
//		do {
//			j--;
//			nameArrayReverse[i]=nameArray[j];
//			i++;
//		}while(j>0);
//		
//		i=0;
//		
//		do {
//			System.out.println("\n" + nameArray[i] + " - " + nameArrayReverse[i]);
//			i++;
//		}while(i<nameArray.length);
//		
//		String nameReverse = new String(nameArrayReverse);
//		System.out.println("String reverse is: " + nameReverse);

	}

}
