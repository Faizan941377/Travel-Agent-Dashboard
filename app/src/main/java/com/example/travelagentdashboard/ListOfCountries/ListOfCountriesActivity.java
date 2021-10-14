package com.example.travelagentdashboard.ListOfCountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.travelagentdashboard.R;
import com.example.travelagentdashboard.VisaChecking.UaeVisaCheckingActivity;

public class ListOfCountriesActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uaeVisaBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_countries);

        uaeVisaBT = findViewById(R.id.cv_list_of_countries_UAE_VISA);


        uaeVisaBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.cv_list_of_countries_UAE_VISA:
                Intent intent = new Intent(this, UaeVisaCheckingActivity.class);
                startActivity(intent);
                break;
        }
    }
}