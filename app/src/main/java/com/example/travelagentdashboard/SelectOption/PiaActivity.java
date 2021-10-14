package com.example.travelagentdashboard.SelectOption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.travelagentdashboard.AirlinePNRActivities.PiaPNRActivity;
import com.example.travelagentdashboard.R;

public class PiaActivity extends AppCompatActivity implements View.OnClickListener {


    RadioGroup radioGroup;
    RadioButton hybridRB;
    RadioButton manualRB;
    ImageView backBT;
    RelativeLayout continueBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pia);


        radioGroup = findViewById(R.id.radiogroup);
        hybridRB = findViewById(R.id.rb_car_selling_option_hybrid);
        manualRB = findViewById(R.id.rb_car_selling_option_manual);
        continueBT = findViewById(R.id.bt_selectOption);
        backBT = findViewById(R.id.iv_pia_back);


        continueBT.setOnClickListener(this);
        backBT.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_selectOption:
                SelectOption();
                break;

            case R.id.iv_pia_back:
                finish();
                break;
        }
    }

    private void SelectOption() {

        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.rb_car_selling_option_hybrid:
                Intent intent = new Intent(this, PiaPNRActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Enter your PNR", Toast.LENGTH_SHORT).show();
                finish();
                break;

            case R.id.rb_car_selling_option_manual:
               /* Intent intent1 = new Intent(this, TicketDetailActivity.class);
                startActivity(intent1);
                Toast.makeText(this, "Ticket Detail", Toast.LENGTH_SHORT).show();*/
                finish();
                break;
        }
    }
}