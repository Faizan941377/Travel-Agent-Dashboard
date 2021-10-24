package com.nextSunTech.travelagentdashboard.SelectOption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.nextSunTech.travelagentdashboard.AirlinePNRActivities.GulfAirPNRActivity;
import com.nextSunTech.travelagentdashboard.R;

public class GulfAirActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton hybridRB;
    RadioButton manualRB;
    ImageView backBT;
    RelativeLayout continueBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulf_air);

        radioGroup = findViewById(R.id.radiogroup);
        hybridRB = findViewById(R.id.rb_gulfAirline_pnr);
        manualRB = findViewById(R.id.rb_gulfAirline_ticketDetail);
        continueBT = findViewById(R.id.bt_selectOption);
        backBT = findViewById(R.id.iv_gulfAirline_back);


        continueBT.setOnClickListener(this);
        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_selectOption:
                SelectOption();
                break;

            case R.id.iv_gulfAirline_back:
                finish();
                break;
        }
    }

    private void SelectOption() {

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rb_gulfAirline_pnr:
                Intent intent = new Intent(this, GulfAirPNRActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Enter your PNR", Toast.LENGTH_SHORT).show();
                finish();
                break;

            case R.id.rb_gulfAirline_ticketDetail:
               /* Intent intent1 = new Intent(this, TicketDetailActivity.class);
                startActivity(intent1);
                Toast.makeText(this, "Ticket Detail", Toast.LENGTH_SHORT).show();*/
                finish();
                break;
        }
    }
}