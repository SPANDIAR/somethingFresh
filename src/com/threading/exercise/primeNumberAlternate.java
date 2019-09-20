package com.threading.exercise;

public class primeNumberAlternate {

	public primeNumberAlternate() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkPrime(int checkNumber) {
		
		boolean result=false;
		double root = Math.sqrt(checkNumber);
		for(int i=2; i<=root;i++) {
			//result = true;
			if(root%i == 0) {
				result = false;
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=false;
		int checkPrime = 13;
		primeNumberAlternate checkIfPrime = new primeNumberAlternate();
		isPrime = checkIfPrime.checkPrime(checkPrime);
		System.out.println("Chosen Number: " + checkPrime + " Is that Prime: " + isPrime);

	}

}
