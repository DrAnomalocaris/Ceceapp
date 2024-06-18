package com.albert.ceceapp;

import android.service.dreams.DreamService;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;

public class CeceDreamService extends DreamService {

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        // Allow the dream to be interactive if needed
        setInteractive(false);

        // Set the dream's content view to the same layout used in MainActivity
        setContentView(R.layout.activity_main);

        // Set the SYSTEM_UI_FLAG_FULLSCREEN flag to make the app appear fullscreen
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        // Set the FLAG_KEEP_SCREEN_ON flag to keep the screen on
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Get the current window's decor view.
        View decorView = getWindow().getDecorView();

        // Hide the notification bar and bottom control bar.
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onDreamingStarted() {
        super.onDreamingStarted();
        // Handle any logic that should occur when the screensaver starts
    }

    @Override
    public void onDreamingStopped() {
        super.onDreamingStopped();
        // Handle any logic that should occur when the screensaver stops
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        // Clean up any resources used by the screensaver
    }
}
