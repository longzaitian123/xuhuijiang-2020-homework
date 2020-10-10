package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.util.DateUtil;

import java.util.Date;


public  class ltsxg extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{

    private TextView  ptwb;
    private TextView  ltswb;


    private String[] mChatStr={"你在干嘛","我在吃炸鸡","那你在干嘛","我在睡觉","晚上干什么",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltsxg);

        ptwb=findViewById(R.id.ptwb);
        ptwb.setOnClickListener(this);
        ptwb.setOnLongClickListener(this);

        ltswb=findViewById(R.id.ltswb);
        ltswb.setOnClickListener(this);
        ltswb.setOnLongClickListener(this);
        //设置ltswb文本的移动方式为滚动形式
        ltswb.setMovementMethod(new ScrollingMovementMethod());
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ptwb||v.getId()==R.id.ltswb){
            //生成0到4的随机数字
            int random=(int)(Math.random()*10)%5;
            //拼接聊天内容
            String newStr=String.format("%s\n%s %s",ltswb.getText().toString(), DateUtil.getNowTime(),mChatStr[random]);
            //设置ltswb文本内容
            ltswb.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if(v.getId()==R.id.ptwb||v.getId()==R.id.ltswb){
            ltswb.setText("");
        }
        return true;
    }
}