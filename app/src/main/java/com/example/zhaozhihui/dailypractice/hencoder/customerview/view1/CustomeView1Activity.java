package com.example.zhaozhihui.dailypractice.hencoder.customerview.view1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.OnDrawPracticeActivity;

public class CustomeView1Activity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, CustomeView1Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_view1);
    }

    public void onBlogPractice(View view) {
        OnDrawPracticeActivity.start(this);
    }

    public void onPracticeDemo(View view) {
        PracticeDraw1Activity.start(this);
    }
}
