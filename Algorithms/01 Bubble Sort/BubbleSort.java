package com.aspentech.algorithms.sort;
/**
 * @author DearTurnsole
 *
 */
public class BubbleSort {

	/**
	 * the integer array need to sort 
	 * @param numbers
	 */
	public static void bubbleSort(int[] numbers) {   
	    int temp; // A temporary variable to record centre value
	    int size = numbers.length;
	    for (int i = 0; i < size - 1; i++) {   
	        for (int j = 0; j < size -i -1; j++) {   
	            if (numbers[j] < numbers[j + 1]) { //Change the position
	                temp = numbers[j];   
	                numbers[j] = numbers[j + 1];   
	                numbers[j + 1] = temp;   
	            }   
	        }   
	    }   
	}  
}
