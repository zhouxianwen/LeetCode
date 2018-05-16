package com.zhouxianwen.test.algorithms.sorts.base;

import com.zhouxianwen.algorithms.Sorts._09_Base_Sort.BaseSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class BaseSortTest {
    //Test data
    int[] numbers = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };

    /**
     * Base sort test method.
     */
    @Test
    public void baseSortTest(){
        System.out.println(Arrays.toString(BaseSort.baseSort(numbers)));
    }
}
