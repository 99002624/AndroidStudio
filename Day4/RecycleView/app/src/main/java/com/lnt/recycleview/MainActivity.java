package com.lnt.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView Recycle;
    ArrayList<String> personNames = new ArrayList<String>(Arrays.asList("person1","person2","person3","person4","person5","person7","person8"));
    ArrayList<String> personId = new ArrayList<String> (Arrays.asList("1","2","3","4","5","6","7","8"));
    ArrayList<Integer> personImage= new ArrayList<Integer>(Arrays.asList(R.drawable.qwe,R.drawable.qwe,R.drawable.qwe,R.drawable.qwe,R.drawable.qwe,R.drawable.qwe,R.drawable.qwe,R.drawable.qwe));
   // static Integer[]  personImage={R.drawable.qwe};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Recycle =(RecyclerView) findViewById(R.id.Recycle1);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        Recycle.setLayoutManager(linearLayoutManager);

        NewAdaptor1 newAdaptor =new NewAdaptor1(MainActivity.this,personNames,personId,personImage);

        Recycle.setAdapter(newAdaptor);


    }
}