package com.spandiar.somethingFresh;

public class someArgumentPassingExercise {

	public someArgumentPassingExercise() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Trying to interate through the arguments array");
		int i=0;
		
		do {
		System.out.println("\n Argument " + i + " is: " + args[i]);
		i++;
	}while(i<args.length);
 }
}
