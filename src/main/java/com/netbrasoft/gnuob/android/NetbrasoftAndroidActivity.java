package com.netbrasoft.gnuob.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled")
public class NetbrasoftAndroidActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final WebView myWebView = (WebView) findViewById(R.id.webview);
    final WebSettings webSettings = myWebView.getSettings();

    myWebView.loadUrl("http://10.0.2.2:8080");
    myWebView.setWebViewClient(new WebViewClient());
    webSettings.setJavaScriptEnabled(true);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(com.netbrasoft.gnuob.android.R.menu.main, menu);
    return true;
  }

}
