package com.example.hp.list_fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class List_Fragment extends Fragment {
    //declaring variable
    private OnItemSelectedListener onItemSelectedListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        // Creating and initializing objects by id.
        Button button = (Button) view.findViewById(R.id.button);
        Button button2= (Button) view.findViewById(R.id.button2);
        Button button3 = (Button) view.findViewById(R.id.button3);
        Button button4 = (Button) view.findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() { // Creating onClickListen
            public void onClick(View v) {
                update("layout1"); // Calling method
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                update("layout2"); // Calling method
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                update("layout3"); // Calling method
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                update("layout4"); // Calling method
            }
        });

        return view;
    }

    public interface OnItemSelectedListener {
        void onItemSelect(String link); // Creating method
    }

    @Override
    // onAttach() is called once the fragment is associated with its activity.
    public void onAttach(Context context) {
        super.onAttach(context);

        /*
        This makes sure that the container activity has implemented
        the callback interface. If not, it throws an exception.
         */

        if (context instanceof OnItemSelectedListener) {
            onItemSelectedListener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString());
        }

    }

    public void update(String s) { // Creating update Method
        onItemSelectedListener.onItemSelect(s);
    }
}
