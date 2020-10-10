package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;


public class paomadeng extends AppCompatActivity implements View.OnClickListener{

    private TextView paomadeng;
    private int ison=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paomadeng=findViewById(R.id.paomadeng);
        paomadeng.setOnClickListener(this);
        paomadeng.setSelected(true);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.paomadeng){
            if(ison==1){
                paomadeng.setSelected(false);

                ison=2;
            }else if(ison==2) {

                paomadeng.setSelected(true);

                ison=1;
            }
        }
    }
}