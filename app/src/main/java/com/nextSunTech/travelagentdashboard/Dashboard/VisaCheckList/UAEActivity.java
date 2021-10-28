package com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.nextSunTech.travelagentdashboard.R;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.QatarVisa.UAE_GDFRA_ApprovalActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.UAEVisa.UAE_ICA_ApprovalActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.UAEVisa.UaeVisaValidityActivity;

public class UAEActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton backBT;
    CardView uaeValidityBT;
    CardView icaApprovalBT;
    CardView gdfraApprovalBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_a_e);

        backBT = findViewById(R.id.iv_uae_visa_back);
        uaeValidityBT = findViewById(R.id.bt_UAE_visaValidity);
        icaApprovalBT = findViewById(R.id.bt_UAE_ICAApproval);
        gdfraApprovalBT = findViewById(R.id.bt_UAE_GDFRA_Approval);

        backBT.setOnClickListener(this);
        uaeValidityBT.setOnClickListener(this);
        icaApprovalBT.setOnClickListener(this);
        gdfraApprovalBT.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_uae_visa_back:
                finish();
                break;

            case R.id.bt_UAE_visaValidity:
                Intent intent = new Intent(this, UaeVisaValidityActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_UAE_ICAApproval:
                Intent intent1 = new Intent(this, UAE_ICA_ApprovalActivity.class);
                startActivity(intent1);
                break;

            case R.id.bt_UAE_GDFRA_Approval:
                Intent intent2 = new Intent(this, UAE_GDFRA_ApprovalActivity.class);
                startActivity(intent2);
                break;
        }
    }
}