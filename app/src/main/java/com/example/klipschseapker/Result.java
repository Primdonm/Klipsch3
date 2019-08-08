package com.example.klipschseapker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.drawable.shapes.RectShape;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Pulling variables from main activity
        Intent variables = getIntent();
        final int length = variables.getIntExtra("varLength",0);
        final int width =variables.getIntExtra("varWidth",0);
        int totalResult = variables.getIntExtra("varResult",0);

        //showing total
        String result = String.valueOf(totalResult);
        tim = findViewById(R.id.txtResult);
        tim.setText(result);


        //Calling the reset button method
        configureResetBtn();

        //todo check into zoom/pinch feature for surface view.
        SurfaceView surfaceView = findViewById(R.id.surface_view);
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {

                Canvas canvas = holder.lockCanvas();
                // draw
                Paint paint = new Paint();
                paint.setStrokeWidth(5);
                //todo test with length and width variables.
                canvas.drawRect(0, 0, length * 10, width *10, paint);
                //testing with length/width results in 2 squares.
                //with the black square representing user input.


                holder.unlockCanvasAndPost(canvas);
            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            }
        });

    }
    //Sends user back to main activity
    public void configureResetBtn(){
    Button btnReset=findViewById(R.id.btnReset2);
    btnReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //startActivity(new Intent(Result.this, MainActivity.class));
            finish();
        }
    });
    }
}
