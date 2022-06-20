package com.letu.app1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnProduct:{
                Intent intent= new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.mnXemDSBook:{
//                Intent intent2= new Intent(MainActivity.this,BookActivity.class);
//                startActivity(intent2);
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}