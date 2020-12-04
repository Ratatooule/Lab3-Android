package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int status = 1;
    private final int SUM_FRAGMENT = 1;
    private final int BTN_FRAGMENT = 2;
    private final int THIRD_FRAGMENT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void changeFragment(android.app.Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fragment);
        fragmentTransaction.commit();
    }

    private void changeToBtnFragment() {
        changeFragment(SecondFragment.newInstance());
        status = BTN_FRAGMENT;
    }

    private void changeToSumFragment() {
        changeFragment(FirstFragment.newInstance());
        status = THIRD_FRAGMENT;
    }

    private void changeToThirdFragment() {
        changeFragment(ThirdFragment.newInstance());
        status = SUM_FRAGMENT;
    }

    public void switchFragment(View view) {
        if (status == SUM_FRAGMENT)
            changeToBtnFragment();
        else if (status == BTN_FRAGMENT)
            changeToSumFragment();
        else if (status == THIRD_FRAGMENT)
            changeToThirdFragment();
    }

    public void switchActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
