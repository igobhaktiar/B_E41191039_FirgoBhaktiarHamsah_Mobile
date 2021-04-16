package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername;
    private Button btnPindahActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindahActivity = findViewById(R.id.btn_pindah_activity);
        edtUsername = findViewById(R.id.edt_username);
        btnPindahActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString();
                if (username.isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkan Nama anda !", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }
            }
        });
    }
}