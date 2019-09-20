package com.threading.exercise;

import java.awt.List;
import java.util.ArrayList;

public class primeNumberIdentifier {
	
	private int limit;
	private ArrayList<Integer> primeNumbers;

	public primeNumberIdentifier() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Integer> primeNumberIdentifier(int range) {
		
		int i;
		int checkIfPrime = 1;
		int iterateSequence=0;
		boolean isPrime;
		
		if (range <= 2 || range >= 50) 
			this.limit = 25; 
		else 
			this.limit = range;
		
		this.primeNumbers = new ArrayList<Integer> ();
		
		while(primeNumbers.size() < this.limit) {
			
			isPrime = true;
			
			if (checkIfPrime == 1) {
				primeNumbers.add(iterateSequence, checkIfPrime);
				isPrime = false;
				iterateSequence++;
			} else if (checkIfPrime == 2) {
				primeNumbers.add(iterateSequence, checkIfPrime);
				isPrime = false;
				iterateSequence++;
			}
			else if (checkIfPrime == 3) {
				primeNumbers.add(iterateSequence, checkIfPrime);
				isPrime = false;
				iterateSequence++;
			}else {
				
				for (i=2; i<=(checkIfPrime/2); i++) {
					if (checkIfPrime % i == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if (isPrime) {
				primeNumbers.add(iterateSequence, checkIfPrime);
				iterateSequence++;
			}
			
			checkIfPrime++;
		}
		
		return primeNumbers;
		
	}
	
	public static void main(String[] args) {
		
		int limit = 50;
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
		primeNumberIdentifier checkPrimes = new primeNumberIdentifier();
		primeNumberList = checkPrimes.primeNumberIdentifier(limit);
		
		System.out.println("Prime Numbers list: ");
		for (Integer primeNum: primeNumberList) {
			System.out.print(", " + primeNum);
		}
		
	}

}
