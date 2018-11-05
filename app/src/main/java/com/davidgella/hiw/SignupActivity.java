package com.davidgella.hiw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuppage);
    }

    public void toLogIn (View v) {
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
    }

    public void toThankYou (View v) {
        Intent i = new Intent(this,ThankYouActivity.class);
        startActivity(i);
    }
}
