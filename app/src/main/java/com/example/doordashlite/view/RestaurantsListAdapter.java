package com.example.doordashlite.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.doordashlite.R;
import com.example.doordashlite.model.restaurants.Restaurant;

import java.util.Collections;
import java.util.List;

public class RestaurantsListAdapter extends RecyclerView.Adapter<RestaurantsListAdapter.ViewHolder> {

    private List<Restaurant> restaurants = Collections.emptyList();

    public RestaurantsListAdapter(Context context) {
        Log.d("Log.d", "RestaurantsListAdapter: Created");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.restaurant_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Restaurant restaurant = restaurants.get(i);
        viewHolder.nameTxt.setText(restaurant.getName());
        viewHolder.descriptionTxt.setText(restaurant.getDescription());
        viewHolder.statusTxt.setText(restaurant.getStatus());
        Glide.with(viewHolder.itemView.getContext())
                .load(restaurant.getCoverImgUrl()).fitCenter().into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTxt, descriptionTxt, statusTxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTxt = itemView.findViewById(R.id.nameTxt);
            descriptionTxt = itemView.findViewById(R.id.descriptionTxt);
            statusTxt = itemView.findViewById(R.id.statusTxt);
        }
    }
}
