package com.example.thetourguide.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.thetourguide.R;
import com.example.thetourguide.ui.fragment.SplashFragment;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.frame_fragment_container)
    FrameLayout frameFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        // add login fragment to author activity
        SplashFragment splashFragment = new SplashFragment();
        final FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_fragment_container, splashFragment);
        fragmentTransaction.commit();

        // handler delay to splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                frameFragmentContainer.setVisibility(View.GONE);
            }
        },1500);
    }
}
