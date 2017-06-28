package com.example.jithu.mani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by JITHU on 6/8/2017.
 */

public class Home extends Activity {

    Button attendance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        attendance = (Button)findViewById(R.id.attendance);

    }

    public void atd (View view){

        String button_text;

        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Attendance")){

            Intent intent = new Intent(this,MainActivity.class);

            startActivity(intent);

        }


    }

}
