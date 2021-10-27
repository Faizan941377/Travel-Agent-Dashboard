package com.nextSunTech.travelagentdashboard.Users;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nextSunTech.travelagentdashboard.R;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {


    TextView termsTV;
    TextView headingTV;
    ImageView backIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        termsTV = findViewById(R.id.TV_terms);
        backIV = findViewById(R.id.iv_Register_back);
        headingTV = findViewById(R.id.tv_heading_reg);


        termsTV.setOnClickListener(this);
        backIV.setOnClickListener(this);



        String text = "To access Travel Agent Dashboard you must read and agree to our Terms and Condition & Privacy Polices. By checking this box you confirm that you have read and accepted all of our polices.";
        SpannableString spannableString = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                Toast.makeText(RegisterActivity.this, "Terms & Condition", Toast.LENGTH_SHORT).show();
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(RegisterActivity.this, "Privacy Polices", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
            }
        };

        spannableString.setSpan(clickableSpan1, 64, 83, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(clickableSpan2, 86, 102, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        termsTV.setText(spannableString);
        termsTV.setMovementMethod(LinkMovementMethod.getInstance());

        final SpannableStringBuilder sb = new SpannableStringBuilder("Let's Register, please create your Travel Agent Dashboard account!");

        final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD); // Span to make text bold
        final StyleSpan iss = new StyleSpan(Typeface.NORMAL); //Span to make text normal
        sb.setSpan(bss, 0, 14, Spannable.SPAN_INCLUSIVE_INCLUSIVE); // make first 8 characters Bold
        sb.setSpan(iss, 12, 34, Spannable.SPAN_INCLUSIVE_INCLUSIVE); // make last 46 characters normal
        headingTV.setText(sb);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.iv_Register_back:
                finish();
                break;
        }
    }
}