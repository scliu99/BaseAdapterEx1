package com.example.cafeburger.baseadapterex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        String[] strings = {"a","b","c"};
        MyBaseAdapter mBaseAdapter = new MyBaseAdapter(getApplicationContext(),strings);
        listView.setAdapter(mBaseAdapter);
    }
}
