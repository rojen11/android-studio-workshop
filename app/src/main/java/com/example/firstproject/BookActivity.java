package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class BookActivity extends AppCompatActivity {

    private androidx.recyclerview.widget.RecyclerView booksRecView;
    private BookRecyclerViewAdapter bookRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        bookRecyclerViewAdapter = new BookRecyclerViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(bookRecyclerViewAdapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this, 2));


        bookRecyclerViewAdapter.setBooks(Utils.getInstance(this).getBooks());
    }
}