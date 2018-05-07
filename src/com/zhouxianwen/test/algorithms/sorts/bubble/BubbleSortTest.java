package com.zhouxianwen.test.algorithms.sorts.bubble;

import com.zhouxianwen.algorithms.Sorts._01_Bubble_Sort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

/**
 *Just do a simple testing by JUnit4.
 */
public class BubbleSortTest {
    //Test data
    int[] numbers = {22, 44, 33, 11, 55, 88, 66};

    /**
     *Test method.
     */
    @Test
    public void bubbleSortTest(){
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(numbers)));
    }
}
