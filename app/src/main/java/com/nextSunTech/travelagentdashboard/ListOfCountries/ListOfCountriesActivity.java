package com.nextSunTech.travelagentdashboard.ListOfCountries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.nextSunTech.travelagentdashboard.R;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.BahrainVisa.BahrainActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.KSAActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.KuwaitVisa.KuwaitActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.OmanVisa.OmanActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.ListOfCountriesVisas.QatarVisa.QatarVisaActivity;
import com.nextSunTech.travelagentdashboard.Dashboard.VisaCheckList.UAEActivity;

import java.util.Objects;

public class ListOfCountriesActivity extends AppCompatActivity implements View.OnClickListener {

    NativeAd nativeAd;
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

        refreshAd();
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

    private void populateUnifiedNativeAdView(NativeAd nativeAd, NativeAdView adView) {
        adView.setMediaView((MediaView) adView.findViewById(R.id.ad_media));
        adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
        adView.setBodyView(adView.findViewById(R.id.ad_body));
        adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
        adView.setIconView(adView.findViewById(R.id.ad_app_icon));
        adView.setPriceView(adView.findViewById(R.id.ad_price));
        adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
        adView.setStoreView(adView.findViewById(R.id.ad_store));
        adView.setAdvertiserView(adView.findViewById(R.id.ad_advertiser));


        ((TextView) Objects.requireNonNull(adView.getHeadlineView())).setText(nativeAd.getHeadline());
        Objects.requireNonNull(adView.getMediaView()).setMediaContent(Objects.requireNonNull(nativeAd.getMediaContent()));


        if (nativeAd.getBody() == null) {
            Objects.requireNonNull(adView.getBodyView()).setVisibility(View.INVISIBLE);

        } else {
            adView.getBodyView().setVisibility(View.VISIBLE);
            ((TextView) adView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getCallToActionView()).setVisibility(View.VISIBLE);
            ((Button) adView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            Objects.requireNonNull(adView.getIconView()).setVisibility(View.GONE);
        } else {
            ((ImageView) Objects.requireNonNull(adView.getIconView())).setImageDrawable(nativeAd.getIcon().getDrawable());
            adView.getIconView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getPrice() == null) {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.INVISIBLE);

        } else {
            Objects.requireNonNull(adView.getPriceView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getPriceView()).setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.INVISIBLE);
        } else {
            Objects.requireNonNull(adView.getStoreView()).setVisibility(View.VISIBLE);
            ((TextView) adView.getStoreView()).setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            Objects.requireNonNull(adView.getStarRatingView()).setVisibility(View.INVISIBLE);
        } else {
            ((RatingBar) Objects.requireNonNull(adView.getStarRatingView())).setRating(nativeAd.getStarRating().floatValue());
            adView.getStarRatingView().setVisibility(View.VISIBLE);
        }

        if (nativeAd.getAdvertiser() == null) {
            Objects.requireNonNull(adView.getAdvertiserView()).setVisibility(View.INVISIBLE);
        } else
            ((TextView) Objects.requireNonNull(adView.getAdvertiserView())).setText(nativeAd.getAdvertiser());
        adView.getAdvertiserView().setVisibility(View.VISIBLE);


        adView.setNativeAd(nativeAd);


    }


    private void refreshAd() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getString(R.string.Pia_Native_Ad));
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd unifiedNativeAd) {

                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                nativeAd = unifiedNativeAd;
                FrameLayout frameLayout = findViewById(R.id.fl_adplaceholder);
                NativeAdView adView = (NativeAdView) getLayoutInflater().inflate(R.layout.pia_native_ad_unit, null);

                populateUnifiedNativeAdView(unifiedNativeAd, adView);
                frameLayout.removeAllViews();
                frameLayout.addView(adView);
            }
        }).build();
        NativeAdOptions adOptions = new NativeAdOptions.Builder().build();
        builder.withNativeAdOptions(adOptions);
        AdLoader adLoader = builder.withAdListener(new AdListener() {
            public void onAdFailedToLoad(int i) {

            }
        }).build();
        adLoader.loadAd(new AdRequest.Builder().build());

    }
}