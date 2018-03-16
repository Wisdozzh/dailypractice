package com.example.zhaozhihui.dailypractice.hencoder.customerview.view1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setARGB(255,221,221,221);
        paint.setStrokeWidth(4);

        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100,600,1000,600,paint);

        paint.setTextSize(40);
        canvas.drawText("Froyo",120,650,paint);
        canvas.drawText("GB",270,650,paint);
        canvas.drawText("ICS",390,650,paint);
        canvas.drawText("JB",500,650,paint);
        canvas.drawText("KitKat",600,650,paint);
        canvas.drawText("L",770,650,paint);
        canvas.drawText("M ",890,650,paint);

        paint.setARGB(255,98,175,18);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        canvas.drawRect(120,594,220,600,paint);
        canvas.drawRect(240,580,340,600,paint);
        canvas.drawRect(360,580,460,600,paint);
        canvas.drawRect(480,400,580,600,paint);
        canvas.drawRect(600,240,700,600,paint);
        canvas.drawRect(720,175,820,600,paint);
        canvas.drawRect(840,420,940,600,paint);

    }
}
