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

    private List<ItemData> mItemDataList = new ArrayList<>();

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
        initialize();
        return view;
    }

    private void initialize() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerviewHistoricalPlacesFragment.setLayoutManager(linearLayoutManager);
        if (mItemDataList.size() == 0) {

            // set data to list
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_1), getString(R.string.historical_places_address_1),
                    R.drawable.historical_places_image_1));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_2), getString(R.string.historical_places_address_2),
                    R.drawable.historical_places_image_2));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_3), getString(R.string.historical_places_address_3),
                    R.drawable.historical_places_image_3));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_4), getString(R.string.historical_places_address_4),
                    R.drawable.historical_places_image_4));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_5), getString(R.string.historical_places_address_5),
                    R.drawable.historical_places_image_5));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_6), getString(R.string.historical_places_address_6),
                    R.drawable.historical_places_image_6));
            mItemDataList.add(new ItemData(getString(R.string.historical_places_title_7), getString(R.string.historical_places_address_7),
                    R.drawable.historical_places_image_7));

        }

        ItemsAdapter mItemsAdapter = new ItemsAdapter(getActivity(), mItemDataList);
        recyclerviewHistoricalPlacesFragment.setAdapter(mItemsAdapter);

    }
}
