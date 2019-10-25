package com.example.borgerking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ItemViewHolder> {
    private ArrayList<Food> itemsToAdapt;

    public void setData(ArrayList<Food> itemsToAdapt) {

        this.itemsToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.food, parent, false);


        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        final Food articleAtPosition = itemsToAdapt.get(position);
        holder.headlineTextView.setText(articleAtPosition.getFoodname());
        holder.summaryTextView.setText(articleAtPosition.getDesc());

        holder.itemImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("ItemID", articleAtPosition.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, articleAtPosition.getFoodname());
                intent.setType("text/plain");
                context.startActivity(intent);
            }
        });

        holder.itemImageView.setImageResource(articleAtPosition.getImageDrawableId());
    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView headlineTextView;
        public TextView summaryTextView;
        public ImageView shareImageView;
        public ImageView itemImageView;

        public ItemViewHolder(View v) {
            super(v);
            view = v;
            headlineTextView = v.findViewById(R.id.foodname);
            summaryTextView = v.findViewById(R.id.desc);
            shareImageView = v.findViewById(R.id.orderbtn);
            itemImageView = v.findViewById(R.id.photo);
        }
    }
}

