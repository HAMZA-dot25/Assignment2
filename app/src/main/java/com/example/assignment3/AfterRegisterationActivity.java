package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AfterRegisterationActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_registeration);

        tv1 = (TextView) findViewById(R.id.textView4);
        tv2 = (TextView) findViewById(R.id.textView5);
        tv3 = (TextView) findViewById(R.id.textView6);

        Intent intent = getIntent();
        String name = intent.getStringExtra("v1");
        String aridNo = intent.getStringExtra("v2");
        String email = intent.getStringExtra("v3");
        tv1.setText(name);
        tv2.setText(aridNo);
        tv3.setText(email);
    }
}