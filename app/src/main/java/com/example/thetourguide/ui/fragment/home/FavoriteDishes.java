package com.example.thetourguide.ui.fragment.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thetourguide.R;
import com.example.thetourguide.ui.fragment.BaseFragment;

import butterknife.ButterKnife;

public class FavoriteDishes extends BaseFragment {

    public FavoriteDishes() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite_dishes, container, false);
        initFragment();
        ButterKnife.bind(this, view);

        return view;
    }
}
