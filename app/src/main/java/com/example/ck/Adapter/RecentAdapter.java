package com.example.ck.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck.R;
import com.example.ck.model.RecentData;
import com.example.ck.model.TopPlacesData;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder>{
    Context context;
    List<RecentData> recentDataList;

    public void setReData(List<RecentData> list) {
        this.recentDataList = list;
    }

    public RecentAdapter() {
        this.context = context;
        this.recentDataList = recentDataList;

    }


    @NonNull
    @Override
    public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_row_item, parent,false);
        return new RecentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {
        holder.country.setText(recentDataList.get(position).getCountryName());
        holder.place.setText(recentDataList.get(position).getPlaceName());
        holder.price.setText(recentDataList.get(position).getPrice());
        holder.placeImage.setImageResource(recentDataList.get(position).getImageUrl());
    }


    @Override
    public int getItemCount() {
        return recentDataList.size();
    }

    public class RecentViewHolder extends RecyclerView.ViewHolder{
        ImageView placeImage;
        TextView place, country, price;
        public RecentViewHolder (@NonNull View itemView){
            super(itemView);
            placeImage = (ImageView) itemView.findViewById(R.id.placeImage1);
            place = (TextView) itemView.findViewById(R.id.place);
            country = (TextView) itemView.findViewById(R.id.country);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }
}