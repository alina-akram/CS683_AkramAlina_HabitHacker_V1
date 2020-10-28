package com.example.habithacker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayHabit extends AppCompatActivity {
    TextView viewHabitName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_habit);
        viewHabitName = findViewById(R.id.viewHabitName); //id in our xml layout
        viewHabitName.setText(addHabitActivity.habitName);


    }
}