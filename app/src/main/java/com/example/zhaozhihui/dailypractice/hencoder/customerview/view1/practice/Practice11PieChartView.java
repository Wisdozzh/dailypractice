package com.example.zhaozhihui.dailypractice.hencoder.customerview.view1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        paint.setARGB(255, 238, 43, 41);
        canvas.drawArc(100, 100, 680, 680, 180, 135, true, paint);

        paint.setARGB(255, 253, 182, 13);
        canvas.drawArc(120, 120, 700, 700, -45, 45, true, paint);

        paint.setARGB(255, 136, 0, 160);
        canvas.drawArc(120, 120, 700, 700, 5, 10, true, paint);

        paint.setARGB(255, 140, 140, 140);
        canvas.drawArc(120, 120, 700, 700, 20, 10, true, paint);

        paint.setARGB(255, 17, 134, 117);
        canvas.drawArc(120, 120, 700, 700, 35, 45, true, paint);

        paint.setARGB(255, 30, 128, 240);
        canvas.drawArc(120, 120, 700, 700, 85, 95, true, paint);
    }
}
