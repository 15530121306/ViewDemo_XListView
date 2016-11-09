package bwie.shixinjie1107;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MyView mv = (MyView) findViewById(R.id.mv);
        mv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN){
                    //得到点击点的坐标
                    float x=event.getX();
                    float y=event.getY();
                    float radius=mv.getR();
                    //得到相对圆心的 x y的相对距离
                    float x2=Math.abs(x-radius);
                    float y2=Math.abs(y-radius);
                    //勾股定理计算点击的点与圆心的距离
                    double disstance=Math.sqrt(x2*x2+y2*y2);
                    //判断距离disstance小于半径，则在园内
                    if(disstance<radius){
                        startActivity(new Intent(MainActivity.this,ShouyeActivity.class));

//                        return true;
                    }
                }
                return false;
            }
        });
    }
}
