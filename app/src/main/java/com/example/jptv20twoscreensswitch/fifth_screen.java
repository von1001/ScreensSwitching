package com.example.jptv20twoscreensswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class fifth_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);
        Button button = (Button) findViewById(R.id.button5);
        Intent intent = new Intent(this, activity_main.class);
        button.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}