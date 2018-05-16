package com.zhouxianwen.test.algorithms.sorts.heap;

import com.zhouxianwen.algorithms.Sorts._07_Heap_Sort.HeapSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class HeapSortTest {
    //Test data
    int[] numbers = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };

    /**
     * Heap sort test method.
     */
    @Test
    public void heapSortTest(){
        System.out.println(Arrays.toString(HeapSort.heapSort(numbers)));
    }
}
