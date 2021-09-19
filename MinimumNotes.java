package com.greatlearning.main;
import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// accept number of denominations (eg. 3) - size
		System.out.println("Enter the number of denominations");
		int noteArrSize = sc.nextInt();
		
		// allocate a notes array of that size
		int[] notes = new int[noteArrSize];
		
		// accept the denominations (loop)
		System.out.println("Enter the denominations");
		for(int i=0; i < noteArrSize; i++) {
			notes[i] = sc.nextInt();
		}
		
		// accept the amount
		System.out.println("Please enter the amount");
		int amount = sc.nextInt();
		
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( notes, 0, notes.length - 1 );
		
		// Go through the notes array
		int[] numNotes = new int[noteArrSize];
		for( int i = 0; i < notes.length; i++ ) {
			// Find out how many of the current note (denomination) needs to be paid and make note of it (in another array)
			numNotes[i] = (int) ( amount / notes[i] );
			amount = amount % notes[i]; // remaining amount
		}
		
		if( amount != 0 ) {
			System.out.println( "Not possible to pay" );
		} else {
			for( int i = 0; i < noteArrSize; i++ ) {
				System.out.println( notes[i] + " : " + numNotes[i] );
			}
		}
	}
}
