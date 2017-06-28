package com.example.jithu.mani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner , spinner2;
    ArrayAdapter<CharSequence> adapter;
    RadioButton rb;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this , R.array.Course,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.Subject,android.R.layout.simple_spinner_item);
       spinner2.setAdapter(adapter1);


rg = (RadioGroup)findViewById(R.id.rgroup);

    }

    public void rdclick(View v) {

        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radiobuttonid);

    }

    public void attend (View view){

        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Next"))
        {

Intent intent = new Intent(this , SecondActivity.class);

startActivity(intent);
        }


    }


    }







