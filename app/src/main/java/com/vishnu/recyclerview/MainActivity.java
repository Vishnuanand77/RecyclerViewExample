package com.vishnu.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;

    String s1[], s2[];
    int images[] = {R.drawable.androidstudio_logo, R.drawable.cpp, R.drawable.c_sharp_logo,
            R.drawable.java, R.drawable.javascript_logo, R.drawable.kotlin_logo,
            R.drawable.python_logo, R.drawable.ruby_logo, R.drawable.swift_logo,
            R.drawable.visualstudiocodelogo, R.drawable.html, R.drawable.css};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.programmingLanguages);
        s2 = getResources().getStringArray(R.array.Descriptions);

        recycle.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, s1,s2, images);
        recycle.setAdapter(myadapter);




    }

}
