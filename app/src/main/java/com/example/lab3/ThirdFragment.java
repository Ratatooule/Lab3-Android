package com.example.lab3;

import android.os.Bundle;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {

    public ThirdFragment() {
    }

    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public void onCreate(Bundle instanceState) {
        super.onCreate(instanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }
}