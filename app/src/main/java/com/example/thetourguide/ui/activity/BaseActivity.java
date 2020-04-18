package com.example.thetourguide.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.thetourguide.ui.fragment.BaseFragment;


public class BaseActivity extends AppCompatActivity {
    public BaseFragment baseFragment;

    public void superBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed() {
        baseFragment.onBack();
    }
}
