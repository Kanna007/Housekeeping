package com.example.aravind.housekeeping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class addtask extends AppCompatActivity {

    private EditText medittext;
    private Button mbutton;
    private Firebase mRootref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        mRootref = new Firebase("https://housekeeping-ff2f8.firebaseio.com/ADDTASK");
        medittext =(EditText) findViewById(R.id.editText2);
        mbutton =(Button) findViewById(R.id.button7);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = medittext.getText().toString();
                mRootref.push().setValue(value);

            }
        });
    }
}
