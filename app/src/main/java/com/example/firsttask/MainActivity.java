package com.example.firsttask;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText TextField1, TextField2, TextField3;
    private TextView TextField4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextField1 = (EditText) findViewById(R.id.TextField1);
        TextField2 = (EditText) findViewById(R.id.TextField2);
        TextField3 = (EditText) findViewById(R.id.TextField3);
        Button button = (Button) findViewById(R.id.PushButton);
        TextView textView = (TextView) findViewById(R.id.Title);
        TextField4 = (TextView) findViewById(R.id.TextField4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double a = Double.parseDouble(TextField1.getText().toString());
                double b = Double.parseDouble(TextField2.getText().toString());
                double c = Double.parseDouble(TextField3.getText().toString());
                double d = Math.pow(b, 2) - 4 * a * c;
                double x1 = (-b - Math.pow(d, 0.5)) / (2 * a);
                double x2 = (-b + Math.pow(d, 0.5)) / (2 * a);
                @SuppressLint("DefaultLocale") String Result1 = String.format("%.2f", x1);
                @SuppressLint("DefaultLocale") String Result2 = String.format("%.2f", x2);
                String ans = "x1 = " + String.valueOf(Result1) + "\n" + "x2 = " + String.valueOf(Result2);
                TextField4.setText(ans);


            }
        });
    };
}