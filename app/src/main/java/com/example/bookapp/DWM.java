package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWM extends AppCompatActivity {

    ListView listview;
    String[] listelements=new String[]{"DATA MINING","DATA WAREHOUSE"};
    List<String> lists;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_w_m);

        listview=findViewById(R.id.listview);
        lists =new ArrayList<String>(Arrays.asList(listelements));
        adapter =new ArrayAdapter<String>(DWM.this,android.R.layout.simple_list_item_1,lists);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getApplicationContext(),dwm1.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(),dwm2.class));
                        break;

                }

            }
        });
    }
}
