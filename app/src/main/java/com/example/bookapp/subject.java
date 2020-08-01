package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subject extends AppCompatActivity {


    ListView listview;
    String[] listelements=new String[]{"SPCC","MACHINE LEARNING","SOFTWARE ENGINEERING","DATA WAREHOUSE AND MINING","CRYPTOGRAPHY AND SYSTEM SECURITY"};
    List<String> lists;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        listview = findViewById(R.id.listview);

        lists =new ArrayList<String>(Arrays.asList(listelements));
        adapter =new ArrayAdapter<String>(subject.this,android.R.layout.simple_list_item_1,lists);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),spcc.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),ML.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(),SE.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(),DWM.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(),CSS.class));
                        break;
                }

            }
        });

    }
}
