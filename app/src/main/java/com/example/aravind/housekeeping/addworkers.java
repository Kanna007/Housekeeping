package com.example.aravind.housekeeping;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class addworkers extends AppCompatActivity {

    private EditText medittext;
    private Button mbutton;
    private Firebase mRootref;
    private Button mbuttonshow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addworkers);

        mRootref = new Firebase("https://housekeeping-ff2f8.firebaseio.com/ADDWORKERS");
        medittext =(EditText) findViewById(R.id.editText);
        mbutton =(Button) findViewById(R.id.button6);
        mbuttonshow = (Button) findViewById(R.id.button10);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = medittext.getText().toString().trim();
                    mRootref.push().setValue(value);




            }
        });

        mbuttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(addworkers.this,workerslist.class);
                startActivity(intent);
            }
        });


    }

}
