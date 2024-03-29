package com.example.turisticheska_knizhka;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get the email from the intent
        Intent intent = getIntent();
        if (intent != null) {
            email = intent.getStringExtra("email");
        }

        // Find the TextView
        TextView textViewEmailValue = findViewById(R.id.textViewEmailValue);

        // Set the email to the TextView
        textViewEmailValue.setText(email);
    }
}
