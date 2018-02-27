package com.example.zhaozhihui.dailypractice.view.custom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;

public class SwitchButtonActivity extends AppCompatActivity {

    private SwitchButton switchButton;
    private SwitchButton.OnChangedListener onchangeListener;
    private boolean isChecked = true;

    public static void start(Context context) {
        Intent intent = new Intent(context, SwitchButtonActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);
        switchButton = findViewById(R.id.setting_item_toggle);
        switchButton.setCheck(isChecked);
        onchangeListener = new SwitchButton.OnChangedListener() {
            @Override
            public void OnChanged(View v, boolean checkState) {
//                switchChangeListener.onSwitchChange(item, checkState);
                Log.e("Wisdozzh", "isChecked = " + isChecked);
                switchButton.setCheck(checkState);
            }
        };
        switchButton.setOnChangedListener(onchangeListener);

    }
}
