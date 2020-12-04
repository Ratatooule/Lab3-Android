package com.example.lab3;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    public FirstFragment() {
    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onCreate(Bundle instanceState) {
        super.onCreate(instanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //поиск view
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        final Button sumButton = (Button) view.findViewById(R.id.sum);
        final EditText firstTextNumber = view.findViewById(R.id.firstNumber);
        final EditText secondTextNumber = view.findViewById(R.id.secondNumber);
        final TextView textView = view.findViewById(R.id.answer);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstTextNumber.getText().toString());
                int secondNumber = Integer.parseInt(secondTextNumber.getText().toString());
                int sum = firstNumber + secondNumber;

                textView.setText(String.valueOf(sum));
                Toast.makeText(v.getContext(), Integer.toString(sum), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}