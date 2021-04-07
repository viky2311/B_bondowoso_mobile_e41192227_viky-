package com.example.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FirstFragment extends Fragment {


    View view;
    Button firstButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);
// get the reference of Button
        firstButton = (Button) view.findViewById(R.id.button_1);
// perform setOnClickListener on first Button
        firstButton.setOnClickListener(v -> {
// display a message by using a Toast
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
        });
        return view;
    }
}