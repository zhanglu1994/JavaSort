package com.nfrc.javasort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nfrc.javasort.BubbleSort.BubbleSort;
import com.nfrc.javasort.InsertionSort.InsertionSort;
import com.nfrc.javasort.SelectionSort.SelectionSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] a = {15000,21,0,3,9,5,1,2,10,100,30,55,900,11,1000000000,845,123456,98754};


        int[]b = BubbleSort.bubbleSore(a);        //冒泡法



//        int[]b = InsertionSort.insertSort(a);       //插入法

//        int[]b = SelectionSort.selectSort(a);       //选着排序法


        for (int i = 0;i < b.length;i++){
            Log.e("AAA",b[i] + "");
        }


    }

    void bubblesort(int arrayVal[],int length)
    {
        int i,j;
        int temp;

        for(i=0;i<length-1;i++)
            for(j=i+1;j<length;j++)
                if(arrayVal[i]>arrayVal[j])
                {
                    //置换位置
                    temp=arrayVal[i];
                    arrayVal[i]=arrayVal[j];
                    arrayVal[j]=temp;
                }
    }

}
