package com.example.howdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityActivity extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        backButton = (Button)findViewById(R.id.activityBack);

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
