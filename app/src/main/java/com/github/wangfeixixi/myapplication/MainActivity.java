package com.github.wangfeixixi.myapplication;

import android.view.SurfaceView;
import android.widget.Toast;

import wangfei.scan2.Scan2Activity;
import wangfei.scan2.client.android.AutoScannerView;

public class MainActivity extends Scan2Activity {


    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected AutoScannerView getAutoScannerView() {
        return (AutoScannerView) findViewById(R.id.autoScanner);
    }

    @Override
    public SurfaceView getSurfaceView() {
        return (SurfaceView) findViewById(R.id.surfaceView);
    }

    @Override
    public void handleResult(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        finish();
    }
}
