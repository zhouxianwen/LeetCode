package com.zhouxianwen.test.algorithms.sorts.insert;

import com.zhouxianwen.algorithms.Sorts._04_Insert_Sort.InsertSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class InsertSortTest {
    //Test data
    int[] numbers = {22, 44, 33, 11, 55, 88, 66};

    /**
     * Test method.
     */
    @Test
    public void insertSortTest(){
        System.out.println(Arrays.toString(InsertSort.insertSort(numbers)));
    }
}
