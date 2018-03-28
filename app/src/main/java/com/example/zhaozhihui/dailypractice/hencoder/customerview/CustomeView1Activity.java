package com.example.zhaozhihui.dailypractice.hencoder.customerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.chengdazhi.StylerTestActivity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.view1.PracticeDraw1Activity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.view2.PracticeDraw2Activity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.view3.PracticeDraw3Activity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.view4.PracticeDraw4Activity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.view5.PracticeDraw5Activity;

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

    public void onStylerTest(View view) {
        StylerTestActivity.start(this);
    }

    public void onPracticeDemo1(View view) {
        PracticeDraw1Activity.start(this);
    }

    public void onPracticeDemo2(View view) {
        PracticeDraw2Activity.start(this);
    }

    public void onPracticeDemo3(View view) {
        PracticeDraw3Activity.start(this);
    }

    public void onPracticeDemo4(View view) {
        PracticeDraw4Activity.start(this);
    }

    public void onPracticeDemo5(View view) {
        PracticeDraw5Activity.start(this);
    }
}
