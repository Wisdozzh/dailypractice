package com.example.zhaozhihui.dailypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.BaseActivity;
import com.example.zhaozhihui.dailypractice.alxurl.AlxUrlActivity;
import com.example.zhaozhihui.dailypractice.camera.CameraActivity;
import com.example.zhaozhihui.dailypractice.configration.ConfigrationOrientationActivity;
import com.example.zhaozhihui.dailypractice.hencoder.customerview.CustomeView1Activity;
import com.example.zhaozhihui.dailypractice.highimitate.HighImitateViewActivity;
import com.example.zhaozhihui.dailypractice.updateversion.UpdateVersionActivity;
import com.example.zhaozhihui.dailypractice.view.constraint.ConstraintActivity;
import com.example.zhaozhihui.dailypractice.view.custom.DrawViewActivity;
import com.example.zhaozhihui.dailypractice.view.custom.PointViewActivity;
import com.example.zhaozhihui.dailypractice.view.custom.SwitchButtonActivity;
import com.example.zhaozhihui.dailypractice.view.offical.FrameLayoutActivity;
import com.example.zhaozhihui.dailypractice.view.offical.GridLayoutActivity;
import com.example.zhaozhihui.dailypractice.view.offical.OfficalViewActivity;
import com.example.zhaozhihui.dailypractice.view.offical.TableLayoutActivity;
import com.example.zhaozhihui.dailypractice.view.offical.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHenCoderPractice(View view) {
        CustomeView1Activity.start(this);
    }

    public void onAlxUrl(View view) {
        AlxUrlActivity.start(this);
    }

    public void onDrawView(View view) {
        DrawViewActivity.start(this);
    }

    public void onSwitchButton(View view) {
        SwitchButtonActivity.start(this);
    }

    public void onPointView(View view) {
        PointViewActivity.start(this);
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

    public void onTextView(View view) {
        TextViewActivity.start(this);
    }

    public void onOfficalView(View view) {
        OfficalViewActivity.start(this);
    }

    public void onConfigratationOrientation(View view) {
        ConfigrationOrientationActivity.start(this);
    }

    public void onHighImitateView(View view) {
        HighImitateViewActivity.start(this);
    }

    public void onCamera(View view) {
        CameraActivity.start(this);
    }
}
