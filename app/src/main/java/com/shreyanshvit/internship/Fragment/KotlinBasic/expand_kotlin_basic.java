package com.shreyanshvit.internship.Fragment.KotlinBasic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shreyanshvit.internship.R;


public class expand_kotlin_basic extends Fragment {

    View view;
    TextView textView1, textView2;
    public expand_kotlin_basic() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_expand_kotlin_basic, container, false);

        String strtext=getArguments().getString("name");

        textView1 = (TextView) view.findViewById(R.id.head_id_basic);
        textView1.setText(strtext);

        textView2 = (TextView) view.findViewById(R.id.text_basic);
        textView2.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");

        return view;

    }

}
