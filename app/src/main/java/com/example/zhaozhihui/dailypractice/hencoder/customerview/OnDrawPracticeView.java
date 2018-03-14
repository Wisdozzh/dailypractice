package com.example.zhaozhihui.dailypractice.hencoder.customerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaozhihui on 2018/3/2.
 */

public class OnDrawPracticeView extends View {

    private Paint paint = new Paint();

    public OnDrawPracticeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        paint.setColor(Color.BLACK);
//        paint.setStyle();
//        paint.setColor();
//        paint.setStrokeWidth();
//        paint.setTextSize();
//        paint.setAntiAlias();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawCircle(300, 300, 200, paint);
//        canvas.drawColor(Color.BLACK);
//        canvas.drawColor(Color.parseColor("#88880000"));


//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint);//绘制扇形
//        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint);//绘制弧形
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint);//绘制不封口的弧形


//        Path path = new Path();
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(20);
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//        path.lineTo(100, 100);
//        path.rLineTo(100, 0);
//        canvas.drawPath(path, paint);

//        Path path = new Path();
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(20);
//        path.lineTo(100, 100);
//        path.moveTo(200,100);
//        path.lineTo(200, 0);
//        canvas.drawPath(path,paint);

//        Path path = new Path();
//        paint.setStyle(Paint.Style.FILL);
//        path.moveTo(100 ,100);
//        path.lineTo(200, 100);
//        path.lineTo(150,150);
//        canvas.drawPath(path,paint);

        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
//        path.addCircle(200,200,150, Path.Direction.CW);
//        path.addCircle(400,200,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(700,200,150, Path.Direction.CW);
//        path.addCircle(700,200,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(200,500,150, Path.Direction.CCW);
//        path.addCircle(400,500,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(700,500,150, Path.Direction.CCW);
//        path.addCircle(700,500,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(200,800,150, Path.Direction.CW);
//        path.addCircle(400,800,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.EVEN_ODD);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(700,800,150, Path.Direction.CW);
//        path.addCircle(700,800,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.EVEN_ODD);
//        canvas.drawPath(path, paint);

        ///////////////////////INVERSE//////////////////////////
//        path.addCircle(200,200,150, Path.Direction.CW);
//        path.addCircle(400,200,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_WINDING);
//        canvas.drawPath(path, paint);

//        path.addCircle(700,200,150, Path.Direction.CW);
//        path.addCircle(700,200,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(200,500,150, Path.Direction.CCW);
//        path.addCircle(400,500,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(700,500,150, Path.Direction.CCW);
//        path.addCircle(700,500,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_WINDING);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(200,800,150, Path.Direction.CW);
//        path.addCircle(400,800,150, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
//        canvas.drawPath(path, paint);
//
//        path.addCircle(700,800,150, Path.Direction.CW);
//        path.addCircle(700,800,50, Path.Direction.CCW);
//        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
//        canvas.drawPath(path, paint);

//        canvas.drawBitmapMesh();

        paint.setTextSize(84);
        canvas.drawText("Hello Wisdozzh", 200, 100, paint);
    }
}
