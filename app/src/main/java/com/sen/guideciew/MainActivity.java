package com.sen.guideciew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  GuideView guideView1, guideView2, guideView3, guideView4, guideView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.post(new Runnable() {
            @Override
            public void run() {
                initGuide();
            }
        });
    }

    private void initGuide() {
        View inflate = View.inflate(this, R.layout.guideview, null);
         guideView1 = new GuideView.Builder(this)
                .setTargetView(R.id.tv1)
                .setHintView(inflate)
                .setHintViewDirection(GuideView.Direction.BOTTOM)
                .setmForm(GuideView.Form.REACTANGLE)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guideView1.hide();
                        guideView2.show();
                    }
                })
                .create();
        guideView1.show();
        guideView2 = new GuideView.Builder(this)
                .setTargetView(R.id.tv2)
                .setHintView(inflate)
                .setHintViewDirection(GuideView.Direction.BOTTOM)
                .setmForm(GuideView.Form.REACTANGLE)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guideView2.hide();
                        guideView3.show();
                    }
                })
                .create();
        guideView3 = new GuideView.Builder(this)
                .setTargetView(R.id.tv3)
                .setHintView(inflate)
                .setHintViewDirection(GuideView.Direction.BOTTOM)
                .setmForm(GuideView.Form.CIRCLE)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guideView3.hide();
                        guideView4.show();
                    }
                })
                .create();
        guideView4 = new GuideView.Builder(this)
                .setTargetView(R.id.tv4)
                .setHintView(inflate)
                .setHintViewDirection(GuideView.Direction.BOTTOM)
                .setmForm(GuideView.Form.ELLIPSE)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guideView4.hide();
                        guideView5.show();
                    }
                })
                .create();
        guideView5 = new GuideView.Builder(this)
                .setTargetView(R.id.tv5)
                .setHintView(inflate)
                .setHintViewDirection(GuideView.Direction.BOTTOM)
                .setmForm(GuideView.Form.ELLIPSE)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        guideView5.hide();
                    }
                })
                .create();


    }
}
