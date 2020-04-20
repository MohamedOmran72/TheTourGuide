package com.example.thetourguide.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

public class FavoriteDishes extends BaseFragment {

    @BindView(R.id.recyclerview_favorite_dishes_fragment)
    RecyclerView recyclerviewFavoriteDishesFragment;

    private List<ItemData> mItemDataList = new ArrayList<>();

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

        initialize();

        return view;
    }

    private void initialize() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerviewFavoriteDishesFragment.setLayoutManager(linearLayoutManager);
        if (mItemDataList.size() == 0) {

            // set data to list
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_1), getString(R.string.favorite_dishes_address_1),
                    getString(R.string.favorite_dishes_description_1), R.drawable.favorite_dishes_image_1));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_2), getString(R.string.favorite_dishes_address_2),
                    getString(R.string.favorite_dishes_description_2), R.drawable.favorite_dishes_image_2));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_3), getString(R.string.favorite_dishes_address_3),
                    getString(R.string.favorite_dishes_description_3), R.drawable.favorite_dishes_image_3));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_4), getString(R.string.favorite_dishes_address_4),
                    getString(R.string.favorite_dishes_description_4), R.drawable.favorite_dishes_image_4));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_5), getString(R.string.favorite_dishes_address_5),
                    getString(R.string.favorite_dishes_description_5), R.drawable.favorite_dishes_image_5));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_6), getString(R.string.favorite_dishes_address_6),
                    getString(R.string.favorite_dishes_description_6), R.drawable.favorite_dishes_image_6));
            mItemDataList.add(new ItemData(getString(R.string.favorite_dishes_title_7), getString(R.string.favorite_dishes_address_7),
                    getString(R.string.favorite_dishes_description_7), R.drawable.favorite_dishes_image_7));

        }

        ItemsAdapter mItemsAdapter = new ItemsAdapter(getActivity(), mItemDataList);
        recyclerviewFavoriteDishesFragment.setAdapter(mItemsAdapter);

    }
}
