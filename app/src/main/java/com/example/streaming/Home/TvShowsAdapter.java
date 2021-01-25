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

public class TvShowsAdapter extends RecyclerView.Adapter<TvShowsAdapter.TvShowsViewHolder> {
    ArrayList<TvShowsHelperClass> tvShows;

    public TvShowsAdapter(ArrayList<TvShowsHelperClass> tvShows) {
        this.tvShows = tvShows;
    }

    @NonNull
    @Override
    public TvShowsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_recycler_design, parent, false);
        TvShowsViewHolder tvView = new TvShowsViewHolder(view);
        return tvView;
    }

    @Override
    public void onBindViewHolder(@NonNull TvShowsViewHolder holder, int position) {
        TvShowsHelperClass tvhelper = tvShows.get(position);
        holder.image.setImageResource(tvhelper.getImage());
        holder.name.setText(tvhelper.getName());

    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }

    public class TvShowsViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public TvShowsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.CommonRecycler_image);
            name = itemView.findViewById(R.id.CommonRecycler_name);
        }
    }
}
