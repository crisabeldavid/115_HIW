package com.davidgella.hiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ForgotPWActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpwpage);
    }

    public void toLogIn (View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void toChangePW (View v) {
        Intent i = new Intent(this,ChangePWActivity.class);
        startActivity(i);
    }
}
