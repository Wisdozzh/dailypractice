package com.example.zhaozhihui.dailypractice.hencoder.customerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaozhihui.dailypractice.R;
/**
 * 作者：ZZH
 * 时间：2018/6/4 13:35
 * 说明：
 */
public class OnDrawPracticeActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, OnDrawPracticeActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_draw_practice);
    }
}
