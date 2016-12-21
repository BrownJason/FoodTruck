package com.example.jasonbrown.foodtruck;

import android.app.Activity;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;

/**
 * Created by Jason_Brown on 4/6/2016.
 */
//this classes purpose is to start the web page
//of the selected food truck from the food truck tab
public class RustysRoadTrip extends Activity {
    private WebView wv;

    //This shows the website or facebook page of the
    //listed food truck as a webview on the current
    //activity.
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.webpage);

        WebView wv = (WebView) findViewById(R.id.webpages);
        wv.setWebViewClient(new myWebViewClient());

        String url = "http://rustysroadtrip.com/"; //string set to the URL you want to open

        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url); //loads the URL based on the string above
    }

    private class myWebViewClient extends WebViewClient{
        public boolean OverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
