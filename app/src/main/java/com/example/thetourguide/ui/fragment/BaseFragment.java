package com.example.thetourguide.ui.fragment;

import androidx.fragment.app.Fragment;

import com.example.thetourguide.ui.activity.BaseActivity;


public class BaseFragment extends Fragment {
    public BaseActivity baseActivity;
    public void initFragment(){
        baseActivity = (BaseActivity) getActivity();
        baseActivity.baseFragment = this;
    }

    public void onBack(){
        baseActivity.superBackPressed();

    }
}
