package com.example.ck.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck.model.TopPlacesData;

import com.example.ck.R;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {
    Context context;
    List<TopPlacesData> topPlacesDataList;

    public TopPlacesAdapter() {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }

    public void setTopData(List<TopPlacesData> list) {
        this.topPlacesDataList = list;
    }
    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_place_item_row, parent, false);
        return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        holder.country.setText(topPlacesDataList.get(position).getCountryName());
        holder.place.setText(topPlacesDataList.get(position).getPlaceName());
        holder.price.setText(topPlacesDataList.get(position).getPrice());
        holder.placeImage.setImageResource(topPlacesDataList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }

    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView place, country, price;
        public TopPlacesViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.placeImage2);
            place = itemView.findViewById(R.id.place);
            country = itemView.findViewById(R.id.country);
            price = itemView.findViewById(R.id.price);
        }
    }
}
