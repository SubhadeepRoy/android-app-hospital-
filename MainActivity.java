package com.example.hp.hospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView
import android.support.annotation.





public class MainActivity extends AppCompatActivity {

    String a[]={"c","java","android"};
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sp=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter aa=new ArrayAdapter(this,android )
    }
}
