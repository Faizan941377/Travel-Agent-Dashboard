package com.example.travelagentdashboard.MyBookings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.travelagentdashboard.R;
import com.example.travelagentdashboard.SelectOption.AirArabiaActivity;
import com.example.travelagentdashboard.SelectOption.AirBlueActivity;
import com.example.travelagentdashboard.SelectOption.AirSialActivity;
import com.example.travelagentdashboard.SelectOption.EmiratesAirlineActivity;
import com.example.travelagentdashboard.SelectOption.EtihadAirlineActivity;
import com.example.travelagentdashboard.SelectOption.GulfAirActivity;
import com.example.travelagentdashboard.SelectOption.KuwaitActivity;
import com.example.travelagentdashboard.SelectOption.OmanAirActivity;
import com.example.travelagentdashboard.SelectOption.PiaActivity;
import com.example.travelagentdashboard.SelectOption.QatarAirlineActivity;
import com.example.travelagentdashboard.SelectOption.SaudiAirelineActivity;
import com.example.travelagentdashboard.SelectOption.SereneAirlineActivity;

public class MyBookingActivity extends AppCompatActivity implements View.OnClickListener {

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
}