package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        textView = findViewById(R.id.linearLaoyoutText);

        Bundle extra = getIntent().getExtras();

        if (extra != null) {
            String stateFromMainActivity = extra.getString("destination");
            System.out.println("debug : " + stateFromMainActivity);
            textView.setText(stateFromMainActivity);
        }

    }
}