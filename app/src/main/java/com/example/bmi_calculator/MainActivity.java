
package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText h;
    EditText w;
    TextView v;
    float num1=0, num2=0, value=0;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void calculate(View view) {
        h = (EditText) findViewById(R.id.height);
        w = (EditText) findViewById(R.id.weight);
        v = (TextView) findViewById(R.id.value);
        num1 = Float.parseFloat(h.getText().toString());
        num1 = num1/100;
        num2 = Float.parseFloat(w.getText().toString());
        value = num2 / (num1 * num1);
        v.setText(Float.toString(value));
    }
}