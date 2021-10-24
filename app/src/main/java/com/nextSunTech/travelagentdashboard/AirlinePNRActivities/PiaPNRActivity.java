package com.nextSunTech.travelagentdashboard.AirlinePNRActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.nextSunTech.travelagentdashboard.R;

public class PiaPNRActivity extends AppCompatActivity {

    private WebView mywebView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_i_a_p_n_r);

        mywebView = findViewById(R.id.webview);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);
        mywebView.setWebViewClient(new WebViewClient());
        mywebView.loadUrl("https://www.piac.com.pk/#my-booking");
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        progressBar.setProgress(0);

        mywebView.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBar.setProgress(newProgress);
                if (newProgress==100){
                    progressBar.setVisibility(View.INVISIBLE);
                }else {
                    progressBar.setVisibility(View.VISIBLE);
                }

                super.onProgressChanged(view, newProgress);
            }
        });

    }


    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()) {
            mywebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}