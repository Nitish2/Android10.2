package com.example.hp.list_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Layout_1 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout1,container,false);
        view.findViewById(R.id.javaText);
        textView=(TextView)view.findViewById(R.id.javaText);
        // String to be shown in the text view
        String  string="Java is a high-level programming language originally developed " +
                "by Sun Microsystems and released in 1995.\n " +
                "Java runs on a variety of platforms, such as Windows, Mac OS, " +
                "and the various versions of UNIX.";
        textView.setText(string); //Setting the text
        return view; // Returns the view
    }
}
