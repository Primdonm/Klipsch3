/*package com.example.klipschseapker;

import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.app.PendingIntent.getActivity;

public class Canvas extends View {

   // int mesLength=John.length;
    //static int mesWidth = John.width;


    //Variables
    Paint paint;
    Rect rect;
    public class John extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent variables = getIntent();
        int length = variables.getIntExtra("varLength", 0);
        int width = variables.getIntExtra("varWidth", 0);
    }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

       // setMeasuredDimension(mesWidth, mesLength);
    }

    public Canvas(Context context) {
        super(context);
        paint = new Paint();
        rect =new Rect();

    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas){
        super.onDraw(canvas);
        paint.setStrokeWidth(3);

        canvas.drawRect(0,0,canvas.getWidth(),canvas.getHeight(),paint);

    }


   /* private void init() {
        textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(textColor);
        if (textHeight == 0) {
            textHeight = textPaint.getTextSize();
        } else {
            textPaint.setTextSize(textHeight);
        }

        piePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        piePaint.setStyle(Paint.Style.FILL);
        piePaint.setTextSize(textHeight);

        shadowPaint = new Paint(0);
        shadowPaint.setColor(0xff101010);
        shadowPaint.setMaskFilter(new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL));
    }

}*/

