package com.example.ssoft_13.anotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

public class MainActivity extends AppCompatActivity {

    EActivity(R.layout.main);
    @ViewById(R.id.btn_add);
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);


    }*/
}
