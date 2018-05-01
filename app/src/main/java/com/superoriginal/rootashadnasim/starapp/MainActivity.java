package com.superoriginal.rootashadnasim.starapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1=findViewById(R.id.listview);
        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("yellow");
        arrayList.add("blue");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView1.setAdapter(arrayAdapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                i.putExtra("name",arrayList.get(position));
                Log.i("name","is  "+arrayList.get(position));
                startActivity(i);
            }
        });
    }
}
