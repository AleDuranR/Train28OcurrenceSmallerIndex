package com.train28ocurrencesmallerindex.app;

import java.util.Random;
public class SmallerIndex {

	public static void main(String[] args) {
		/*
		 * Given an array a that contains only numbers in the range from 1 to a.length, 
		 * find the first duplicate number for which the second occurrence has the minimal index. 
		 * In other words, if there are more than 1 duplicated numbers, return the number for 
		 * which the second occurrence has a smaller index than the second occurrence of the 
		 * other number does. If there are no such elements, return -1.
		 * 
		 * Example
		 * For a = [2, 1, 3, 5, 3, 2], the output should be firstDuplicate(a) = 3.
		 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index 
		 * than the second occurrence of 2 does, so the answer is 3.
		 * 
		 */
		
		// Constant declaration
		final int ELEMENTS_ARRAY = 10;
		
		// Variables declaration
		int len = ELEMENTS_ARRAY;
		int numberFound = -1;
		boolean isFound = false;
		// Array declaration
		 int[] myArray = new int[ELEMENTS_ARRAY];
		// Object construction
		Random randomNumber = new Random(System.nanoTime());
				
		// Fill array with random numbers and print
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			myArray[i] = randomNumber.nextInt(10);
			System.out.print(myArray[i]+ " ");
		}

		// Process
		for(int i = 0; i < myArray.length; i++) {
			for(int j = i + 1; j < len; j++) {
				if(myArray[i] == myArray[j]) {
					isFound = true;
					len = j;
					numberFound = myArray[i];
				}
			}
		}
		// Output
		if(!isFound) {
			System.out.format("\n-1");
		}
		else {
			System.out.format("\n%d", numberFound);
		}	
	}
}
