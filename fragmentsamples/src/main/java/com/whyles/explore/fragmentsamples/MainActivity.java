package com.whyles.explore.fragmentsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.whyles.explore.fragmentsamples.basics.BasicsActivity;
import com.whyles.explore.fragmentsamples.DynamicFragment.FromCodeActivity;
import com.whyles.explore.fragmentsamples.StaticFragment.FromXmlActivity;

public class MainActivity extends AppCompatActivity {


    private Button btn1;

    private Button btn2;

    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FromXmlActivity.class));
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BasicsActivity.class));
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FromCodeActivity.class));
            }
        });
    }
}
