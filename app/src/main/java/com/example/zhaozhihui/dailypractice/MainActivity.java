package com.example.zhaozhihui.dailypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.BaseActivity;
import com.example.zhaozhihui.dailypractice.alxurl.AlxUrlActivity;
import com.example.zhaozhihui.dailypractice.updateversion.UpdateVersionActivity;
import com.example.zhaozhihui.dailypractice.view.constraint.ConstraintActivity;
import com.example.zhaozhihui.dailypractice.view.custom.DrawViewActivity;
import com.example.zhaozhihui.dailypractice.view.offical.FrameLayoutActivity;
import com.example.zhaozhihui.dailypractice.view.offical.GridLayoutActivity;
import com.example.zhaozhihui.dailypractice.view.offical.TableLayoutActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAlxUrl(View view) {
        AlxUrlActivity.start(this);
    }

    public void onDrawView(View view) {
        DrawViewActivity.start(this);
    }

    public void onOpenBase(View view) {
        BaseActivity.start(this);
    }

    public void onConstrintLayout(View view) {
        ConstraintActivity.start(this);
    }

    public void onUpdateVersion(View view) {
        UpdateVersionActivity.start(this);
    }

    public void onTablelayout(View view) {
        TableLayoutActivity.start(this);
    }

    public void onFrameLayout(View view) {
        FrameLayoutActivity.start(this);
    }

    public void onGridLayout(View view) {
        GridLayoutActivity.start(this);
    }
}