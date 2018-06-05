package com.example.zhaozhihui.dailypractice.highimitate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.highimitate.thumpup.ThumpUpActivity;

/**
 * 作者：ZZH
 * 时间：2018/6/4 13:39
 * 说明：一些高仿的View集合
 */
public class HighImitateViewActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, HighImitateViewActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_imitate_view);
    }

    public void onThumpUp(View view) {
        ThumpUpActivity.start(this);
    }
}
