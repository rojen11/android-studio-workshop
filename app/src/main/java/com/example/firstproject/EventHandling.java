package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class EventHandling extends AppCompatActivity {

    private TextInputEditText input1;
    private TextInputEditText input2;
    private TextView output;
    private Button submitButton;
    private View parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);

        input1 = findViewById(R.id.inputText1);
        input2 = findViewById(R.id.inputText2);
        output = findViewById(R.id.outputText);
        submitButton = findViewById(R.id.submitButton);
        parent = findViewById(R.id.relativeLayoutParent);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable i1 = input1.getText();
                Editable i2 = input2.getText();

                int sum = Integer.parseInt(i1.toString()) + Integer.parseInt(i2.toString());
                output.setText(String.valueOf(sum));


                Toast.makeText(EventHandling.this, "Sum: " + String.valueOf(sum), Toast.LENGTH_LONG).show();

                Snackbar.make(parent, String.valueOf(sum) + " has been displayed.", Snackbar.LENGTH_LONG)
                        .setAction("Again", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(EventHandling.this, String.valueOf(sum) + " has been displayed.", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setActionTextColor(Color.RED)
                        .setTextColor(Color.YELLOW).show();

            }
        });

    }
}