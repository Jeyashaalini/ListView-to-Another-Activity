package com.example.jaf_it_2020_f_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        textView =findViewById(R.id.textView);
        textView.setText(getIntent().getExtras().getString("course"));

    }
}