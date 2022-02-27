package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] avengers={"Ironman","Spiderman","captain america","Thor","Hawkeye","Hulk","black widow","Loki","Black Panther","AntMan","Captain Marvel","Dr Strange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TextView textView=null;
        try {
            // textView.setText("Super Heros");
            ListView listView=findViewById(R.id.list);
            //ListView listView=null;
            ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,avengers);
            listView.setAdapter(arrayAdapter);
        }
        catch(Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }


}