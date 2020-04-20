package com.example.thetourguide.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.thetourguide.R;
import com.example.thetourguide.data.model.ItemData;
import com.example.thetourguide.ui.fragment.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemDetailsFragment extends BaseFragment {

    @BindView(R.id.image_item)
    ImageView imageItem;
    @BindView(R.id.text_item_title)
    TextView textItemTitle;
    @BindView(R.id.text_item_address)
    TextView textItemAddress;
    @BindView(R.id.text_item_description)
    TextView textItemDescription;
    private ItemData itemData;


    public ItemDetailsFragment(ItemData itemData) {
        this.itemData = itemData;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_details, container, false);

        initFragment();
        ButterKnife.bind(this, view);

        initialize();

        //to make tab layout and view pager at home activity invisible
        getActivity().findViewById(R.id.frame_fragment_container).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.tabLayout_home_activity).setVisibility(View.GONE);
        getActivity().findViewById(R.id.viewPager_home_activity).setVisibility(View.GONE);

        return view;
    }

    private void initialize() {
        imageItem.setImageResource(itemData.getImage());
        textItemTitle.setText(itemData.getTitle());
        textItemAddress.setText(itemData.getAddress());
        textItemDescription.setText(itemData.getDescription());
    }

    @Override
    public void onBack() {
        //to make bottom navigation at home activity visible
        getActivity().findViewById(R.id.tabLayout_home_activity).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.viewPager_home_activity).setVisibility(View.VISIBLE);
        getActivity().findViewById(R.id.frame_fragment_container).setVisibility(View.GONE);


        super.onBack();
    }

    @OnClick(R.id.button_back)
    public void onViewClicked() {
        onBack();
    }
}
