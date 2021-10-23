package com.example.travelagentdashboard.ListOfCountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.travelagentdashboard.R;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.BahrainVisa.BahrainActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.KSAActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.KuwaitVisa.KuwaitActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.OmanVisa.OmanActivity;
import com.example.travelagentdashboard.VisaCheckList.ListOfCountry.QatarVisa.QatarVisaActivity;
import com.example.travelagentdashboard.VisaCheckList.UAEActivity;

public class ListOfCountriesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView backBT;
    CardView uaeVisaBT;
    CardView ksaBT;
    CardView qatarBT;
    CardView kuwaitBT;
    CardView omanBT;
    CardView bahrainBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_countries);

        backBT = findViewById(R.id.iv_ListOfCountries_back);
        uaeVisaBT = findViewById(R.id.cv_list_of_countries_UAE_VISA);
        ksaBT = findViewById(R.id.bt_ListOfCountry_KSA);
        qatarBT = findViewById(R.id.bt_ListOfCountry_QATAR);
        kuwaitBT = findViewById(R.id.bt_ListOfCountry_Kuwait);
        omanBT = findViewById(R.id.bt_ListOfCountry_Oman);
        bahrainBT = findViewById(R.id.bt_ListOfCountry_Bahrain);


        backBT.setOnClickListener(this);
        uaeVisaBT.setOnClickListener(this);
        ksaBT.setOnClickListener(this);
        qatarBT.setOnClickListener(this);
        kuwaitBT.setOnClickListener(this);
        omanBT.setOnClickListener(this);
        bahrainBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_ListOfCountries_back:
                finish();
                break;

            case R.id.cv_list_of_countries_UAE_VISA:
                Intent intent = new Intent(this, UAEActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_ListOfCountry_KSA:
                Intent intent1 = new Intent(this, KSAActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_ListOfCountry_QATAR:
                Intent intent2 = new Intent(this, QatarVisaActivity.class);
                startActivity(intent2);
                break;

            case R.id.bt_ListOfCountry_Kuwait:
                Intent intent3 = new Intent(this, KuwaitActivity.class);
                startActivity(intent3);
                break;

            case R.id.bt_ListOfCountry_Oman:
                Intent intent4 = new Intent(this, OmanActivity.class);
                startActivity(intent4);
                break;

            case R.id.bt_ListOfCountry_Bahrain:
                Intent intent5 = new Intent(this, BahrainActivity.class);
                startActivity(intent5);
                break;
        }
    }
}