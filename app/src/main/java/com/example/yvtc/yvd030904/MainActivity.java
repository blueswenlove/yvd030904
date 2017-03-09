package com.example.yvtc.yvd030904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    String str[] = {"aaa", "aab", "abc", "abb", "bbb", "ccc", "caa", "bac"};
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, str);
        act.setAdapter(adapter);
        act.setThreshold(1);
        img = (ImageView) findViewById(R.id.imageView);
    }

    public void click1(View v) {
        img.setImageResource(R.drawable.flower1);
    }

    public void click2(View v) {
        img.setImageResource(R.drawable.flower2);
    }
}