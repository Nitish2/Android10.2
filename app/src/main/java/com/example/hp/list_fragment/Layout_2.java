package com.example.hp.list_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class Layout_2 extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout2,container,false);
        view.findViewById(R.id.javaScriptText);
        textView=(TextView)view.findViewById(R.id.javaScriptText);
        // String to be shown in the text view
        String string="JavaScript is a full-fledged dynamic programming language that, when applied"
                + "to an HTML document,can provide dynamic interactivity on websites. \n" +
                "It was invented by Brendan Eich, co-founder of the Mozilla project, " +
                "the Mozilla Foundation, and the Mozilla Corporation. "
                ;
        textView.setText(string); //Setting the text
        return view; // Return the view
    }
}