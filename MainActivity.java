package com.example.hp.hospital;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;






public class MainActivity extends AppCompatActivity {
    EditText ed,ed1,ed2,ed3,ed4;
    Button bt;
    Spinner sp,sp1;
    String s[]={"MALE","FEMALE"};
    String s1[]={"Anesthetics","Cardiology","Critical Care","Imaging" ,"Elderly services","Gastroenterology","General Services", "General Surgery" ,"Gynecology" ,"Haematology" ,"Human Resources" ,"Infection Control", "Maternity","Neurology"," Nutrition and Dietetics" ,"Obstetrics/Gynecology " };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText)findViewById(R.id.editText);
        ed=(EditText)findViewById(R.id.editText2);
        ed=(EditText)findViewById(R.id.editText4);
        ed=(EditText)findViewById(R.id.editText5);
        ed=(EditText)findViewById(R.id.editText6);
        sp=(Spinner)findViewById(R.id.spinner);
        sp=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,s);
        ArrayAdapter aa1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,s1);
        sp.setAdapter(aa);
        sp.setAdapter(aa1);



    }
}

