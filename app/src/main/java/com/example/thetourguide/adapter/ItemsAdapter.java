package com.example.thetourguide.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thetourguide.R;
import com.example.thetourguide.data.model.ItemData;
import com.example.thetourguide.ui.activity.BaseActivity;
import com.example.thetourguide.ui.fragment.home.ItemDetailsFragment;
import com.example.thetourguide.utilities.HelperMethod;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    private Context context;
    private BaseActivity activity;
    private List<ItemData> itemDataList = new ArrayList<>();


    public ItemsAdapter(Activity activity, List<ItemData> itemDataList) {
        this.context = activity;
        this.activity = (BaseActivity) activity;
        this.itemDataList = itemDataList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_data,
                parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        setData(holder, position);
        setAction(holder, position);
    }

    private void setData(ViewHolder holder, int position) {
        holder.imageItem.setImageResource(itemDataList.get(position).getImage());
        holder.textTitle.setText(itemDataList.get(position).getTitle());
        holder.textAddress.setText(itemDataList.get(position).getAddress());
    }

    private void setAction(final ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemDataList.get(position).getDescription() != null) {
                    ItemDetailsFragment itemDetailsFragment = new ItemDetailsFragment(itemDataList.get(position));
                    HelperMethod.replaceFragment(activity.getSupportFragmentManager(), R.id.frame_fragment_container, itemDetailsFragment);
                }else {
                    Toast.makeText(context,R.string.no_description,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;

        @BindView(R.id.image_item)
        ImageView imageItem;
        @BindView(R.id.text_title)
        TextView textTitle;
        @BindView(R.id.text_address)
        TextView textAddress;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            ButterKnife.bind(this, view);
        }
    }
}
