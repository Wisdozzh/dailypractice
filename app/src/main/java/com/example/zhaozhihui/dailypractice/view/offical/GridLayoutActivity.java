package com.example.zhaozhihui.dailypractice.view.offical;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.zhaozhihui.dailypractice.R;

public class GridLayoutActivity extends AppCompatActivity {

    GridLayout gridLayout;
    //定义16个按钮的文本
    String[] chars = new String[]{
            "7", "8", "9", "➗",
            "4", "5", "6", "✖️",
            "1", "2", "3", "➖",
            ".", "0", "=", "+"
    };

    public static void start(Context context) {
        Intent intent = new Intent(context, GridLayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridLayout = findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++) {
            Button button = new Button(this);
            button.setText(chars[i]);
            button.setTextSize(40);
            button.setPadding(25, 100, 25, 100);
            //指定该组件坐在的行
            GridLayout.Spec rowSpec = GridLayout.spec(i / 4 + 2);
            //指定该组件所在的列
            GridLayout.Spec columnSpec = GridLayout.spec(i % 4);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, columnSpec);
            //指定该组件占满父容器
            params.setGravity(Gravity.FILL);

            gridLayout.addView(button, params);
        }
    }
}
