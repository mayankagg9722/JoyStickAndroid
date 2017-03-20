package com.example.mayankaggarwal.joystick;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by mayankaggarwal on 19/03/17.
 */

public class CustomLayout extends View {

    public Paint myLayout;

    Paint paint;
    Path path;

    public CustomLayout(Context context) {
        super(context);

    }

    public CustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Log.d("tagg", String.valueOf(canvas.getWidth()+" "+canvas.getHeight()));
        myLayout=new Paint();
        myLayout.setColor(Color.parseColor("#8057e1"));
        myLayout.setAntiAlias(true);
        myLayout.setStyle(Paint.Style.FILL);

        paint = new Paint();

        paint.setStyle(Paint.Style.STROKE);
        path = new Path();

//**********############ NORMAL DRWAING #########*************************


//        canvas.drawCircle(canvas.getWidth()-120, canvas.getHeight(), (canvas.getHeight()-70), myLayout);
//        canvas.drawLine(0,400,canvas.getWidth(),200,myLayout);

//**********############ NORMAL DRWAING #########*************************


//**********############BEIZER CURVE#########*************************


//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.parseColor("#8057e1"));
//        path.moveTo(0,400);
//        path.quadTo(0,0,canvas.getWidth(),200);
//        canvas.drawPath(path, paint);

//**********############BEIZER CURVE#########*************************





//**********############ CUSTOM SHAPE #########*************************

        //custom drawing shape on canvas

        //give border color
        Paint mBoarderPaint = new Paint();
        mBoarderPaint.setAntiAlias(true);
        mBoarderPaint.setColor(Color.BLACK);
        mBoarderPaint.setStyle(Paint.Style.STROKE);
        mBoarderPaint.setStrokeWidth(6);

        //give inner shape color
        Paint mInnerPaint = new Paint();
        mInnerPaint.setAntiAlias(true);
        mInnerPaint.setColor(Color.parseColor("#8057e1"));
        mInnerPaint.setStyle(Paint.Style.FILL);
        mInnerPaint.setStrokeJoin(Paint.Join.ROUND);

        path.moveTo(0,0);
        path.lineTo(0, 400);
        path.lineTo(getWidth(),200);
        path.lineTo(getWidth(), 0);
        path.lineTo(0, 0);
        canvas.drawPath(path, mInnerPaint);


//**********############ CUSTOM SHAPE #########*************************




    }
}
