package com.example.sharedprefernce;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView t1,t2,t3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        t1=(TextView) findViewById(R.id.textView3);
        t2=(TextView) findViewById(R.id.textView4);
        t3=(TextView) findViewById(R.id.textView5);
        String value1 = extras.getString("1");
        String value2 = extras.getString("2");
        String value3 = extras.getString("3");
        t1.setText(value1);
        t2.setText("Address is "+ value3);
        t3.setText("Email is "+ value2);

    }
    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

}