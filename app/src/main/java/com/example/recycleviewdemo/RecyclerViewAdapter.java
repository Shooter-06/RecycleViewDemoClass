package com.example.recycleviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<String> mData;
    private LayoutInflater mInflator;

    public RecyclerViewAdapter(Context context,List<String> mData){
        this.mInflator= LayoutInflater.from(context);
        this.mData= mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflator.inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String value = mData.get(position);
        holder.myTextView.setText(value);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
