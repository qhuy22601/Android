package com.example.ck;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck.Adapter.RecentAdapter;
import com.example.ck.Adapter.TopPlacesAdapter;
import com.example.ck.model.RecentData;
import com.example.ck.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {

    RecyclerView recentRecycler, topPlacesRecyler;
    RecentAdapter recentAdapter;
    TopPlacesAdapter topPlacesAdapter;
    ImageView placeImage1;
    RecentData[] recentData;
    private List<RecentData>listrecent;
    private List<TopPlacesData> listtop;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.home, container,false);


        RecyclerView recentRecylcer = (RecyclerView) view.findViewById(R.id.recent_recycler);
        recentRecylcer.setLayoutManager(new LinearLayoutManager(getActivity()));

        listrecent = new ArrayList<>();
        listrecent.add(new RecentData("hue", "vietnam", "10000", R.drawable.unnamed));
        listrecent.add(new RecentData("quangtri", "vietnam", "10000", R.drawable.quangtri));
        listrecent.add(new RecentData("danang", "vietnam", "10000", R.drawable.c8d5ab795c4912807bd02398ea9cb877));

        recentAdapter = new RecentAdapter();
        recentAdapter.setReData(listrecent);

        RecyclerView topPlacesRecycler = (RecyclerView) view.findViewById(R.id.topRecycler);
        topPlacesRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        listtop= new ArrayList<>();
        listtop.add(new TopPlacesData("hue", "vietnam", "10000", R.drawable.unnamed));
        listtop.add(new TopPlacesData("quangtri", "vietnam", "10000", R.drawable.quangtri));
        topPlacesAdapter = new TopPlacesAdapter();
        topPlacesAdapter.setTopData(listtop);

        return view;

    }

}
