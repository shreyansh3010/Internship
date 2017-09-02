package com.shreyanshvit.internship.Fragment.android_program;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shreyanshvit.internship.Fragment.java_kotlin.RecyclerViewAdapter;
import com.shreyanshvit.internship.R;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shreyanshvit.internship.R;

import java.util.ArrayList;


public class android_program extends Fragment {

    View view;

    public android_program() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android_program, container, false);

        ArrayList<String> myValues = new ArrayList<String>();

        //Populate the ArrayList with your own values
        myValues.add("Activity");
        myValues.add("Fragments");
        myValues.add("Service");
        myValues.add("TextView & EditText");
        myValues.add("Spinner & ArrayAdapter");
        myValues.add("Alert Dialog");
        myValues.add("Shared Preference");
        myValues.add("OnclickListener");
        myValues.add("Switch Activity");
        myValues.add("Switch Fragment");


        RecyclerViewAdapter1 adapter = new RecyclerViewAdapter1(myValues);
        RecyclerView myView =  (RecyclerView) view.findViewById(R.id.recyclerview1);
        myView.setHasFixedSize(true);
        myView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myView.setLayoutManager(llm);

        return view;
    }


}
