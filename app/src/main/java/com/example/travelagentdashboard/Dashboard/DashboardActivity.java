package com.example.travelagentdashboard.Dashboard;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.travelagentdashboard.Dashboard.Fragment.DashboardFragment;
import com.example.travelagentdashboard.ListOfCountries.ListOfCountriesActivity;
import com.example.travelagentdashboard.MyBookings.MyBookingActivity;
import com.example.travelagentdashboard.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.navigation.NavigationView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

   /* private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    TextView profileNameTV;
    TextView profileContactTV;
    TextView profileEmailTV;
    CircleImageView profileImageIV;
    ProgressBar profileProgressBar;
    ProgressDialog progressDialog;*/

    private AdView mAdView;
    CardView myBookingBT;
    CardView visaCheckBT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

/*
        if (savedInstanceState == null) {
            DashboardFragment f1 = new DashboardFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.frame_Layout, f1);
            fragmentTransaction.commit();

        }


        drawerLayout = findViewById(R.id.dl_dashboard_drawer);
        navigationView = findViewById(R.id.navigationDrawer);

        // for accessing the headerNav
        View headerView = navigationView.getHeaderView(0);
        profileNameTV = headerView.findViewById(R.id.tv_profile_name);
        profileContactTV = headerView.findViewById(R.id.tv_profile_contact);
        profileEmailTV = headerView.findViewById(R.id.tv_profile_email);
        profileImageIV = headerView.findViewById(R.id.iv_dashboard_profile);
        profileProgressBar = headerView.findViewById(R.id.pb_profile_image);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Here i will change the action bar color pragmatically

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3b5998")));
        setDrawerContent(navigationView);

        // progress Dialog
        progressDialog = new ProgressDialog(this);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem) {
        Fragment fragment = null;

        Class fragmentClass;

        switch (menuItem.getItemId()) {
            case R.id.menu_dashboard:
                fragmentClass = DashboardFragment.class;
                break;
            default:
                fragmentClass = DashboardFragment.class;
        }
        try {
            fragment = (Fragment) fragmentClass.newInstance();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_Layout, fragment).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        drawerLayout.closeDrawers();

    }


    *//*private void logout() {
        SharePrefManager.getInstance(this).clear();
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }*//*


    private void setDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectItemDrawer(item);
                return false;
            }
        });
    }*/

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        myBookingBT = findViewById(R.id.cv_fragmentDashboard_myBookings);
        visaCheckBT = findViewById(R.id.cv_fragmentDashboard_visaCheck);


        visaCheckBT.setOnClickListener(this);
        myBookingBT.setOnClickListener(this);
        return;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cv_fragmentDashboard_myBookings:
                Intent intent = new Intent(this, MyBookingActivity.class);
                startActivity(intent);
                break;

            case R.id.cv_fragmentDashboard_visaCheck:
                Intent intent1 = new Intent(this, ListOfCountriesActivity.class);
                startActivity(intent1);
                break;
        }
    }
}