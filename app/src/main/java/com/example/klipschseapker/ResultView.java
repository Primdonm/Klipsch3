/*package com.example.klipschseapker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

public class ResultView extends View {
    Paint paint;
    public ResultView(Context context) {
        super(context);
        SurfaceView surfaceView = findViewById(R.id.surface_view);

        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {

                Canvas canvas = holder.lockCanvas();
                // draw
                paint.setStrokeWidth(3);
                canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);

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
}
*/