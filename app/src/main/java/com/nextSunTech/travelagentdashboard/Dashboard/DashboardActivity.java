package com.nextSunTech.travelagentdashboard.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.nextSunTech.travelagentdashboard.ListOfCountries.ListOfCountriesActivity;
import com.nextSunTech.travelagentdashboard.MyBookings.MyBookingActivity;
import com.nextSunTech.travelagentdashboard.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;
    CardView myBookingBT;
    CardView visaCheckBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        myBookingBT = findViewById(R.id.cv_Dashboard_myBookings);
        visaCheckBT = findViewById(R.id.cv_Dashboard_visaCheck);


        visaCheckBT.setOnClickListener(this);
        myBookingBT.setOnClickListener(this);

        BannerAdsDashboard();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_Dashboard_myBookings:
                Intent intent = new Intent(this, MyBookingActivity.class);
                startActivity(intent);
                break;

            case R.id.cv_Dashboard_visaCheck:
                Intent intent1 = new Intent(this, ListOfCountriesActivity.class);
                startActivity(intent1);
                break;
        }
    }

    // Admob ads method
    private void BannerAdsDashboard() {

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
}