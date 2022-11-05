package com.example.demofitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.lzyzsd.circleprogress.ArcProgress;
import com.github.lzyzsd.circleprogress.CircleProgress;
import com.github.lzyzsd.circleprogress.DonutProgress;

public class WaterIntakeActivity extends AppCompatActivity {

    Button ml100, ml50, ml250, ml500, ml750, ml1000, decrease;
    ArcProgress arcProgress;
    DonutProgress donutProgress;
    CircleProgress circleProgress;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_intake);
        ml50 = findViewById(R.id.up50);
        ml100 = findViewById(R.id.up100);
        ml250 = findViewById(R.id.up250);
        ml500 = findViewById(R.id.up500);
        ml750 = findViewById(R.id.up750);
        ml1000 = findViewById(R.id.up1000);
        decrease = findViewById(R.id.decrease);

        arcProgress = findViewById(R.id.arc_progress);
        donutProgress = findViewById(R.id.donut_progress);
        circleProgress = findViewById(R.id.circle_progress);

        ml50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=2;
                    updateProgressBar();
                }

            }
        });
        ml100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=4;
                    updateProgressBar();
                }

            }
        });
        ml250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=10;
                    updateProgressBar();
                }

            }
        });
        ml500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=20;
                    updateProgressBar();
                }

            }
        });
        ml750.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=30;
                    updateProgressBar();
                }

            }
        });
        ml1000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress<=100){
                    progress +=40;
                    updateProgressBar();
                }

            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress>=10){
                    progress -=10;
                    updateProgressBar();
                }

            }
        });


    }

    private void updateProgressBar() {
        donutProgress.setDonut_progress(String.valueOf(progress));
        arcProgress.setProgress(progress);
        circleProgress.setProgress(progress);
    }
}