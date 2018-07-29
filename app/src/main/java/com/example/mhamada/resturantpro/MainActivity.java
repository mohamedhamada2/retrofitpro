package com.example.mhamada.resturantpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void getfood(View view){
        Intent intent=new Intent(MainActivity.this,ListActivity.class);
        intent.putExtra("type","food");
        startActivity(intent);
    }
    public void getdrinks(View view){
        Intent intent=new Intent(MainActivity.this,ListActivity.class);
        intent.putExtra("type","drinks");
        startActivity(intent);
    }
}
