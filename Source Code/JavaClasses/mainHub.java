package com.example.howdo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mainHub extends AppCompatActivity {

    private ImageButton homeButton, officerButton, activityButton, calendarButton, linkButton, licenseButton, eventButton, forumButton, attendanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hub);

        homeButton = (ImageButton)findViewById(R.id.home);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen(homeButton);
            }
        });
        officerButton = (ImageButton)findViewById(R.id.team);
        officerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOfficerScreen(officerButton);
            }
        });
        activityButton = (ImageButton) findViewById(R.id.activities);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder rejectBuilder = new AlertDialog.Builder(mainHub.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_reject, null);
                rejectBuilder.setView(view);
                AlertDialog dialog = rejectBuilder.create();
                dialog.show();
            }
        });
        calendarButton = (ImageButton)findViewById(R.id.calendar);
        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder rejectBuilder = new AlertDialog.Builder(mainHub.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_reject, null);
                rejectBuilder.setView(view);
                AlertDialog dialog = rejectBuilder.create();
                dialog.show();
            }
        });
        linkButton = (ImageButton) findViewById(R.id.link);
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLinkScreen(linkButton);
            }
        });
        licenseButton = (ImageButton)findViewById(R.id.license);
        licenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLicenseScreen(licenseButton);
            }
        });
        eventButton = (ImageButton)findViewById(R.id.events);
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEventScreen(eventButton);
            }
        });
        forumButton = (ImageButton)findViewById(R.id.forum);
        forumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder rejectBuilder = new AlertDialog.Builder(mainHub.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_reject, null);
                rejectBuilder.setView(view);
                AlertDialog dialog = rejectBuilder.create();
                dialog.show();
            }
        });
        attendanceButton = (ImageButton)findViewById(R.id.attendance);
        attendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder rejectBuilder = new AlertDialog.Builder(mainHub.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_reject, null);
                rejectBuilder.setView(view);
                AlertDialog dialog = rejectBuilder.create();
                dialog.show();
            }
        });
    }

    public void openHomeScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, homeActivity.class);
        startActivity(intent);
    }
    public void openOfficerScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, officerActivity.class);
        startActivity(intent);
    }
    public void openActivityScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, activityActivity.class);
        startActivity(intent);
    }
    public void openLinkScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, linkActivity.class);
        startActivity(intent);
    }
    public void openLicenseScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, licenseActivity.class);
        startActivity(intent);
    }
    /*public void openForumScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, forumActivity.class);
        startActivity(intent);
    }*/
    public void openEventScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, eventsActivity.class);
        startActivity(intent);
    }
    public void openCalendarScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, calendarActivity.class);
        startActivity(intent);
    }
    public void openAttendanceScreen(View v)
    {
        Intent intent = new Intent(mainHub.this, attendanceActivity.class);
        startActivity(intent);
    }
}
