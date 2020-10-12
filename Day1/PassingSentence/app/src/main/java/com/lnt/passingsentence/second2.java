package com.lnt.passingsentence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        Intent intent = getIntent();

        String msg =intent.getStringExtra(MainActivity.message);
        String msg1 =intent.getStringExtra(MainActivity.message1);

        TextView na = findViewById(R.id.Name);
        TextView id1 = findViewById(R.id.Id);

        na.setText(msg);
        id1.setText(msg1);
    }
}