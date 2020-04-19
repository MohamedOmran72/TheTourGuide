package com.example.thetourguide.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.thetourguide.R;
import com.example.thetourguide.adapter.ViewPagerWithFragmentAdapter;
import com.example.thetourguide.ui.fragment.SplashFragment;
import com.example.thetourguide.ui.fragment.home.ChristianFragment;
import com.example.thetourguide.ui.fragment.home.HotelsFragment;
import com.example.thetourguide.ui.fragment.home.IslamicFragment;
import com.example.thetourguide.ui.fragment.home.PharaonicFragment;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.frame_fragment_container)
    FrameLayout frameFragmentContainer;
    @BindView(R.id.tabLayout_home_activity)
    TabLayout tabLayoutHomeActivity;
    @BindView(R.id.viewPager_home_activity)
    ViewPager viewPagerHomeActivity;

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
                tabLayoutHomeActivity.setVisibility(View.VISIBLE);
                viewPagerHomeActivity.setVisibility(View.VISIBLE);

                ViewPagerWithFragmentAdapter viewPagerWithFragmentAdapter = new
                        ViewPagerWithFragmentAdapter(getSupportFragmentManager());

                // add fragments and taps to viewPagerWithFragmentAdapter to show on screen.
                viewPagerWithFragmentAdapter.addPager(new PharaonicFragment(), getString(R.string.tab_pharaonic_fragment_title));
                viewPagerWithFragmentAdapter.addPager(new IslamicFragment(), getString(R.string.tab_islamic_fragment_title));
                viewPagerWithFragmentAdapter.addPager(new ChristianFragment(), getString(R.string.tab_christian_fragment_title));
                viewPagerWithFragmentAdapter.addPager(new HotelsFragment(), getString(R.string.tab_hotels_fragment_title));

                viewPagerHomeActivity.setAdapter(viewPagerWithFragmentAdapter);
                tabLayoutHomeActivity.setupWithViewPager(viewPagerHomeActivity);

                /**
                 * {@link frameFragmentContainer.removeAllViews()} to remove {@link SplashFragment } from backStake container.
                 */
                frameFragmentContainer.removeAllViews();
            }
        }, 1500);
    }
}
