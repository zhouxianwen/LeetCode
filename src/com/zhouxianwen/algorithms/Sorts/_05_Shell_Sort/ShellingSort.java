package com.zhouxianwen.algorithms.Sorts._05_Shell_Sort;

/**
 * Shell Sort
 */
public class ShellingSort {

    /**
     *Shelling sort method.
     * @param numbers : an int array
     * @return : an orderly array
     */
    public static int[] shellingSort(int[] numbers){
        int d = numbers.length;
        while (true){
            //
            d = d/2;
            for (int x = 0;x < d;x++){
                for (int i = x + d;i < numbers.length;i =i + d){
                    int temp = numbers[i];
                    int j;
                    for (j = i - d;j >= 0 && numbers[j] > temp;j = j -d){
                        //
                        numbers[j + d] = numbers[j];
                    }
                    //
                    numbers[j + d] = temp;
                }
            }
            //
            if(d == 1) break;
        }
        return numbers;
    }
}
