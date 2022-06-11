package com.example.kt_thanhdat;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class info1 extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TTSV");
        actionBar.setDisplayHomeAsUpEnabled(true);
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
            case R.id.info:
                Toast.makeText(this, "Bạn bấm vào menu 1", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                i = new Intent(info1.this,ListviewActivity.class);
                startActivity(i);
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(info1.this,MainActivity2.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(info1.this,MainActivity3.class);
                startActivity(i);
                //code xử lý khi bấm menu2
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void moManHinhListView1(View view) {
        i = new Intent(info1.this,Listview1Activity.class);
        startActivity(i);
    }

    public void moManHinhListView2(View view) {
        i = new Intent(info1.this,Listview2Activity.class);
        startActivity(i);
    }

    public void moManHinhListView3(View view) {
        i = new Intent(info1.this,Listview3Activity.class);
        startActivity(i);
    }
}