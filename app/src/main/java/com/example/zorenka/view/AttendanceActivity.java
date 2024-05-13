package com.example.zorenka.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.zorenka.R;
import com.example.zorenka.callback.AttendanceAllCallback;
import com.example.zorenka.server.HttpBuilder;
import com.example.zorenka.server.repository.AttendanceRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AttendanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        ListView list = findViewById(R.id.list);
        FloatingActionButton button = findViewById(R.id.navigate_add);

        HttpBuilder builder = new HttpBuilder();
        AttendanceRepository repository = builder.createRepository(AttendanceRepository.class);
        repository.getAll().enqueue(new AttendanceAllCallback(this, list));

        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, AddAttendanceActivity.class);
            startActivity(intent);
        });
    }
}