package com.shreyanshvit.internship.Fragment.android_program;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shreyanshvit.internship.R;

import java.util.ArrayList;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.MyViewHolder> {
    public ArrayList<String> myValues;

    public RecyclerViewAdapter1(ArrayList<String> myValues) {
        this.myValues = myValues;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
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
            myTextView = (TextView) itemView.findViewById(R.id.text_cardview);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    expand_android_program fragment = new expand_android_program();
                    FragmentTransaction fragmentTransaction = ((FragmentActivity)v.getContext()).getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_container, fragment);
                    Bundle bundle=new Bundle();
                    bundle.putString("name", myTextView.getText().toString());
                    fragment.setArguments(bundle);
                    fragmentTransaction.commit();

                }
            });

        }
    }



}