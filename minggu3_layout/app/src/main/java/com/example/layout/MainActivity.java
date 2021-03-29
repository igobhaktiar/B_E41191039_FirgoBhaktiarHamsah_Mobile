package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void linear(View view) {
        Intent intent = new Intent(MainActivity.this, Linear_layout.class);
        startActivity(intent);
    }

    public void relative(View view) {
        Intent intent = new Intent(MainActivity.this, relative_layout.class);
        startActivity(intent);
    }

    public void constraint(View view) {
        Intent intent = new Intent(MainActivity.this, Constraint_layout.class);
        startActivity(intent);
    }

    public void frame(View view) {
        Intent intent = new Intent(MainActivity.this, frame_layout.class);
        startActivity(intent);
    }

    public void table(View view) {
        Intent intent = new Intent(MainActivity.this, tabel_layout.class);
        startActivity(intent);
    }

    public void material(View view) {
        Intent intent = new Intent(MainActivity.this, material_layout.class);
        startActivity(intent);
    }

    public void scrollview(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollView.class);
        startActivity(intent);
    }

    public void scrollview_horizontal(View view) {
        Intent intent = new Intent(MainActivity.this, scrollview_horizontal.class);
        startActivity(intent);
    }
}