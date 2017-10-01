package com.example.test.mydesignapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Hassam Ahmed on 10/1/2017.
 */

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }


    public void back(View view) {
        Intent myIntent = new Intent(Signup.this, MainActivity.class);
        Signup.this.startActivity(myIntent);
        overridePendingTransition( R.anim.slide_in_right, R.anim.slide_out_right );
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.slide_in_right, R.anim.slide_out_right );
    }
}
