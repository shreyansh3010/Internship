package com.shreyanshvit.internship.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shreyanshvit.internship.R;

public class About extends Fragment {

    View view;
    TextView textView, Dev;

    public About() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_about, container, false);

        String x = "Kotlin-Android is one of the most useful app to learn Kotlin easily.\n\nAdvantages:\n1.Simple and Easy Tutotrial\nOffline feature\n3.Java-Kotlin Comparision\n4.Learn sample programs\n5.Video Tutorials";

        String y = "Name : Shreyansh Jain\nEmail : shreyanshjain.2015@vit.ac.in";

        textView = (TextView) view.findViewById(R.id.about);
        Dev = (TextView) view.findViewById(R.id.dev);
        textView.setText(x);
        Dev.setText(y);

        return view;
    }
}
