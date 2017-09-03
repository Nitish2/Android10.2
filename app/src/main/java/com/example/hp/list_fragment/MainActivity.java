package com.example.hp.list_fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements List_Fragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemSelect(String link){ //Calling method
        /*
         A FragmentManager manages Fragments , specifically it handles transactions
         between fragments.
         */
        FragmentManager fragmentManager = getFragmentManager(); //Creating object

        /*
          A FragmentTransaction gives us methods to add, replace, or remove fragments.
          It gives us an interface for interacting with fragments.
         */
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();//Creating object

        // Adding fragments
        Layout_1 layout1;
        Layout_2 layout2;
        Layout_3 layout3;
        Layout_4 layout4;

        //FrameLayout is used to block out an area on the screen to display a single item.
        // Linking layouts with frame layout
        if (link.equals("layout1")) {
            layout1 = new Layout_1();
            fragmentTransaction.replace(R.id.frameLayout,layout1 );
            fragmentTransaction.commit();
        } else if (link.equals("layout2")) {
            layout2 = new Layout_2();
            fragmentTransaction.replace(R.id.frameLayout, layout2);
            fragmentTransaction.commit();
        } else if (link.equals("layout3")) {
            layout3 = new Layout_3();
            fragmentTransaction.replace(R.id.frameLayout, layout3);
            fragmentTransaction.commit();
        } else if (link.equals("layout4")) {
            layout4 = new Layout_4();
            fragmentTransaction.replace(R.id.frameLayout, layout4);
            fragmentTransaction.commit();
        }
    }
}
