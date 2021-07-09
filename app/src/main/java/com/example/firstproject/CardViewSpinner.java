package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class CardViewSpinner extends AppCompatActivity {

    Spinner nameSpinner;
    TextView cardTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_spinner);

        nameSpinner = findViewById(R.id.nameSelector);
        cardTitle = findViewById(R.id.cardTitle);

        // change card title on item select
        nameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(parent, nameSpinner.getSelectedItem().toString() + " selected", Snackbar.LENGTH_LONG).show();
                cardTitle.setText(nameSpinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Snackbar.make(parent, nameSpinner.getSelectedItem().toString() + " selected from previous", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}