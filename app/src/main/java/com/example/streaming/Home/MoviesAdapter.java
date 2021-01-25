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

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    ArrayList<MoviesHelperClass> CommonMovies;

    public MoviesAdapter(ArrayList<MoviesHelperClass> commonMovies) {
        CommonMovies = commonMovies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_recycler_design, parent, false);
        MoviesViewHolder moviesView = new MoviesViewHolder(view);

        return moviesView;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
        MoviesHelperClass movieshelperclass = CommonMovies.get(position);
        holder.image.setImageResource(movieshelperclass.getImage());
        holder.name.setText(movieshelperclass.getName());

    }

    @Override
    public int getItemCount() {
        return CommonMovies.size();
    }


    public class MoviesViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.CommonRecycler_image);
            name = itemView.findViewById(R.id.CommonRecycler_name);
        }
    }
}
