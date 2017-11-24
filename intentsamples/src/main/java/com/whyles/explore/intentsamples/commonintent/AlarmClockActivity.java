package com.whyles.explore.intentsamples.commonintent;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.intentsamples.R;

public class AlarmClockActivity extends AppCompatActivity {

    private Button btnCreateAlarm;

    private Button btnCreateTimer;

    private Button btnShowAlarms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_clock);

        init();
    }

    private void init(){
        btnCreateAlarm = findViewById(R.id.btn_create_alarm);
        btnCreateAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                createAlarm("testAlarm",22, 55);
            }
        });

        btnCreateTimer = findViewById(R.id.btn_create_timer);
        btnCreateTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTimer("testTimer", 120);
            }
        });

        btnShowAlarms = findViewById(R.id.btn_show_alarms);
        btnShowAlarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAlarms();
            }
        });
    }

    /**
     * 创建闹钟
     *
     * 需要添加权限 <uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
     *
     * @param message 闹钟备注
     * @param hour 小时
     * @param minutes 分钟
     */
    private void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * 创建计时器
     *
     * 需要添加权限 <uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
     *
     * @param message 备注
     * @param seconds 秒
     */
    private void startTimer(String message, int seconds) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_LENGTH, seconds)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * 显示所有的闹钟
     *
     * 需要版本Android4.4（API19）
     */
    private void showAlarms() {
        Intent intent = new Intent(AlarmClock.ACTION_SHOW_ALARMS);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
