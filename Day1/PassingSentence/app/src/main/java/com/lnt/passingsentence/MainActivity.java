package com.lnt.passingsentence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String message = "Message";
    public static final String message1 = "Message1";
//    private Object EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setContentView(R.layout.activity_second2);
    }
    public void sendMessage1(View View){


        Intent intent = new Intent(this,second2.class);

        EditText editText = (EditText) findViewById(R.id.message1);
        EditText editText1 = (EditText) findViewById(R.id.sample);
        String message123 = editText.getText().toString();

       String message12 = editText1.getText().toString();
        intent.putExtra(message,message123);
        intent.putExtra(message1,message12);

        startActivity(intent);


        
    }
}