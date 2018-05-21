package com.cdh.githubdemolibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class QuanquanView extends View {

    private Paint mPaint;

    public QuanquanView(Context context) {
        this(context, null);
    }

    public QuanquanView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public QuanquanView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(100, 100, 100, mPaint); // 画圆圈
    }
}
