package com.mydemons.androidweekly;


import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.mydemons.mylibrary.LibraryFile;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LibraryFile   obj = new LibraryFile();
        Toast.makeText(MainActivity.this,obj.substract(20,10),Toast.LENGTH_LONG).show();
    }


}
