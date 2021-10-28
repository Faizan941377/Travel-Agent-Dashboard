package com.nextSunTech.travelagentdashboard.Dashboard.MyBookings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.nextSunTech.travelagentdashboard.R;
import com.nextSunTech.travelagentdashboard.SelectOption.AirArabiaActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.AirBlueActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.AirSialActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.EmiratesAirlineActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.EtihadAirlineActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.GulfAirActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.KuwaitActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.OmanAirActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.PiaActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.QatarAirlineActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.SaudiAirelineActivity;
import com.nextSunTech.travelagentdashboard.SelectOption.SereneAirlineActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MyBookingActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;
    private AdView mAdView2;
    ImageView backIV;
    CardView piaBT;
    CardView airBlueBT;
    CardView airSialBT;
    CardView sereneAirBT;
    CardView qatarAirlineBT;
    CardView emiratesAirlineBT;
    CardView etihadAirlineBT;
    CardView gulfAirBT;
    CardView omanAirBT;
    CardView kuwaitBT;
    CardView saudiBT;
    CardView airArabiaBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_booking);

        piaBT = findViewById(R.id.cv_myBooking_pia);
        airBlueBT = findViewById(R.id.cv_myBooking_airBlue);
        backIV = findViewById(R.id.iv_myBookings_back);
        airSialBT = findViewById(R.id.cv_myBooking_airsial);
        sereneAirBT = findViewById(R.id.cv_myBooking_sereneAir);
        qatarAirlineBT = findViewById(R.id.cv_qatarAirline);
        emiratesAirlineBT = findViewById(R.id.cv_emiratesAirline);
        etihadAirlineBT = findViewById(R.id.cv_etihadAirline);
        gulfAirBT = findViewById(R.id.cv_gulfAir);
        omanAirBT = findViewById(R.id.cv_omanAir);
        kuwaitBT = findViewById(R.id.cv_kuwait);
        saudiBT = findViewById(R.id.cv_saudi);
        airArabiaBT = findViewById(R.id.cv_airArabia);

        piaBT.setOnClickListener(this);
        airBlueBT.setOnClickListener(this);
        backIV.setOnClickListener(this);
        airSialBT.setOnClickListener(this);
        sereneAirBT.setOnClickListener(this);
        qatarAirlineBT.setOnClickListener(this);
        emiratesAirlineBT.setOnClickListener(this);
        etihadAirlineBT.setOnClickListener(this);
        gulfAirBT.setOnClickListener(this);
        omanAirBT.setOnClickListener(this);
        kuwaitBT.setOnClickListener(this);
        saudiBT.setOnClickListener(this);
        airArabiaBT.setOnClickListener(this);


        BannerAdvertisements();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv_myBooking_pia:
                Intent intent = new Intent(this, PiaActivity.class);
                startActivity(intent);
                break;

            case R.id.cv_myBooking_airBlue:
                Intent intent1 = new Intent(this, AirBlueActivity.class);
                startActivity(intent1);
                break;

            case R.id.cv_myBooking_airsial:
                Intent intent2 = new Intent(this, AirSialActivity.class);
                startActivity(intent2);
                break;

            case R.id.cv_myBooking_sereneAir:
                Intent intent3 = new Intent(this, SereneAirlineActivity.class);
                startActivity(intent3);
                break;

            case R.id.cv_qatarAirline:
                Intent intent4 = new Intent(this, QatarAirlineActivity.class);
                startActivity(intent4);
                break;

            case R.id.cv_emiratesAirline:
                Intent intent5 = new Intent(this, EmiratesAirlineActivity.class);
                startActivity(intent5);
                break;

            case R.id.cv_etihadAirline:
                Intent intent6 = new Intent(this, EtihadAirlineActivity.class);
                startActivity(intent6);
                break;

            case R.id.cv_gulfAir:
                Intent intent7 = new Intent(this, GulfAirActivity.class);
                startActivity(intent7);
                break;

            case R.id.cv_omanAir:
                Intent intent8 = new Intent(this, OmanAirActivity.class);
                startActivity(intent8);
                break;

            case R.id.cv_kuwait:
                Intent intent9 = new Intent(this, KuwaitActivity.class);
                startActivity(intent9);
                break;

            case R.id.cv_saudi:
                Intent intent10 = new Intent(this, SaudiAirelineActivity.class);
                startActivity(intent10);
                break;

            case R.id.cv_airArabia:
                Intent intent11 = new Intent(this, AirArabiaActivity.class);
                startActivity(intent11);
                break;

            case R.id.iv_myBookings_back:
                finish();
                break;
        }
    }


    private void BannerAdvertisements() {

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
                mAdView.loadAd(adRequest);
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