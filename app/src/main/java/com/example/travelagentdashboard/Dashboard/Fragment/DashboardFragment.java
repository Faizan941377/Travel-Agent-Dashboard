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
import com.example.travelagentdashboard.VisaCheck.ListOfCountriesActivity;

public class DashboardFragment extends Fragment implements View.OnClickListener {

    CardView myBookingBT;
    CardView visaCheckBT;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

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