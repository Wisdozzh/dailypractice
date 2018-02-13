package com.example.zhaozhihui.dailypractice.view.custom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.zhaozhihui.dailypractice.R;

public class DrawViewActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, DrawViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deaw_view);
        LinearLayout ll = findViewById(R.id.ll_root);
        final DrawView drawView = new DrawView(this);
        drawView.setMinimumHeight(500);
        drawView.setMinimumWidth(300);
        ll.addView(drawView);
    }
}
