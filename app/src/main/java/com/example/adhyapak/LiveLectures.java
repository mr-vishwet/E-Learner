package com.example.adhyapak;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.adhyapak.databinding.ActivityLiveLecturesBinding;


public class LiveLectures extends AppCompatActivity {
    ImageView textExpand;
    LinearLayout layoutDescription;

    private boolean isShowDescription = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_lectures);
        setView();
        setListeners();
    }

    private void setListeners() {
        textExpand.setOnClickListener( v -> {
            if(isShowDescription)
                layoutDescription.setVisibility(View.VISIBLE);
            else
                layoutDescription.setVisibility(View.GONE);

            isShowDescription = !isShowDescription;
        });
    }

    private void setView() {
        textExpand = (ImageView) findViewById(R.id.textExpand);
        layoutDescription = (LinearLayout) findViewById(R.id.layoutDescription);
    }

}