package com.example.bookapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class sem6 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String[] users = {"Welcome to Semester 6" , "Syllabus", "Subject", "Question Paper Link"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, users);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(), "Selected User: "+users[position] ,Toast.LENGTH_SHORT).show();
        switch (position) {
            case 1:
                // Whatever you want to happen when the first item gets selected
                startActivity(new Intent(getApplicationContext(), syllabussem6.class));
                break;
            case 2:
                // Whatever you want to happen when the second item gets selected
                startActivity(new Intent(getApplicationContext(), subject.class));
                break;
            case 3:
                // Whatever you want to happen when the thrid item gets selected
                startActivity(new Intent(getApplicationContext(), link.class));
                break;

        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO - Custom Code
    }

}