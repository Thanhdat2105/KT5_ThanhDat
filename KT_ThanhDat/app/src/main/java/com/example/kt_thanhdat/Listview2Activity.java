package com.example.kt_thanhdat;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Listview2Activity extends AppCompatActivity {
    Intent i;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String []arrdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView2");
        actionBar.setDisplayHomeAsUpEnabled(true);

        arrdata = getResources().getStringArray(R.array.myArray);
        listView= findViewById(R.id.listviewdata2);
        arrayAdapter = new ArrayAdapter<String>(Listview2Activity.this, android.R.layout.simple_list_item_1,arrdata);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                makeText(Listview2Activity.this, "Bạn chon[" + arrdata[i]+"]", LENGTH_SHORT).show();
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Bạn bấm vào menu 1", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                Toast.makeText(this, "Bạn bấm vào menu 2", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(Listview2Activity.this,MainActivity2.class);
                startActivity(i);
                break;
            case R.id.menu4:
                Toast.makeText(this, "Bạn bấm vào menu 2", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }


}