package com.cdh.githubdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cdh.githubdemolibrary.QuanquanView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new QuanquanView(this));
    }
}
