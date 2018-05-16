package com.zhouxianwen.test.algorithms.sorts.binaryInsert;

import com.zhouxianwen.algorithms.Sorts._06_BinaryInsert_Sort.BinaryInsertSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class BinaryInsertSortTest {
    //Test data
    int[] numbers = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };

    /**
     * Binary insert sort test method.
     */
    @Test
    public void binaryInsertSortTest(){
        System.out.println(Arrays.toString(BinaryInsertSort.binaryInsertSort(numbers)));
    }
}
