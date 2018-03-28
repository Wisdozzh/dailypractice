package com.example.zhaozhihui.dailypractice.hencoder.customerview.view4.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.location.LocationManager;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.zhaozhihui.dailypractice.R;


public class Practice10MatrixSkewView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);
    Point point3 = new Point(1000, 200);

    public Practice10MatrixSkewView(Context context) {
        super(context);
    }

    public Practice10MatrixSkewView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10MatrixSkewView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = new Matrix();
        int bitmapWidth = bitmap.getWidth();
        int bitmapHeight = bitmap.getHeight();

        canvas.save();
        matrix.reset();
        matrix.preSkew(0, 0.5f, point1.x + bitmapWidth / 2, point1.y + bitmapHeight / 2);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();

        canvas.save();
        matrix.reset();
        matrix.postSkew(-0.5f, 0, point2.x + bitmapWidth / 2, point2.y + bitmapHeight / 2);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();

        int left,top,right,bottom;
        left = point3.x;
        top = point3.y;
        right = point3.x + bitmapWidth;
        bottom = point3.y + bitmapHeight;
        float pointsSrc[] = {left, top, right, top, left, bottom, right, bottom};
        float pointsDst[] = {left - 10, top + 50, right + 120, top + 90, left + 20, bottom + 30, right + 150, bottom - 90};

        canvas.save();
        matrix.reset();
        matrix.setPolyToPoly(pointsSrc, 0, pointsDst, 0, 4);
        canvas.concat(matrix);
        canvas.drawBitmap(bitmap, point3.x, point3.y, paint);
        canvas.restore();
    }
}
