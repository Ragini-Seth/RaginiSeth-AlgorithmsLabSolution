package com.greatlearning.main;

import java.util.Scanner;

public class Transaction {
	private static final Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		int arr_size, i, j, k;
		
		// Take in number of transactions (size)
		System.out.println("Please enter the number of transactions: ");
		arr_size = sc.nextInt();
		
		// Create an array of that size
		int[] transactionArr = new int[arr_size];
		
		System.out.println("Enter the transactions");
		// Use a loop to get each transaction value (populate the array)
		for(i = 0; i < transactionArr.length; i++) {
			transactionArr[i] = sc.nextInt();
		}
		
		// Take in the number of targets
		System.out.println("Enter the number of targets");
		int num_targets = sc.nextInt();
		
		// Take in target one-by-one (loop) and immediately find if target is reached or not
			// if reached then after how many transaction
		for (j = 0; j < num_targets; j++) {
			System.out.println("Enter the target");
			int target = sc.nextInt();
			int sum = 0;
			
			for (k = 0; k < transactionArr.length; k++) {
				sum = sum + transactionArr[k];
				if(sum >= target) {
					System.out.println("Target acheived after " + (k + 1) + " transactions");
					break;
				}
				
				if(k == transactionArr.length - 1) {
					System.out.println("Target not acheived");
				}
			}
		}
	}
}
