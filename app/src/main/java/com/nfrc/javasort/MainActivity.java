package com.nfrc.javasort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.nfrc.javasort.BubbleSort.BubbleSort;

public class MainActivity extends AppCompatActivity {

    TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int[] a = {15000,21,0,3,9,5,1,2,10,100,30,55};

        BubbleSort bubbleSort = new BubbleSort();
        int[]b = bubbleSort.bubbleSore(a);
        for (int i = 0;i < b.length;i++){
            Log.e("AAA",b[i] + "");
        }

    }
}
