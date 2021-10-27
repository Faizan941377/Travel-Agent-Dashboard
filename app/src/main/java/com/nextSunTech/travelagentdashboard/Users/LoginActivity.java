package com.nextSunTech.travelagentdashboard.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.nextSunTech.travelagentdashboard.Dashboard.DashboardActivity;
import com.nextSunTech.travelagentdashboard.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView TVHeading;
    TextView signUpBT;
    LinearLayout loginBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TVHeading = findViewById(R.id.tv_heading);
        signUpBT = findViewById(R.id.tv_login_sign_up);
        loginBT = findViewById(R.id.bt_Login_login);


        signUpBT.setOnClickListener(this);
        loginBT.setOnClickListener(this);

        final SpannableStringBuilder sb = new SpannableStringBuilder("Welcome, please sign in to your Travel Agent Dashboard account!");

        final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD); // Span to make text bold
        final StyleSpan iss = new StyleSpan(Typeface.NORMAL); //Span to make text normal
        sb.setSpan(bss, 0, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE); // make first 8 characters Bold
        sb.setSpan(iss, 8, 46, Spannable.SPAN_INCLUSIVE_INCLUSIVE); // make last 46 characters normal
        TVHeading.setText(sb);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.tv_login_sign_up:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_Login_login:
                Intent intent1 = new Intent(this, DashboardActivity.class);
                startActivity(intent1);
                break;
        }
    }
}