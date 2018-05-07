package com.zhouxianwen.algorithms.Sorts._03_Select_Sort;


/**
 *Select sort
 */
public class SelectSort {

    /**
     *Select sort method.
     * @param numbers : a int array
     */
    public static int[] selectSort(int[] numbers){
        //The template variable.
        int temp;

        for(int i = 0; i < numbers.length - 1; i++){
            int selected = i;
            for(int j = numbers.length - 1; j > i; j--){
                if(numbers[j] < numbers[selected]){
                    selected = j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[selected];
            numbers[selected] = temp;
        }
        return numbers;
    }
}
