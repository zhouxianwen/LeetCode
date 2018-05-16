package com.zhouxianwen.test.algorithms.sorts.merge;

import com.zhouxianwen.algorithms.Sorts._08_Merge_Sort.MergeSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class MergeSortTest {
    //Test data
    int[] numbers = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };

    /**
     * Merge sort test method.
     */
    @Test
    public void mergeSortTest(){
        System.out.println(Arrays.toString(MergeSort.mergeSort(numbers)));
    }
}
