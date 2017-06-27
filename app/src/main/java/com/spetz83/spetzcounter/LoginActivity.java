package com.spetz83.spetzcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.auth.FirebaseAuth;

import io.fabric.sdk.android.Fabric;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());

        mAuth = FirebaseAuth.getInstance();
        if(mAuth.getCurrentUser() != null) {
            Log.d("AUTH", "Already Logged In");
        } else {
            Log.d("AUTH", "Not Logged In");
        }

        setContentView(R.layout.activity_login);
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }

}
