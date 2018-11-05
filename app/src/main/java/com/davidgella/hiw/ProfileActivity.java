package com.davidgella.hiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepage);
    }

    public void toLogIn (View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void toContribute1 (View v) {
        Intent i = new Intent(this,Contribute1Activity.class);
        startActivity(i);
    }
}
