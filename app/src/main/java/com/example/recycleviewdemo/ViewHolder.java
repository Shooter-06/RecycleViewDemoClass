package com.example.recycleviewdemo;

import android.content.Context;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView myTextView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        myTextView= itemView.findViewById(R.id.textView);
    }
}
