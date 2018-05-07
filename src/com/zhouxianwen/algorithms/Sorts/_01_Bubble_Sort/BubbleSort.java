package com.zhouxianwen.algorithms.Sorts._01_Bubble_Sort;

/**
 *Bubble sort
 */
public class BubbleSort {

    /**
     *Bubble sort method
     * @param numbers : a int array
     */
    public static int[] bubbleSort(int[] numbers){
        //A template variable.
        int temp;
        //The size for the array.
        int n = numbers.length - 1;
        while (n > 0){
            //It's a mark index for the next loop
            int pos = 0;
            for(int i = 0; i < n; i++){
                if(numbers[i] > numbers[i + 1]){
                    //To record this value's index
                    pos = i;
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            //The next loop is start from the recorded index,not need start from 0;
            n = pos;
        }
        return numbers;
    }
}
