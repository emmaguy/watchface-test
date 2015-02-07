package com.emmaguy.timeless;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.ustwo.clockwise.WatchFace;

/**
 * Created by emma on 07/02/15.
 */
public class TimelessWatchFace extends WatchFace {
    private static final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    @Override
    public void onCreate() {
        super.onCreate();

        mPaint.setTextSize(30);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(getResources().getColor(android.R.color.holo_red_light));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawText("emma is awesome", 10, 100, mPaint);
    }
}
