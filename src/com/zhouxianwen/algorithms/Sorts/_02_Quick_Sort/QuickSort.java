package com.zhouxianwen.algorithms.Sorts._02_Quick_Sort;

/**
 *Quick sort
 */
public class QuickSort {

    /**
     *Quick sort method
     * @param numbers : an array
     * @param start : 0
     * @param end : numbers.length - 1
     * @return : an orderly array
     */
    public static int[] quickSort(int[] numbers, int start, int end){
        if(start < end){
            //To choose the base value,it's usually the first one.
            int base = numbers[start];
            //A template variable.
            int temp;
            int i = start;
            int j = end;

            do{
                while (numbers[i] < base && i < end) i++;

                while (numbers[j] > base && j > start) j--;

                if(i <= j){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    i++;
                    j--;
                }

            } while (i <= j);

            if(start < j){
                quickSort(numbers, start, j);
            }

            if(end > i){
                quickSort(numbers, i, end);
            }
        }
        return numbers;
    }
}
