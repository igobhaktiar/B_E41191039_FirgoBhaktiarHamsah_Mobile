package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    private TextView txNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        txNama = findViewById(R.id.tx_nama);

        String username = getIntent().getStringExtra("username");
        txNama.setText("Hello, " + username + " !");
    }
}