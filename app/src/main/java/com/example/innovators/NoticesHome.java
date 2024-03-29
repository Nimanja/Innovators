package com.example.innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NoticesHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notices_home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NoticesHomeFragment.newInstance())
                    .commitNow();
        }
    }
}
