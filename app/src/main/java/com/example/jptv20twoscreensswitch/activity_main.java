package com.example.jptv20twoscreensswitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Intent intent = new Intent(this, second_screen.class);
        button.setOnClickListener(v -> {
            startActivity(intent);
        });
    }
}