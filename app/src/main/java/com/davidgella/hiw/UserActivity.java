package com.davidgella.hiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userpage);
    }

    public void toLogIn (View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void toProfile (View v) {
        Intent i = new Intent(this,ProfileActivity.class);
        startActivity(i);
    }

    public void toViewCard (View v) {
        Intent i = new Intent(this,ViewCardActivity.class);
        startActivity(i);
    }
}
