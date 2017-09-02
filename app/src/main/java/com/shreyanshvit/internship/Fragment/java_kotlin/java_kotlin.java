package com.shreyanshvit.internship.Fragment.java_kotlin;

import android.content.Context;
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


public class java_kotlin extends Fragment {

    View view;

    public java_kotlin() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_java_kotlin, container, false);

        ArrayList<String> myValues = new ArrayList<String>();

        //Populate the ArrayList with your own values
        myValues.add("Data types");
        myValues.add("Enum");
        myValues.add("For loop");
        myValues.add("Switch case");
        myValues.add("Exception handling");
        myValues.add("Constructor");
        myValues.add("Inheritance");
        myValues.add("Interface");
        myValues.add("Ternary Operator");

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myValues);
        RecyclerView myView =  (RecyclerView) view.findViewById(R.id.recyclerview);
        myView.setHasFixedSize(true);
        myView.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        myView.setLayoutManager(llm);

    return view;
    }


}
