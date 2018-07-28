package com.example.zhangxiangyu.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class Myprogress extends ProgressBar {
    public Myprogress(Context context) {
        super(context);
    }

    public Myprogress(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Myprogress(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        canvas.rotate(-90);
        canvas.translate(-getHeight(),0);
        canvas.restore();
        super.onDraw(canvas);
    }
}
