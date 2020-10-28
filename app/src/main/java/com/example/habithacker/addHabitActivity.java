package com.example.habithacker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class addHabitActivity extends AppCompatActivity {
    public static EditText editHabitName;
    public static String habitName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_habit);
        editHabitName = (EditText) findViewById(R.id.habitName);

    }

    public void submitButton(View view){ //view param to view in design mode imp!/other functions always public void
        habitName = editHabitName.getText().toString(); //calling get text function of the edit habit name variable (notstring), type : EditText
        System.out.println(habitName);
        Intent intent = new Intent(this, DisplayHabit.class);
        startActivity(intent);
    }
}