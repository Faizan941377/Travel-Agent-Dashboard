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

import com.nextSunTech.travelagentdashboard.AirlinePNRActivities.EmiratesPNRActivity;
import com.nextSunTech.travelagentdashboard.R;

public class EmiratesAirlineActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton hybridRB;
    RadioButton manualRB;
    ImageView backBT;
    RelativeLayout continueBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emirates_airline);

        radioGroup = findViewById(R.id.radiogroup);
        hybridRB = findViewById(R.id.rb_emirates_pnr);
        manualRB = findViewById(R.id.rb_emirates_ticketDetail);
        continueBT = findViewById(R.id.bt_selectOption);
        backBT = findViewById(R.id.iv_emirates_back);


        continueBT.setOnClickListener(this);
        backBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_selectOption:
                SelectOption();
                break;

            case R.id.iv_emirates_back:
                finish();
                break;
        }
    }

    private void SelectOption() {

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rb_emirates_pnr:
                Intent intent = new Intent(this, EmiratesPNRActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Enter your PNR", Toast.LENGTH_SHORT).show();
                finish();
                break;

            case R.id.rb_emirates_ticketDetail:
               /* Intent intent1 = new Intent(this, TicketDetailActivity.class);
                startActivity(intent1);
                Toast.makeText(this, "Ticket Detail", Toast.LENGTH_SHORT).show();*/
                finish();
                break;
        }
    }
}