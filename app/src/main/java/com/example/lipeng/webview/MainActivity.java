package com.example.lipeng.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private WebSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://a.picooc.com/web/test/ali.html");
        settings = webView.getSettings();
        String ua = settings.getUserAgentString();
        settings.setUserAgentString(ua+"; AliBaichuan(2014_0_23211183@baichuan_h5_0.1.1/" + "3.2.0" + ")");
        settings.setJavaScriptEnabled(true);
    }

    class MyWebViewClient extends WebViewClient{

    }
}
