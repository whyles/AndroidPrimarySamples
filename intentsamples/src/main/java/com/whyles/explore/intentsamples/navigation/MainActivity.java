package com.whyles.explore.intentsamples.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.intentsamples.R;
import com.whyles.explore.intentsamples.commonintent.CommonIntentActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCommonIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btnCommonIntent = findViewById(R.id.btn_common_intent);
        btnCommonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, CommonIntentActivity.class));
            }
        });
    }
}
