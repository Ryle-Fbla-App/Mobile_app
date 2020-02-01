package com.example.howdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class officerActivity extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer);

        backButton = (ImageButton)findViewById(R.id.officerBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHubScreen(backButton);
            }
        });
    }

    public void openHubScreen(View v)
    {
        Intent intent = new Intent(officerActivity.this, mainHub.class);
        startActivity(intent);
    }
}
