package com.example.cveti;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Nachalo extends AppCompatActivity {
    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okno);
        mbutton = findViewById(R.id.button2);
        mbutton.setOnClickListener(v -> {
            Intent nov = new Intent(this, MainActivity.class);
            startActivity(nov);
            finish();
        });
    }
}