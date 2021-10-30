package com.nextSunTech.travelagentdashboard.Dashboard.AgentID.PIAAgentID;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.nextSunTech.travelagentdashboard.R;

public class PIAAgentIDActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView myWebView;
    private ProgressBar progressBar;
    ImageView backBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_i_a_agent_i_d);


        backBT = findViewById(R.id.iv_PIAAgentID_back);


        backBT.setOnClickListener(this);



        myWebView = findViewById(R.id.webview);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://crane.app/");
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        progressBar.setProgress(0);

        myWebView.setWebChromeClient(new WebChromeClient(){

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
        if(myWebView.canGoBack()) {
            myWebView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_PIAAgentID_back:
                finish();
                break;
        }
    }
}