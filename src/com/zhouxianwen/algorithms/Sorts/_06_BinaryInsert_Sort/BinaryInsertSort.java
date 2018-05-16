package com.zhouxianwen.algorithms.Sorts._06_BinaryInsert_Sort;

/**
 * Binary Insert
 * 基本思想：二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，
 * and it's just to find the position by using the Binary, maybe can reduce more comparable times.
 */
public class BinaryInsertSort {

    /**
     *Binary insert sort method.
     * @param numbers : an int array
     * @return : an orderly array
     */
    public static int[] binaryInsertSort(int[] numbers){
        for (int i = 0;i < numbers.length;i++) {
            int temp = numbers[i];
            //The left side.
            int left = 0;
            //Then right side.
            int right = i - 1;
            //
            int mid;
            while (left <= right) {
                mid = (left + right) / 2;
                if (temp < numbers[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            //
            for (int j = i - 1;j >= left;j--) {
                numbers[j + 1] = numbers[j];
            }
            //
            if (left != i) {
                numbers[left] = temp;
            }
        }
        return numbers;
    }
}
