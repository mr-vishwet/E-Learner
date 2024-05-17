package com.example.adhyapak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout liveLecturesRelative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setListeners();

    }

    private void setListeners() {
        liveLecturesRelative.setOnClickListener( v -> {
            startActivity(new Intent(this,LiveLectures.class));
            overridePendingTransition(R.anim.slide_in_left,R.anim.stay);
        });
    }

    private void setViews() {
        liveLecturesRelative = (RelativeLayout) findViewById(R.id.liveLecturesRelative);
    }
}