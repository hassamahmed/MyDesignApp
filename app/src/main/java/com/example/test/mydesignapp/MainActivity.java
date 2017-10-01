package com.example.test.mydesignapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        Intent myIntent = new Intent(MainActivity.this, Signup.class);
        MainActivity.this.startActivity(myIntent);
        overridePendingTransition( android.R.anim.slide_in_left, android.R.anim.slide_out_right );
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( android.R.anim.slide_in_left, android.R.anim.slide_out_right );
    }
}
