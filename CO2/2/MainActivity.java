package com.example.calculatorgridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ans;
    String str,temp;
    float num1,num2,res;
    int flag=0;
    int flag2=0;
    int flag3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=findViewById(R.id.result);
    }
    public void clear(View view)
    {
        ans.setText("");
    }
    public void zero(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"0");
    }
    public void one(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"1");
    }
    public void two(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"2");
    }
    public void three(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"3");
    }
    public void four(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"4");
    }
    public void five(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"5");
    }
    public void six(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"6");
    }
    public void seven(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"7");
    }
    public void eight(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"8");
    }
    public void nine(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+"9");
    }
    public void dot(View view)
    {
        str=ans.getText().toString();
        ans.setText(str+".");
    }
    public void add(View view)
    {
        num1=Float.parseFloat(ans.getText().toString());
        ans.setText("");
        flag=1;
    }
    public void sub(View view)
    {
        num1=Float.parseFloat(ans.getText().toString());
        ans.setText("");
        flag=2;
    }
    public void mul(View view)
    {
        num1=Float.parseFloat(ans.getText().toString());
        ans.setText("");
        flag=3;
    }
    public void div(View view)
    {
        num1=Float.parseFloat(ans.getText().toString());
        ans.setText("");
        flag=4;
    }
    public void plusminus(View view)
    {
        if(flag2==0)
        {
            temp= ans.getText().toString();
            temp=temp.replace("-","");
            flag2=1;
        }
        else
        {
            temp= ans.getText().toString();
            ans.setText("-"+temp);
            flag2=0;
        }
    }
    public void percent(View view)
    {
        Double no =Double.parseDouble(ans.getText().toString())/100;
        ans.setText(String.valueOf(no));
    }
    public void bracket(View view)
    {
        if(flag3==0)
        {
            temp= ans.getText().toString();
            temp=temp.replace("(","");
            temp=temp.replace(")","");
            flag3=1;
        }
        else
        {
            temp= ans.getText().toString();
            ans.setText("("+temp+")");
            flag3=0;
        }
    }
    public void equal(View view)
    {
        num2=Float.parseFloat(ans.getText().toString());
        switch(flag)
        {
            case 1: res=num1+num2;
                ans.setText(String.valueOf(res));
                break;
            case 2: res=num1-num2;
                ans.setText(String.valueOf(res));
                break;
            case 3: res=num1*num2;
                ans.setText(String.valueOf(res));
                break;
            case 4: res=num1/num2;
                ans.setText(String.valueOf(res));
                break;
        }
    }
}