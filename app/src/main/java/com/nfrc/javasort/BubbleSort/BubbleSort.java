package com.nfrc.javasort.BubbleSort;

/**
 * Created by zhangl on 2018/11/26.
 */

public class BubbleSort {


    public int[] bubbleSore(int[] a){
        int max = a.length - 1;
        for (int i = 0;i < max;i++){
            for (int j = 0;j < max;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }


}
