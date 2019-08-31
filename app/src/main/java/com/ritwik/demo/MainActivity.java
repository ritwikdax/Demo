package com.ritwik.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ritwik.librarydemo.Foo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /***
         * Functions are working fine
         */

        Foo.barFunction();




    }
}
