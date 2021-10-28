package com.nextSunTech.travelagentdashboard.Dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.nextSunTech.travelagentdashboard.Dashboard.AgentID.AgentIDOfAirlinesActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.GamcaMedicalToken.GamcaMedicalTokenActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.NADRACovidVaccineCertification.NadraCovidVaccineCertificateActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.SabreRedWeb.SabreRedWebActivity;
import com.nextSunTech.travelagentdashboard.ListOfCountries.ListOfCountriesActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.MyBookings.MyBookingActivity;
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
    CardView gamcaMedicalTokenBT;
    CardView agentIDT;
    CardView nadraCovidVaccineCertificateBT;
    CardView sabreRedWebBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        myBookingBT = findViewById(R.id.cv_Dashboard_myBookings);
        visaCheckBT = findViewById(R.id.cv_Dashboard_visaCheck);
        agentIDT = findViewById(R.id.bt_dashboard_AgentID);
        gamcaMedicalTokenBT = findViewById(R.id.bt_dashboard_gamcaMedicalToken);
        nadraCovidVaccineCertificateBT = findViewById(R.id.bt_dashboard_NadraCovidVaccineCertificate);
        sabreRedWebBT = findViewById(R.id.bt_dashboard_sabreRedWeb);


        visaCheckBT.setOnClickListener(this);
        myBookingBT.setOnClickListener(this);
        agentIDT.setOnClickListener(this);
        gamcaMedicalTokenBT.setOnClickListener(this);
        nadraCovidVaccineCertificateBT.setOnClickListener(this);
        sabreRedWebBT.setOnClickListener(this);

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

            case R.id.bt_dashboard_AgentID:
                Intent intent2 = new Intent(this, AgentIDOfAirlinesActivity.class);
                startActivity(intent2);
                break;

            case R.id.bt_dashboard_gamcaMedicalToken:
                Intent intent3 = new Intent(this, GamcaMedicalTokenActivity.class);
                startActivity(intent3);
                break;

            case R.id.bt_dashboard_NadraCovidVaccineCertificate:
                Intent intent4 = new Intent(this, NadraCovidVaccineCertificateActivity.class);
                startActivity(intent4);
                break;

            case R.id.bt_dashboard_sabreRedWeb:
                Intent intent5 = new Intent(this, SabreRedWebActivity.class);
                startActivity(intent5);
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
                super.onAdOpened();
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