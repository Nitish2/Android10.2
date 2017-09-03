package com.example.hp.list_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class Layout_3 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout3,container,false);
        view.findViewById(R.id.androidText);
        textView=(TextView)view.findViewById(R.id.androidText);
        String string="A tablet computer, commonly shortened to tablet, is a mobile PC, typically" +
                " with a mobile operating system and LCD touchscreen display processing circuitry, " +
                "and a rechargeable battery in a single thin, flat package.\n" +
                "Tablets, being computers, do what other personal computers do, " +
                "but lack some I/O capabilities that others have. ";
        textView.setText(string);
        return view;
    }
}
