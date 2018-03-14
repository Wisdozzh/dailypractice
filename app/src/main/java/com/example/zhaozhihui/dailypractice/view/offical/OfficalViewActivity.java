package com.example.zhaozhihui.dailypractice.view.offical;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.zhaozhihui.dailypractice.R;
import com.example.zhaozhihui.dailypractice.view.offical.ui.ToggleButtonActivity;

public class OfficalViewActivity extends AppCompatActivity {

    /*
    定义数组来表示listView要显示，也是我们学习哪些常用的控件
     */
    private static final String[] commonFunList = new String[]{

            "ListView控件演示",
            "ProgressBar控件演示",
            "GridView控件演示",
            "ScrollView控件演示",
            "DatePicker控件演示"
    };

    public static void start(Context context) {
        Intent intent = new Intent(context, OfficalViewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offical_view);
        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                commonFunList));
    }

    public void onToggleButton(View view) {
        ToggleButtonActivity.start(this);
    }
}
