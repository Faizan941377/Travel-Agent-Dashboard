package com.example.travelagentdashboard.VisaCheckList.ListOfCountry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelagentdashboard.R;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.KSA.EnjazitVisaSiteActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.KSA.KsaMuqeemVisaValidityActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.KSA.MuqeemArrivalRegistrationActivity;

public class KSAActivity extends AppCompatActivity implements View.OnClickListener {

    CardView muqeenVisaValidityBT;
    CardView muqeemArrivalRegistrationBT;
    CardView enjazitVisaSiteBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_s_a);


        muqeenVisaValidityBT = findViewById(R.id.bt_KSA_muqeemVisaValidity);
        muqeemArrivalRegistrationBT = findViewById(R.id.bt_KSA_muqeemArrivalRegistration);
        enjazitVisaSiteBT = findViewById(R.id.bt_KSA_enjazitVisaSite);


        muqeenVisaValidityBT.setOnClickListener(this);
        muqeemArrivalRegistrationBT.setOnClickListener(this);
        enjazitVisaSiteBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bt_KSA_muqeemVisaValidity:
                Intent intent = new Intent(this, KsaMuqeemVisaValidityActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_KSA_muqeemArrivalRegistration:
                Intent intent1 = new Intent(this, MuqeemArrivalRegistrationActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_KSA_enjazitVisaSite:
                Intent intent2 = new Intent(this, EnjazitVisaSiteActivity.class);
                startActivity(intent2);
                break;
        }
    }
}