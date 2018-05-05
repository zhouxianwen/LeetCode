package com.zhouxianwen.algorithms.Sorts._02_Quick_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */
public class QuickSort {

    /**
     *
     * @param numbers : an array
     * @param start : 0
     * @param end : numbers.length - 1
     */
    public static void qucikSort(int[] numbers, int start, int end){
        if(start < end){
            //To choose the base value,it's usually the first one.
            int base = numbers[start];
            //To record the template value
            int temp = 0;
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
                qucikSort(numbers, start, j);
            }

            if(end > i){
                qucikSort(numbers, i, end);
            }

        }

    }

    ArrayList<String> list = new ArrayList<String>();

    HashMap<String,String> map = new HashMap<String,String>();

    public static void main(String[] args){
        int[] numbers = {22, 44, 33, 11, 55, 88, 66};
        qucikSort(numbers,0, numbers.length -1);

        System.out.println(Arrays.toString(numbers));
    }



}
