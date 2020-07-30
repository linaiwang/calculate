package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView result;
    private String data="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initClickLister();

    }
    private void initClickLister(){
        TextView text_1=(TextView)findViewById(R.id.text_1);
        TextView text_2=(TextView)findViewById(R.id.text_2);
        TextView text_3=(TextView)findViewById(R.id.text_3);
        TextView text_4=(TextView)findViewById(R.id.text_4);
        TextView text_5=(TextView)findViewById(R.id.text_5);
        TextView text_6=(TextView)findViewById(R.id.text_6);
        TextView text_7=(TextView)findViewById(R.id.text_7);
        TextView text_8=(TextView)findViewById(R.id.text_8);
        TextView text_9=(TextView)findViewById(R.id.text_9);
        TextView text_0=(TextView)findViewById(R.id.text_0);

        text_1.setOnClickListener(this);
        text_2.setOnClickListener(this);
        text_3.setOnClickListener(this);
        text_4.setOnClickListener(this);
        text_5.setOnClickListener(this);
        text_6.setOnClickListener(this);
        text_7.setOnClickListener(this);
        text_8.setOnClickListener(this);
        text_9.setOnClickListener(this);
        text_0.setOnClickListener(this);
        result = (TextView)findViewById(R.id.result_text);
//        text_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                result.setText("1");
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text_0:
                String a0="0";
                data=data+a0;
                result.setText(data);
                break;
            case R.id.text_1:
                String a1="1";
                data=data+a1;
                result.setText(data);
                break;
            case R.id.text_2:
                String a2="2";
                data=data+a2;
                result.setText(data);
                break;
            case R.id.text_3:
                String a3="3";
                data=data+a3;
                result.setText(data);
                break;
            case R.id.text_4:
                String a4="4";
                data=data+a4;
                result.setText(data);
                break;
            case R.id.text_5:
                String a5="5";
                data=data+a5;
                result.setText(data);
                break;
            case R.id.text_6:
                String a6="6";
                data=data+a6;
                result.setText(data);
                break;
            case R.id.text_7:
                String a7="7";
                data=data+a7;
                result.setText(data);
                break;
            case R.id.text_8:
                String a8="8";
                data=data+a8;
                result.setText(data);
                break;
            case R.id.text_9:
                String a9="9";
                data=data+a9;
                result.setText(data);
                break;
            default:
                break;
        }
    }
}
