package com.example.zhaozhihui.dailypractice.hencoder.customerview.view3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice09SetTextScaleXView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice09SetTextScaleXView(Context context) {
        super(context);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        // 使用 Paint.setTextScaleX() 来改变文字宽度
        paint.setTextScaleX(1.2f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text, 50, 100, paint);
        paint.setFontFeatureSettings("smcp");
        canvas.translate(0,100);
        canvas.drawText(text, 50, 100, paint);
        canvas.translate(0,100);
        canvas.drawText(text, 50, 100, paint);

        Rect bounds = new Rect();
        paint.getTextBounds(text,0,text.length(),bounds);
        bounds.left += 50;
        bounds.top += 100;
        bounds.right += 50;
        bounds.bottom += 100;
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(bounds,paint);
    }
}