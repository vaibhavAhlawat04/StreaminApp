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

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder>{
    ArrayList<PopularHelperClass> popular;

    public PopularAdapter(ArrayList<PopularHelperClass> popular) {
        this.popular = popular;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.common_recycler_design,parent,false);
        PopularViewHolder popView = new PopularViewHolder(view);

        return popView;
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {
        PopularHelperClass pophelper = popular.get(position);
        holder.image.setImageResource(pophelper.getImage());
        holder.name.setText(pophelper.getName());

    }

    @Override
    public int getItemCount() {
        return popular.size();
    }

    public class PopularViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.CommonRecycler_image);
            name=itemView.findViewById(R.id.CommonRecycler_name);
        }
    }
}
