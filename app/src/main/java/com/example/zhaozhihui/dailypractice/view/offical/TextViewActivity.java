package com.example.zhaozhihui.dailypractice.view.offical;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaozhihui.dailypractice.R;

public class TextViewActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, TextViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
    }
}
