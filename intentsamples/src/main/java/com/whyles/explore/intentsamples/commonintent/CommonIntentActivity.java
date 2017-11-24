package com.whyles.explore.intentsamples.commonintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.intentsamples.R;

public class CommonIntentActivity extends AppCompatActivity {

    private Button btnAlarmClock;

    private Button btnCalendar;

    private Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_intent);
        init();
    }

    private void init(){

        btnAlarmClock = findViewById(R.id.btn_alarm_clock);
        btnAlarmClock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CommonIntentActivity.this, AlarmClockActivity.class));
            }
        });

        btnCalendar = findViewById(R.id.btn_calendar);
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CommonIntentActivity.this, CalendarActivity.class));
            }
        });

        btnCamera = findViewById(R.id.btn_camera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CommonIntentActivity.this, CameraActivity.class));
            }
        });
    }


}
