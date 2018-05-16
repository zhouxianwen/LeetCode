package com.zhouxianwen.test.algorithms.sorts.shelling;

import com.zhouxianwen.algorithms.Sorts._05_Shell_Sort.ShellingSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Just do a simple testing by JUnit4.
 */
public class ShellingSortTest {
    //Test data
    int[] numbers = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };

    /**
     * Shell Sort test method
     */
    @Test
    public void shellingSortTest(){
        System.out.println(Arrays.toString(ShellingSort.shellingSort(numbers)));
    }
}
