package com.example.kt_thanhdat;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView img1, img2, img3, img4, img5;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);

        img1.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);

        });
        img2.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(i);

        });
        img3.setOnClickListener(v ->{
            i=new Intent(MainActivity.this,ListviewActivity.class);
           startActivity(i);

       });
      //  img4.setOnClickListener(v ->{
        //    i=new Intent(MainActivity.this,MainActivity5.class);
        //    startActivity(i);

      //  });
       // img5.setOnClickListener(v ->{
        //    i=new Intent(MainActivity.this,MainActivity6.class);
         //   startActivity(i);

       // });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                i=new Intent(MainActivity.this, info1.class);
                startActivity(i);

                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                makeText(this, "Bạn bấm vào menu 2", LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
                break;
            case R.id.menu4:
                makeText(this, "Bạn bấm vào menu 2", LENGTH_SHORT).show();
                //code xử lý khi bấm menu2
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void xuLyThoat(View view){
        //Tạo đối tượng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
//Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý thoát chương trình không?");
// Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
//Nút Cancel
        b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
//Tạo dialog
        AlertDialog al = b.create();
//Hiển thị
        al.show();

    }


}
