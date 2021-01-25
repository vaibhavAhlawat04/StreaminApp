package com.example.streaming.popular;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streaming.Home.HomeMainHelperClass;
import com.example.streaming.Home.Home_mainAdapter;
import com.example.streaming.Home.PopularAdapter;
import com.example.streaming.Home.PopularHelperClass;
import com.example.streaming.R;

import java.util.ArrayList;


public class Popular extends Fragment {

    RecyclerView category_popular_common;
    ArrayList<PopularHelperClass> commonList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.category_fragment, container, false);


        category_popular_common = view.findViewById(R.id.category_common);
        category_popular_common.setHasFixedSize(true);
        category_popular_common.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        PopularAdapter popadapter = new PopularAdapter(commonListData());
        category_popular_common.setAdapter(popadapter);


        return view;
    }

    private ArrayList<PopularHelperClass> commonListData() {
        commonList = new ArrayList<>();
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));
        commonList.add(new PopularHelperClass(R.drawable.ic_launcher_background, "spiderMan"));

        return commonList;
    }


}