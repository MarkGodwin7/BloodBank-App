package com.example.bba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegisttationActivity extends AppCompatActivity {

    private Button donorbutton , recipicentbutton;
    private TextView backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registtation);

        donorbutton = findViewById(R.id.donorbutton);
        recipicentbutton = findViewById(R.id.reciptbutton);
        backbutton = findViewById(R.id.backButton);

        donorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRegisttationActivity.this, DonorRegistrationActivity.class);
                startActivity(intent);
            }
        });

        recipicentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRegisttationActivity.this, RecipientRegistrationActivity.class);
                startActivity(intent);
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectRegisttationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}