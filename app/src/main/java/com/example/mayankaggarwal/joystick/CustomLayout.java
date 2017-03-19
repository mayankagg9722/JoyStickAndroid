package com.example.mayankaggarwal.joystick;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by mayankaggarwal on 19/03/17.
 */

public class CustomLayout extends View {

    public Paint myLayout;

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
        myLayout=new Paint();
        myLayout.setColor(Color.parseColor("#523c87"));
        myLayout.setAntiAlias(true);
        myLayout.setStyle(Paint.Style.FILL);
//        Log.d("tagg", String.valueOf(canvas.getWidth()+" "+canvas.getHeight()));
        canvas.drawCircle(canvas.getWidth()-120, canvas.getHeight(), (canvas.getHeight()-70), myLayout);
    }
}
