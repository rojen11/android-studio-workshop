package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button relativeButton = findViewById(R.id.relativeButton);
        Button linearButton = findViewById(R.id.linearButton);
        Button frameButton = findViewById(R.id.frameButton);
        Button tableButton = findViewById(R.id.tableButton);
        Button eventButton = findViewById(R.id.eventButton);
        Button listViewButton = findViewById(R.id.listViewButton);
        Button cardViewSpinnerButton = findViewById(R.id.cardSpinnerView);
        Button recyclerViewButton = findViewById(R.id.recyclerViewButton);
        Button fragmentNavButton = findViewById(R.id.fragmentNavButton);
        Button bookRecyclerViewButton = findViewById(R.id.bookRecyclerView);

        relativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(intent);
            }
        });

        linearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                intent.putExtra("destination", "Linear layout passed from intent.");
                startActivity(intent);
            }
        });

        frameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameLayout.class);
                startActivity(intent);
            }
        });

        tableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableLayout.class);
                startActivity(intent);
            }
        });

        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventHandling.class);
                startActivity(intent);
            }
        });

        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewExample.class);
                startActivity(intent);
            }
        });

        cardViewSpinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardViewSpinner.class);
                startActivity(intent);
            }
        });

        recyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerView.class);
                startActivity(intent);
            }
        });

        fragmentNavButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NavigationHost.class);
                startActivity(intent);
            }
        });

        bookRecyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });

    }
}