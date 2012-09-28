package com.pimar.blaze;

import android.os.Bundle;
import org.apache.cordova.*;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent("com.pimar.blaze.CameraActivity"));
        //super.loadUrl("file:///android_asset/www/cubeTest.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
