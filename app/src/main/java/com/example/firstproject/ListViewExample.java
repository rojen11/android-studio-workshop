package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ListViewExample extends AppCompatActivity {

    private View parent;
    private ListView cities;
    private FloatingActionButton addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        parent = findViewById(R.id.listViewParent);
        cities = findViewById(R.id.country_listView);

        // List of cities
        ArrayList<String> citiesList = new ArrayList<>();
        citiesList.add("Kathmandu");
        citiesList.add("Bhaktapur");
        citiesList.add("Lalitpur");

        // Adapter for list view
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                citiesList
        );

        cities.setAdapter(citiesAdapter);

        addButton = findViewById(R.id.floatingAdd);

        // Change array list on button click
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> citiesList = new ArrayList<>();
                citiesList.add("Chitwan");
                citiesList.add("Hetauda");
                citiesList.add("Pokhara");

                ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                        ListViewExample.this,
                        android.R.layout.simple_list_item_1,
                        citiesList
                );
                cities.setAdapter(citiesAdapter);

                Snackbar.make(parent, "Array Changed!", Snackbar.LENGTH_LONG).show();
            }
        });


    }
}