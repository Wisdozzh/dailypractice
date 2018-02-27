package com.example.zhaozhihui.dailypractice.view.offical;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.view.offical.ui.ToggleButtonActivity;

public class OfficalViewActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, OfficalViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offical_view);
    }

    public void onToggleButton(View view) {
        ToggleButtonActivity.start(this);
    }
}
