package com.example.hp.list_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Hp on 02-09-2017.
 */

public class Layout_4 extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout4,container,false);
        view.findViewById(R.id.nodejsText);
        textView=(TextView)view.findViewById(R.id.nodejsText);
        String string="Node.js is an open-source, cross-platform JavaScript run-time environment " +
                "for executing JavaScript code server-side.\n" +
                " Node.js enables JavaScript to be used for server-side scripting, and runs scripts" +
                " server-side to produce dynamic web page content before the page is sent " +
                "to the user's web browser. ";
        textView.setText(string);
        return view;
    }

}
