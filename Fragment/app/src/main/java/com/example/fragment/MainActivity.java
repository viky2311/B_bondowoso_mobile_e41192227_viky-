package com.example.fragment;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's
        firstFragment = (Button) findViewById(R.id.fragment1);
        secondFragment = (Button) findViewById(R.id.fragment2);

// perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(v -> {
// load First Fragment
            loadFragment(new FirstFragment());
        });
// perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener(v -> {
// load Second Fragment
            loadFragment(new SecondFragment());
        });

    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.layout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}