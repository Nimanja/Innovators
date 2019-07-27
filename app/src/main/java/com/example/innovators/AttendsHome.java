package com.example.innovators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AttendsHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attends_home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AttendsHomeFragment.newInstance())
                    .commitNow();
        }
    }
}
