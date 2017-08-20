package com.libraryprojects.circularviewandroid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by anand-trisys on 20/8/17.
 */

public class MyCirccularView extends View
{
   private Paint paint=new Paint();
   private float centrex,centrey,radius;

    public MyCirccularView(Context context) {
        super(context);
    }

    public MyCirccularView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a=context.getTheme().obtainStyledAttributes(attrs,R.styleable.CircularView,0,0);
        try{
            centrex=a.getFloat(R.styleable.CircularView_centerX,0);
            centrey=a.getFloat(R.styleable.CircularView_centerY,0);
            radius=a.getFloat(R.styleable.CircularView_radius,0);
        }
        finally{
            a.recycle();
        }
    }

    public MyCirccularView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setStrokeWidth(10);//border width
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(centrex,centrey,radius,paint);
        super.onDraw(canvas);
    }
}
