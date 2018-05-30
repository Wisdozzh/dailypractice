package com.example.zhaozhihui.dailypractice.camera;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.TextureView;

import com.example.zhaozhihui.dailypractice.R;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class CameraTextureViewActivity extends AppCompatActivity implements TextureView.SurfaceTextureListener {

    @BindView(R.id.textureview)
    TextureView textureview;

    public Camera camera;

    public static void start(Context context) {
        Intent intent = new Intent(context, CameraTextureViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_texture_view);
        ButterKnife.bind(this);
        textureview.setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        try {
            camera = Camera.open(0);
            camera.setDisplayOrientation(90);
            camera.setPreviewTexture(textureview.getSurfaceTexture());
            camera.startPreview();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        if (null != camera) {
            camera.stopPreview();
            camera.release();
            camera = null;
        }
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    @OnClick(R.id.btn_change)
    public void onViewClicked() {
        PropertyValuesHolder valuesHolder = PropertyValuesHolder.ofFloat("translationX", 0.0f, 0.0f);
        PropertyValuesHolder valuesHolder1 = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.3f, 1.0f);
        PropertyValuesHolder valuesHolder2 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.3f, 1.0f);
        PropertyValuesHolder valuesHolder3 = PropertyValuesHolder.ofFloat("rotationX", 0.0f, 2 * 360.0f, 0.0f);
        PropertyValuesHolder valuesHolder4 = PropertyValuesHolder.ofFloat("rotationY", 0.0f, 2 * 360.0f, 0.0f);
        PropertyValuesHolder valuesHolder5 = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.7f, 1.0f);
        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(textureview, valuesHolder,valuesHolder1,valuesHolder2,valuesHolder3,valuesHolder4,valuesHolder5);
        objectAnimator.setDuration(5000).start();
    }
}
