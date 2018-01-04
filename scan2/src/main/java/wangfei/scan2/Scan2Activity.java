package wangfei.scan2;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.SurfaceView;

import wangfei.scan2.client.android.AutoScannerView;
import wangfei.scan2.globla.Result;

public abstract class Scan2Activity extends BaseCaptureActivity {

//    private AutoScannerView autoScannerView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
//        setContentView(R.layout.activity_scan_qr);
//        surfaceView = (SurfaceView) findViewById(R.id.preview_view);
//        autoScannerView = (AutoScannerView) findViewById(R.id.autoscanner_view);
    }

    protected abstract void initView();

    @Override
    protected void onResume() {
        super.onResume();
//        autoScannerView.setCameraManager(cameraManager);
        getAutoScannerView().setCameraManager(cameraManager);
    }

    protected abstract AutoScannerView getAutoScannerView();

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public abstract SurfaceView getSurfaceView();

    @Override
    public void dealDecode(Result rawResult, Bitmap barcode, float scaleFactor) {
        handleResult(rawResult.getText());
    }

    public abstract void handleResult(String text);
}
