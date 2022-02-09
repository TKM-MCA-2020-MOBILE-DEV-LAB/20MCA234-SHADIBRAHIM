package com.example.spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity<parent> extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s = (Spinner) findViewById(R.id.spinner);
        s.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position,
                               long id) {
        String s1=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,"you selected "+s1,Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?>parent)
    {
        Toast.makeText(this,"nothing selected",Toast.LENGTH_SHORT).show();
    }
}
