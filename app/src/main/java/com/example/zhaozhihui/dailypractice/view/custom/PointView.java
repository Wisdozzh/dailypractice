package com.example.zhaozhihui.dailypractice.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by heming on 2018/1/18.
 */

public class PointView extends View {

    private Paint paint;

    public PointView(Context context) {
        super(context);
        init();
    }

    public PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(10);
    }

    ;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /****************************************************/
        /// canvas.drawCircle(100,100,50,paint); //圆形
        /****************************************************/
       /* RectF rectf = new RectF(0, 0, 500, 500);//绘制弧线区域
        canvas.drawArc(rectf,
                90,  //开始角度
                120, //扫过的角度
                true,//是否使用中心
                paint);*/
        /****************************************************/
        //canvas.drawColor(Color.GREEN);//直接给view添色
        /****************************************************/
       // canvas.drawLine(20,20,150,200,paint);//直线

        /****************************************************/
        //RectF rectF=new RectF(50,50,500,400); //椭圆或矩形,根据 位置而定
       // canvas.drawOval(rectF,paint);
        /****************************************************/
        //按照既定点 绘制文本内容
     /*   paint.setTextSize(50);
        canvas.drawPosText("Android777", new float[]{
                100,100, //第一个字母在坐标10,10
                200,200, //第二个字母在坐标20,20
                300,300,
                400,400,
                500,500,
                600,600,
                700,700,
                800,800,
                900,900,
                1000,1000
        }, paint);*/
        /****************************************************/

        /*RectF rect = new RectF(50, 50, 200, 200); //4周圆角

        canvas.drawRoundRect(rect,
                30, //x轴的半径
                30, //y轴的半径
                paint);*/
        /****************************************************/
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        canvas.translate(canvas.getWidth()/2, 200); //将位置移动画纸的坐标点:150,150
        canvas.drawCircle(0, 0, 100, paint); //画圆圈

        //使用path绘制路径文字
        canvas.save();
        canvas.translate(-75, -75);
        Path path = new Path();
        path.addArc(new RectF(0,0,150,150), -180, 180);
        Paint citePaint = new Paint(paint);
        citePaint.setTextSize(14);
        citePaint.setStrokeWidth(1);
        canvas.drawTextOnPath("http://www.android.com", path, 28, 0, citePaint);
        canvas.restore();

        Paint tmpPaint = new Paint(paint); //小刻度画笔对象
        tmpPaint.setStrokeWidth(1);

        float  y=100;
        int count = 60; //总刻度数

        for(int i=0 ; i <count ; i++){
            if(i%5 == 0){
                canvas.drawLine(0f, y, 0, y+12f, paint);
                canvas.drawText(String.valueOf(i/5+1), -4f, y+25f, tmpPaint);

            }else{
                canvas.drawLine(0f, y, 0f, y +5f, tmpPaint);
            }
            canvas.rotate(360/count,0f,0f); //旋转画纸
        }

        //绘制指针
        tmpPaint.setColor(Color.GRAY);
        tmpPaint.setStrokeWidth(4);
        canvas.drawCircle(0, 0, 7, tmpPaint);
        tmpPaint.setStyle(Paint.Style.FILL);
        tmpPaint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 5, tmpPaint);
        canvas.drawLine(0, 10, 0, -65, paint);


    }
}
