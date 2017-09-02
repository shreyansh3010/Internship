package com.shreyanshvit.internship.Fragment.videos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.shreyanshvit.internship.Fragment.KotlinBasic.KotlinBasic;
import com.shreyanshvit.internship.Fragment.java_kotlin.*;
import com.shreyanshvit.internship.R;

import java.util.ArrayList;


public class videos extends Fragment {
    View view;

    public videos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_videos, container, false);

        ArrayList<String> myValues = new ArrayList<String>();

        //Populate the ArrayList with your own values
        myValues.add("Introduction");
        myValues.add("Hello world");
        myValues.add("Android Studio 3");
        myValues.add("Class & objects");
        myValues.add("Var & val");
        myValues.add("Kotlin Java Together");
        myValues.add("Convert java kotlin");
        myValues.add("Decompile Bytecode");
        myValues.add("Operators");
        myValues.add("String Template");
        myValues.add("If else expression");
        myValues.add("String Comperision");

        com.shreyanshvit.internship.Fragment.videos.RecyclerViewAdapter2 adapter = new com.shreyanshvit.internship.Fragment.videos.RecyclerViewAdapter2(myValues);
        RecyclerView myView =  (RecyclerView) view.findViewById(R.id.recyclerview2);
        myView.setHasFixedSize(true);
        myView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myView.setLayoutManager(llm);


        return view;

    }
}
