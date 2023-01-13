package com.developerrajnagor.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.facebook.account.i;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i library = new i();
        String stringValueFromLibrary = library.getStringValue();



        Toast.makeText(this, stringValueFromLibrary, Toast.LENGTH_SHORT).show();
    }
}