package com.example.streaming.TvShows;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streaming.Home.TvShowsAdapter;
import com.example.streaming.Home.TvShowsHelperClass;
import com.example.streaming.R;

import java.util.ArrayList;

public class TvShows extends Fragment {
    RecyclerView category_tvshows_common;
    ArrayList<TvShowsHelperClass> tvShowsList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment, container, false);

        category_tvshows_common = view.findViewById(R.id.tvshowsRecycler);
        category_tvshows_common.setHasFixedSize(true);
        category_tvshows_common.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        TvShowsAdapter tvAdapter = new TvShowsAdapter(tvshowsListData());
        category_tvshows_common.setAdapter(tvAdapter);


        return view;
    }

    private ArrayList<TvShowsHelperClass> tvshowsListData() {
        tvShowsList = new ArrayList<>();
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowsList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));

        return tvShowsList;
    }

}