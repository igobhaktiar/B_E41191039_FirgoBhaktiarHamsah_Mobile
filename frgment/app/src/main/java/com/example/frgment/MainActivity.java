package com.example.frgment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnFragmentPertama;
    private Button btnFragmentKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pemanggilan object button
        btnFragmentPertama = findViewById(R.id.btn_fragment_1);
        btnFragmentKedua = findViewById(R.id.btn_fragment_2);

        //fungsi onClick pada button
        btnFragmentPertama.setOnClickListener(v -> loadFragment(new fragment_pertama()));
        btnFragmentKedua.setOnClickListener(v -> loadFragment(new fragment_kedua()));

    }


    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (fragment != null) {
            transaction.replace(R.id.frame_layout, fragment);
            transaction.commit();
        }
    }
}