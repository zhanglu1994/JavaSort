package com.nfrc.javasort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nfrc.javasort.BubbleSort.BubbleSort;
import com.nfrc.javasort.InsertionSort.InsertionSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] a = {15000,21,0,3,9,5,1,2,10,100,30,55};


//        int[]b = BubbleSort.bubbleSore(a);        //冒泡法



        int[]b = InsertionSort.insertSort(a);       //插入法


        for (int i = 0;i < b.length;i++){
            Log.e("AAA",b[i] + "");
        }


    }
}
