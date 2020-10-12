package com.lnt.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton Radio1,Radio2,Radio3;
    RadioButton Radio5;

     String SuperStar;

    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Radio1=(RadioButton) findViewById(R.id.Radio1);
        Radio2=(RadioButton) findViewById(R.id.Radio2);
        Radio3=(RadioButton) findViewById(R.id.Radio3);
        Radio5=(RadioButton) findViewById(R.id.Radio5);
        Submit = (Button) findViewById(R.id.button);
        
        Submit.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                        if(Radio1.isChecked()){
                            
                            SuperStar = Radio1.getText().toString();
                        }else if(Radio2.isChecked()){
                            SuperStar = Radio2.getText().toString();
                        }else if(Radio3.isChecked()){
                            SuperStar = Radio3.getText().toString();
                        }else if(Radio5.isChecked()){
                            SuperStar = Radio5.getText().toString();
                        }


                        Toast.makeText(MainActivity.this,SuperStar, Toast.LENGTH_SHORT).show();


            }
        }
        
        );
        
    }
    
    
}