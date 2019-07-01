package com.example.thebridgecode.custom_adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList names;
    public static int[] personImages={R.drawable.ic_accessibility_black_24dp, R.drawable.ic_accessible_black_24dp, R.drawable.ic_account_balance_black_24dp, R.drawable.ic_face_black_24dp};
    public static String [] personName={"Nirav","Nilesh","Chirag","Chetan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        lv= (ListView) findViewById(R.id.listView_Names);
        //lv.setAdapter(new CustomAdapter(this, personName, personImages));
    }
}
