package com.example.travelagentdashboard.Dashboard.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.travelagentdashboard.MyBookings.MyBookingActivity;
import com.example.travelagentdashboard.R;
import com.example.travelagentdashboard.ListOfCountries.ListOfCountriesActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    private AdView mAdView;
    CardView myBookingBT;
    CardView visaCheckBT;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        MobileAds.initialize(getActivity(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        myBookingBT = view.findViewById(R.id.cv_fragmentDashboard_myBookings);
        visaCheckBT = view.findViewById(R.id.cv_fragmentDashboard_visaCheck);


        visaCheckBT.setOnClickListener(this);
        myBookingBT.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_fragmentDashboard_myBookings:
                Intent intent = new Intent(getActivity(), MyBookingActivity.class);
                startActivity(intent);
                break;

            case R.id.cv_fragmentDashboard_visaCheck:
                Intent intent1 = new Intent(getActivity(), ListOfCountriesActivity.class);
                startActivity(intent1);
                break;
        }
    }
}