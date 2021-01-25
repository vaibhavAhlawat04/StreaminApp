package com.example.streaming.Home;

import androidx.fragment.app.FragmentTransaction;

import android.graphics.Movie;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.streaming.Movies.Movies;
import com.example.streaming.R;
import com.example.streaming.TvShows.TvShows;
import com.example.streaming.popular.Popular;

import java.util.ArrayList;

public class Home_fragment extends Fragment {
    RecyclerView mainRecycler;
    ArrayList<HomeMainHelperClass> mainList;

    RecyclerView moviesRecycler;
    ArrayList<MoviesHelperClass> moviesList;

    RecyclerView tvShowsRecycler;
    ArrayList<TvShowsHelperClass> tvShowList;

    RecyclerView popularRecycler;
    ArrayList<PopularHelperClass> popularList;

    TextView allpopular;
    TextView allMovies;
    TextView allTvShows;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        allpopular = view.findViewById(R.id.allpopular);
        allpopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction frag = getActivity().getSupportFragmentManager().beginTransaction();
                frag.replace(R.id.fl_fragment, Popular.class, null);
                frag.commit();
            }
        });

        allMovies = view.findViewById(R.id.allmovies);
        allMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction frag = getActivity().getSupportFragmentManager().beginTransaction();
                frag.replace(R.id.fl_fragment, Movies.class, null);
                frag.commit();
            }
        });

        allTvShows=view.findViewById(R.id.alltvshows);
        allTvShows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction frag=getActivity().getSupportFragmentManager().beginTransaction();
                frag.replace(R.id.fl_fragment, TvShows.class,null);
                frag.commit();
            }
        });


        mainRecycler = view.findViewById(R.id.mainRecycler);
        mainRecycler.setHasFixedSize(true);
        mainRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        Home_mainAdapter mainadapter = new Home_mainAdapter(mainListData());
        mainRecycler.setAdapter(mainadapter);

        moviesRecycler = view.findViewById(R.id.moviesRecycler);
        moviesRecycler.setHasFixedSize(true);
        moviesRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        MoviesAdapter moviesadapter = new MoviesAdapter(moviesListData());
        moviesRecycler.setAdapter(moviesadapter);

        tvShowsRecycler = view.findViewById(R.id.tvshowsRecycler);
        tvShowsRecycler.setHasFixedSize(true);
        tvShowsRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        TvShowsAdapter tvadapter = new TvShowsAdapter(tvShowListData());
        tvShowsRecycler.setAdapter(tvadapter);

        popularRecycler = view.findViewById(R.id.popular_recycler);
        popularRecycler.setHasFixedSize(true);
        popularRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        PopularAdapter popularadapter = new PopularAdapter(popularListData());
        popularRecycler.setAdapter(popularadapter);

        return view;
    }

    private ArrayList<PopularHelperClass> popularListData() {
        popularList = new ArrayList<>();
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        popularList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));

        return popularList;
    }

    private ArrayList<TvShowsHelperClass> tvShowListData() {
        tvShowList = new ArrayList<>();
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        tvShowList.add(new TvShowsHelperClass(R.drawable.ic_launcher_background, "spiderMan"));

        return tvShowList;
    }

    private ArrayList<HomeMainHelperClass> mainListData() {
        mainList = new ArrayList<>();
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "CaptainAmerica"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "Hulk"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "IronMan"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "AntMan"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "AquaMan"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "BatMan"));
        mainList.add(new HomeMainHelperClass(R.drawable.ic_launcher_background, "SuperMan"));

        return mainList;
    }

    private ArrayList<MoviesHelperClass> moviesListData() {
        moviesList = new ArrayList<>();

        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "CaptainAmerica"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "Hulk"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "IronMan"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AntMan"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "AquaMan"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "BatMan"));
        moviesList.add(new MoviesHelperClass(R.drawable.ic_launcher_background, "SuperMan"));

        return moviesList;
    }


}