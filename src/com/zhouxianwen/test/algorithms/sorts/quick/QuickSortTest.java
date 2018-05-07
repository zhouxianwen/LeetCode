package com.zhouxianwen.test.algorithms.sorts.quick;

import com.zhouxianwen.algorithms.Sorts._02_Quick_Sort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

/**
 *Just do a simple testing by JUnit4.
 */
public class QuickSortTest {
    //Test data
    int[] numbers = {22, 44, 33, 11, 55, 88, 66};

    /**
     * Quick sort test method
     */
    @Test
    public void quickSortTest(){
        System.out.println(Arrays.toString(QuickSort.quickSort(numbers, 0, numbers.length - 1)));
    }

}
