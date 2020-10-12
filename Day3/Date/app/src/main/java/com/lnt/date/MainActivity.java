package com.lnt.date;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.lnt.date.R;

public class MainActivity extends AppCompatActivity {

    //TextView time;
    Button Submit;
    DatePicker simpleDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // time=(TextView) findViewById(R.id.time);
        simpleDatePicker= (DatePicker) findViewById(R.id.sampleTimeFicker);
        Submit=(Button) findViewById(R.id.button);
        // simpleTimePicker.setIs24HourView(false);

        //simpleDatePicker.setOnDateChangedListener(new View);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String day = "Day = "+simpleDatePicker.getDayOfMonth();
                String month = "Month = "+simpleDatePicker.getMonth();
                String Year = "Year = "+simpleDatePicker.getYear();

                Toast.makeText(getApplicationContext(),day+month+Year,Toast.LENGTH_SHORT).show();

            }
        });
    }
}