package com.example.streaming.Movies;

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

import com.example.streaming.Home.MoviesAdapter;
import com.example.streaming.Home.MoviesHelperClass;
import com.example.streaming.R;

import java.util.ArrayList;

public class Movies extends Fragment {
    RecyclerView category_movies_common;
    ArrayList<MoviesHelperClass> movieList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment, container, false);

        category_movies_common = view.findViewById(R.id.category_common);
        category_movies_common.setHasFixedSize(true);
        category_movies_common.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        MoviesAdapter movieAdapter = new MoviesAdapter(movieListData());
        category_movies_common.setAdapter(movieAdapter);


        return view;
    }

    private ArrayList<MoviesHelperClass> movieListData() {
        movieList = new ArrayList<>();
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "CaptainAmerica"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "Hulk"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "IronMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AntMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AquaMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "BatMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "SuperMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "CaptainAmerica"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "Hulk"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "IronMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AntMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AquaMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "BatMan"));
        movieList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "SuperMan"));


        return movieList;
    }
}