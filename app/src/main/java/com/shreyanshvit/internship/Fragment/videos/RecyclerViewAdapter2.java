package com.shreyanshvit.internship.Fragment.videos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shreyanshvit.internship.Fragment.android_program.expand_android_program;
import com.shreyanshvit.internship.R;

import java.util.ArrayList;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder> {
    public ArrayList<String> myValues;

    public RecyclerViewAdapter2(ArrayList<String> myValues) {
        this.myValues = myValues;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_cardview, parent, false);
        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.myTextView.setText(myValues.get(position));
    }


    @Override
    public int getItemCount() {
        return myValues.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView myTextView;

        public MyViewHolder(final View itemView) {
            super(itemView);
            myTextView = (TextView) itemView.findViewById(R.id.title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), youtube_video.class);
                    //add data to the Intent object
                    intent.putExtra("text", myTextView.getText().toString());
                    v.getContext().startActivity(intent);

                }
            });

        }
    }



}