package com.example.zhaozhihui.dailypractice.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CameraActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, CameraActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_camera_surfaceview, R.id.tv_camera_textureview})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_camera_surfaceview:
                CameraSurfaceViewActivity.start(this);
                break;
            case R.id.tv_camera_textureview:
                CameraTextureViewActivity.start(this);
                break;
        }
    }
}
