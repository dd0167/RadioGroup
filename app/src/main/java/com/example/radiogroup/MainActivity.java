package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch Switch;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch=(Switch) findViewById(R.id.Switch);
        radioButton1=(RadioButton) findViewById(R.id.radioButton1);
        radioButton2=(RadioButton) findViewById(R.id.radioButton2);
        radioButton3=(RadioButton) findViewById(R.id.radioButton3);
        radioButton4=(RadioButton) findViewById(R.id.radioButton4);
        linearLayout=(LinearLayout) findViewById(R.id.linearLayout);
    }

    public void click(View view) {
        if (Switch.isChecked()==false && radioButton1.isChecked())
        {
            linearLayout.setBackgroundColor(Color.RED);
        }
        if (Switch.isChecked()==false && radioButton2.isChecked())
        {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        if (Switch.isChecked()==false && radioButton3.isChecked())
        {
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
        if (Switch.isChecked()==false && radioButton4.isChecked())
        {
            linearLayout.setBackgroundColor(Color.GREEN);
        }
    }

    public void rb1(View view) {
        if (Switch.isChecked())
        {
            linearLayout.setBackgroundColor(Color.RED);
        }
    }

    public void rb2(View view) {
        if (Switch.isChecked())
        {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
    }

    public void rb3(View view) {
        if (Switch.isChecked())
        {
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
    }

    public void rb4(View view) {
        if (Switch.isChecked())
        {
            linearLayout.setBackgroundColor(Color.GREEN);
        }
    }
}