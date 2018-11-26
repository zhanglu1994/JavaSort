package com.nfrc.javasort.InsertionSort;

/**
 * Created by zhangl on 2018/11/26.
 */

public class InsertionSort {

    public static int[] insertSort(int[] numbers) {
        int size = numbers.length;
        int temp = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            temp = numbers[i];
            //假如temp比前面的值小，则将前面的值后移
            for (j = i; j > 0 && temp < numbers[j - 1]; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = temp;
        }
        return numbers;
    }


}
