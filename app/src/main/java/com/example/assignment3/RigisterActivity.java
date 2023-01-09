package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RigisterActivity extends AppCompatActivity {
    Button submit;
    EditText fullName, AridNo, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigister);
        submit= (Button) findViewById(R.id.button3);
        fullName = (EditText) findViewById(R.id.editTextTextPersonName3);
        AridNo = (EditText) findViewById(R.id.editTextTextPersonName4);
        email = (EditText) findViewById(R.id.editTextTextPersonName5);
        password = (EditText) findViewById(R.id.editTextTextPersonName6);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = fullName.getText().toString();
                String aridNo = AridNo.getText().toString();
                String Email = email.getText().toString();

                Intent intent = new Intent(view.getContext(), AfterRegisterationActivity.class);
                intent.putExtra("v1",name);
                intent.putExtra("v2",aridNo);
                intent.putExtra("v3",Email);
                startActivity(intent);
            }
        });
    }
}