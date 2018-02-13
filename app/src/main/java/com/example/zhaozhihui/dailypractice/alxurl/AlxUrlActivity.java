package com.example.zhaozhihui.dailypractice.alxurl;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaozhihui.dailypractice.R;

public class AlxUrlActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, AlxUrlActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alx_url);

        String content = "想知道印尼好吃的餐馆都在哪么，看看<a href=\"http://www.qraved.com\">Qraved!</a>你就知道啦,this is a good place to eat dinner with friend，也可以去<a href=\"http://www.baidu.com\">百度</a>获取最新相关资讯";
        String content2 = "我们为您推荐了以下资源:\n<a href=\"aiyi://client/nativePage/teachingDetail?id=1021\" >执业医师骨科讲解</a>\n<a href=\"aiyi://client/nativePage/teachingDetail?id=1195\" >骨科</a>\n<a href=\"aiyi://client/nativePage/teachingDetail?id=1199\" >骨科经典病例</a>\n";
        AlxUrlTextView textView = (AlxUrlTextView) findViewById(R.id.tv_url);
        textView.setText("想知道印尼好吃的餐馆都在哪么，看看<a href=\"http://www.qraved.com\">Qraved!</a>你就知道啦,this is a good place to eat dinner with friend，也可以去<a href=\"http://www.baidu.com\">百度</a>获取最新相关资讯");
        textView.setText(content);
        AlxUrlTextView textView2 = (AlxUrlTextView) findViewById(R.id.tv_url2);
        textView2.setText(content2);
    }
}
