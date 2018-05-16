package com.zhouxianwen.algorithms.Sorts._04_Insert_Sort;

/**
 *Insert Sort
 */
public class InsertSort {

    /**
     *Insert sort method.
     * @param numbers : an int array
     * @return : an orderly array
     */
    public static int[] insertSort(int[] numbers){
        int temp;
        int j;
        for (int i = 1; i < numbers.length;i++){
            //Save current element i position, and [0,i - 1] have ordered already.
            temp = numbers[i];
            for (j = i; j > 0 && temp < numbers[j - 1];j--){
                //Move one position backward
                numbers [j] = numbers[j - 1];
            }
            //Insert it into better position
            numbers[j] = temp;
        }
        return numbers;
    }

}
