package com.example.zhaozhihui.dailypractice.view.offical.ui;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.zhaozhihui.dailypractice.R;

public class ToggleButtonActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private CalendarView calendarView;

    public static void start(Context context) {
        Intent intent = new Intent(context, ToggleButtonActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                toggleButton.setChecked(isChecked);
            }
        });

        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(ToggleButtonActivity.this, "您的生日是"+year+"年"+month+"月"+dayOfMonth+"日",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
