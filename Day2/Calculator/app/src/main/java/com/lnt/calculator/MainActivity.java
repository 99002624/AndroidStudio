package com.lnt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    private void showLog(String text){

        Log.d(HOME_ACTIVITY_TAG,text);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showLog("Activity Created");
    //    setContentView(R.layout.activity_main);
    }

    protected void onRestart(){
        super.onRestart();
        showLog("ACTIVITY  RESTRATED");
    }

    protected void onStart(){
        super.onStart();

        showLog("Activity started");

    }

    protected void onPause(){

        super.onPause();
        showLog("pause");

    }

    protected void onStop(){

        super.onStop();
        showLog("Activity stopped");

    }
}