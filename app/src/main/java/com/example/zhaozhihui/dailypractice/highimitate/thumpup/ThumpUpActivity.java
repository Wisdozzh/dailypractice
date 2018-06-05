package com.example.zhaozhihui.dailypractice.highimitate.thumpup;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.highimitate.thumpup.change.ThumbUpView;
import com.example.zhaozhihui.dailypractice.highimitate.thumpup.change.ThumbView;

/**
 * 作者：ZZH
 * 时间：2018/6/4 13:47
 * 说明：这是放即刻app点赞效果的Demo
 */
public class ThumpUpActivity extends AppCompatActivity {
    private EditText edNum;
    private ThumbUpView thumbUpView;

    public static void start(Context context) {
        Intent starter = new Intent(context, ThumpUpActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thump_up);

        edNum = (EditText) findViewById(R.id.ed_num);
        thumbUpView = (ThumbUpView) findViewById(R.id.thumbUpView);

        thumbUpView.setThumbUpClickListener(new ThumbView.ThumbUpClickListener() {
            @Override
            public void thumbUpFinish() {
                Log.d("MainActivity", "New点赞成功");
                showToast("New点赞成功");
            }

            @Override
            public void thumbDownFinish() {
                Log.d("MainActivity", "New取消点赞成功");
                showToast("New取消点赞成功");
            }
        });
    }

    public void setNum(View v) {
        try {
            int num = Integer.valueOf(edNum.getText().toString().trim());
            thumbUpView.setCount(num).setThumbUp(false);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "只能输入整数", Toast.LENGTH_LONG).show();
        }
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
