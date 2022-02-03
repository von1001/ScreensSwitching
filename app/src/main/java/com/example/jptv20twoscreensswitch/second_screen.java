package com.example.jptv20twoscreensswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class second_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        Button button = (Button) findViewById(R.id.button2);
        Intent intent = new Intent(this, third_screen.class);
        button.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}