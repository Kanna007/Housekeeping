package com.example.aravind.housekeeping;

import android.app.Application;
import android.content.Intent;
import android.view.View;

import com.firebase.client.Firebase;


public class db extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);


    }


}
