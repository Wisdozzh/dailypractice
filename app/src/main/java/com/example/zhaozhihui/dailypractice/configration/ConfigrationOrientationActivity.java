package com.example.zhaozhihui.dailypractice.configration;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhaozhihui.dailypractice.R;

public class ConfigrationOrientationActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ConfigrationOrientationActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configration_orientation);
        Button btnOrientationSwitcher = findViewById(R.id.btn_orientation_switcher);
        btnOrientationSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Configuration configuration = getResources().getConfiguration();
                //如果当前是横屏
                if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    //设置为竖屏
                    ConfigrationOrientationActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                }
                //如果当前是竖屏
                if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
                    //设置为竖屏
                    ConfigrationOrientationActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

                }
            }
        });
    }

    //重写该方法，用于监听设置的更改，主要是监控屏幕方向的更改

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        String screen = newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE ? "横向屏幕" : "竖向屏幕";
        Toast.makeText(this, "系统的屏幕方向发生改变" + "\n修改后的屏幕方向为：" + screen, Toast.LENGTH_LONG).show();
    }
}
