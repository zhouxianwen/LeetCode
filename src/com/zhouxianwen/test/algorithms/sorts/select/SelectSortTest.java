package com.zhouxianwen.test.algorithms.sorts.select;

import com.zhouxianwen.algorithms.Sorts._03_Select_Sort.SelectSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class SelectSortTest {
    //Test data
    int[] numbers = {22, 44, 33, 11, 55, 88, 66};

    /**
     * Select sort test method.
     */
    @Test
    public void selectSortTest(){
        System.out.println(Arrays.toString(SelectSort.selectSort(numbers)));
    }
}
