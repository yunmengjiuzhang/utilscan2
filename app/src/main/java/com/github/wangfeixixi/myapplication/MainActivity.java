package com.github.wangfeixixi.myapplication;

import android.widget.Toast;

import wangfei.scan2.Scan2Activity;

public class MainActivity extends Scan2Activity {


    @Override
    public void handleResult(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        finish();
    }
}
