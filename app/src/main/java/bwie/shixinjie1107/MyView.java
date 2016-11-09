package bwie.shixinjie1107;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Shixj on 2016/11/7.
 */
public class MyView extends View {

    private int width;
    private int height;
    private int r;
    private int mcolor;
    private Paint paint;
    private Rect rect;

    public int getR() {
        return r;
    }

    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        
//        paint=new Paint();
//
//        width=200;
//        height=200;
//        r=100;
//        rect=new Rect();
//        str="下一步";
//        paint.getTextBounds(str,0,str.length(),rect);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode=MeasureSpec.getMode(widthMeasureSpec);
        int widthSize=MeasureSpec.getSize(widthMeasureSpec);

        int width,height;
        if(widthMode==MeasureSpec.EXACTLY){
            width=widthSize;
            r=width/2;
        }else{
            width=100;
            r=width/2;
        }
        setMeasuredDimension(width,width);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint=new Paint();
        rect=new Rect();
        width=getWidth();
        height=getHeight();


        //圆
        paint.setColor(Color.BLUE);
        canvas.drawCircle(width/2,height/2,r,paint);

        //字
        paint.setColor(Color.BLACK);
        paint.setTextSize(17);
        String str="下一步";
        paint.getTextBounds(str,0,str.length(),rect);
        canvas.drawText(str,width/2-rect.width()/2,height/2+rect.height()/2,paint);

        super.onDraw(canvas);
    }
}
