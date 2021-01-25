package com.example.streaming.Home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.streaming.R;

import java.util.ArrayList;

public class Home_mainAdapter extends RecyclerView.Adapter<Home_mainAdapter.HomeMainViewHolder> {

    ArrayList<HomeMainHelperClass> mainStreams;

    public Home_mainAdapter(ArrayList<HomeMainHelperClass> mainStreams) {
        this.mainStreams = mainStreams;
    }

    @NonNull
    @Override
    public HomeMainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recycler_design, parent, false);
        HomeMainViewHolder mainView = new HomeMainViewHolder(view);

        return mainView;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeMainViewHolder holder, int position) {
        HomeMainHelperClass mainhelperclass= mainStreams.get(position);
        holder.image.setImageResource(mainhelperclass.getImage());
        holder.name.setText(mainhelperclass.getName());
    }

    @Override
    public int getItemCount() {
        return mainStreams.size();
    }

    public static class HomeMainViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public HomeMainViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.Main_Recycler_image);
            name = itemView.findViewById(R.id.Main_Recycler_name);
        }
    }
}
