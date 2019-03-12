package com.example.aravind.housekeeping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newpage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpage1);
    }

    public void addtask(View view)
    {
        Intent intent =new Intent(this,addtask.class);
        startActivity(intent);
    }
    public void addasset(View view)
    {
        Intent intent =new Intent(this,addasset.class);
        startActivity(intent);
    }
    public void addworkers(View view)
    {
        Intent intent =new Intent(this,addworkers.class);
        startActivity(intent);
    }
    public void allocatetask(View view)
    {
        Intent intent =new Intent(this,allocatetask.class);
        startActivity(intent);
    }
}
