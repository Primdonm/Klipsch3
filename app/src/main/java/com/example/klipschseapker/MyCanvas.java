/*package com.example.klipschseapker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MyCanvas extends AppCompatActivity {


    public MyCanvas(Result result) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent variables = getIntent();
        final int length = variables.getIntExtra("varLength", 0);
        final int width = variables.getIntExtra("varWidth", 0);


         class Jim extends View {

            Paint paint = new Paint();
            Rect rect = new Rect();

            public Jim(Context context) {
                super(context);
            }

            @Override
            protected void onDraw(android.graphics.Canvas canvas) {
                super.onDraw(canvas);
                paint.setStrokeWidth(3);

                canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
            }

            @Override
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);

                setMeasuredDimension(length,width);
            }
        }
    }
}
*/