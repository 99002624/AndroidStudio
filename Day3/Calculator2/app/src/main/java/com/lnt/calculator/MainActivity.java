package com.lnt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonclear, buttondot, buttonequal, buttonmul;
    Button buttonadd, buttonminus, buttondiv;
    TextView text;
    float text1;
    float text2;
    boolean Addition = false,Substraction=false,Multiplication=false,Divident=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.one);
        button2 = (Button) findViewById(R.id.two);
        button3 = (Button) findViewById(R.id.three);
        button4 = (Button) findViewById(R.id.four);
        button5 = (Button) findViewById(R.id.five);
        button6 = (Button) findViewById(R.id.six);
        button7 = (Button) findViewById(R.id.seven);
        button8 = (Button) findViewById(R.id.eight);
        button9 = (Button) findViewById(R.id.nine);
        button0 = (Button) findViewById(R.id.zero);
        buttonclear = (Button) findViewById(R.id.clear);
        buttondot = (Button) findViewById(R.id.dot);
        buttonequal = (Button) findViewById(R.id.equal);
        buttonmul = (Button) findViewById(R.id.mul);
        buttonadd = (Button) findViewById(R.id.plus);
        buttonminus = (Button) findViewById(R.id.minus);
        buttondiv = (Button) findViewById(R.id.div);
        text = (TextView) findViewById(R.id.text);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText() + "0");


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText() + "9");
            }
        });



        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(text.getText().length() == 0){

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

                if (text.getText().length() != 0) {
                    text1 = Float.parseFloat(text.getText() + "");
                    Addition =true;
                    text.setText(null);
                }

            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text.getText().length() == 0){

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

                if (text.getText().length() != 0) {
                    text1 = Float.parseFloat(text.getText() + "");
                    Substraction =true;
                    text.setText(null);
                }

            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text.getText().length() == 0){

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

                if (text.getText().length() != 0) {
                    text1 = Float.parseFloat(text.getText() + "");
                    Multiplication =true;
                    text.setText(null);
                }

            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text.getText().length() == 0){

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

                if (text.getText().length() != 0) {
                    text1 = Float.parseFloat(text.getText() + "");
                    Divident =true;
                    text.setText(null);
                }

            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(text.getText().length() == 0){

                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
                }

                if (text.getText().length() != 0) {
                    //text1 = Float.parseFloat(text.getText() + ".");
                    //Divident =true;
                    text.setText(text.getText()+".");
                }

            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText("");

            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Substraction || Multiplication || Divident) {
                    text2 = Float.parseFloat(text.getText() + "");
                }

                if (Addition) {

                    text.setText(text1 + text2 + "");
                    Addition = false;
                }

                if (Substraction) {

                    text.setText(text1 - text2 + "");
                    Substraction = false;
                }

                if (Multiplication) {
                    text.setText(text1 * text2 + "");
                    Multiplication = false;
                }

                if (Divident) {
                    text.setText(text1 / text2 + "");
                    Divident = false;
                }

            }
        });




    }
}