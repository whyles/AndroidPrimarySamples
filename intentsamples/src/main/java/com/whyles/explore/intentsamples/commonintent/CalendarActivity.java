package com.whyles.explore.intentsamples.commonintent;

import android.content.Intent;
import android.icu.util.Calendar;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.intentsamples.R;

public class CalendarActivity extends AppCompatActivity {

    private Button btnCalendarAddEvent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        init();
    }

    private void init(){
        btnCalendarAddEvent = findViewById(R.id.btn_calendar_add_event);
        btnCalendarAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addEvent("testTitle", "testLocation", Calendar.getInstance(), Calendar.getInstance());
            }
        });
    }

    private void addEvent(String title, String location, Calendar begin, Calendar end) {
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE, title)
                .putExtra(CalendarContract.Events.EVENT_LOCATION, location)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, begin)
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, end);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
