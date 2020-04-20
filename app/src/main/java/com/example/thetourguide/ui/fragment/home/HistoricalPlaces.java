package com.example.thetourguide.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thetourguide.R;
import com.example.thetourguide.adapter.ItemsAdapter;
import com.example.thetourguide.data.model.ItemData;
import com.example.thetourguide.ui.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalPlaces extends BaseFragment {

    @BindView(R.id.recyclerview_historical_places_fragment)
    RecyclerView recyclerviewHistoricalPlacesFragment;

    public HistoricalPlaces() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historical_places, container, false);

        initFragment();
        ButterKnife.bind(this, view);

        return view;
    }
}
