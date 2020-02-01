package com.example.howdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

public class licenseActivity extends AppCompatActivity {

    private ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);

        backButton = (ImageButton)findViewById(R.id.licenseBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHubScreen(backButton);
            }
        });
    }
    public void openHubScreen(View v)
    {
        Intent intent = new Intent(this, mainHub.class);
        startActivity(intent);
    }
}
