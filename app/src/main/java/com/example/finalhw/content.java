package com.example.finalhw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Handler;

public class content extends AppCompatActivity {
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        SimpleDateFormat formatter = new SimpleDateFormat("MM月dd日");

        Date curDate = new Date(System.currentTimeMillis()) ; // 獲取當前時間

        String str = formatter.format(curDate);
        TextView textView = findViewById(R.id.tv_time);
        textView.setText("今天ㄉ日期\n"+str);



        Intent intentmember=getIntent();
        String H1=intentmember.getStringExtra("email");
        TextView t1=(TextView) findViewById(R.id.tv_loginnn);
        if(t1.getText() != "尚未登入ㄛ"){
            if(H1 !=null){
                t1.setText("您已登入"+H1);
            }
        }


    }

    public void btn_eatonclick(View view) {

        Intent intent = new Intent();
        intent.setClass(content.this,random.class);
        startActivity(intent);
        
    }


    public void btn_imgonclick(View view) {
        Intent intent = new Intent();
        intent.setClass(content.this, img.class);
        startActivity(intent);
    }

    public void btn_beiwangonclick(View view) {
        Intent intent = new Intent();
        intent.setClass(content.this, whatdo.class);
        startActivity(intent);
    }

    public void btn_memberonclick(View view) {
        Intent intent = new Intent();
        intent.setClass(content.this, member.class);
        startActivity(intent);
    }
}