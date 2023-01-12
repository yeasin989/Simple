package com.developerrajnagor.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.developerrajnagor.testlib.Library;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Library library = new Library();
        String stringValueFromLibrary = library.getStringValue();



        Toast.makeText(this, stringValueFromLibrary, Toast.LENGTH_SHORT).show();
    }
}