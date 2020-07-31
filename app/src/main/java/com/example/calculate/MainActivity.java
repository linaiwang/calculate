package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView result;
    double var1,var2;
    boolean add,sub,mul,div;
    String s;


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
        TextView text_c=(TextView)findViewById(R.id.text_clear);
        TextView text_add=(TextView)findViewById(R.id.text_add);
        TextView text_minus=(TextView)findViewById(R.id.text_minus);
        TextView text_multiply=(TextView)findViewById(R.id.text_multiply);
        TextView text_divide=(TextView)findViewById(R.id.text_divide);
        TextView text_dot=(TextView)findViewById(R.id.text_dot);
        TextView text_equal=(TextView)findViewById(R.id.equal);
        TextView text_back=(TextView)findViewById(R.id.text_backspace);

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
        text_c.setOnClickListener(this);
        text_dot.setOnClickListener(this);
        text_add.setOnClickListener(this);
        text_divide.setOnClickListener(this);
        text_equal.setOnClickListener(this);
        text_minus.setOnClickListener(this);
        text_multiply.setOnClickListener(this);
        text_back.setOnClickListener(this);
        result = (TextView)findViewById(R.id.result_text);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text_0:
                result.setText(result.getText()+"0");
                break;
            case R.id.text_1:
                result.setText(result.getText()+"1");
                break;
            case R.id.text_2:
                result.setText(result.getText()+"2");
                break;
            case R.id.text_3:
                result.setText(result.getText()+"3");
                break;
            case R.id.text_4:
                result.setText(result.getText()+"4");
                break;
            case R.id.text_5:
                result.setText(result.getText()+"5");
                break;
            case R.id.text_6:
                result.setText(result.getText()+"6");
                break;
            case R.id.text_7:
                result.setText(result.getText()+"7");
                break;
            case R.id.text_8:
                result.setText(result.getText()+"8");
                break;
            case R.id.text_9:
                result.setText(result.getText()+"9");
                break;
            case R.id.text_clear:
                result.setText("");
                var1=0;
                var2=0;
                add=false;
                sub=false;
                mul=false;
                div=false;
                break;
            case R.id.text_dot:
                result.setText(result.getText()+".");
                break;
            case R.id.text_divide:
                var1=Double.parseDouble(result.getText()+"");
                div=true;
                result.setText(null);
                break;
            case R.id.text_add:
                var1=Double.parseDouble(result.getText()+"");
                add=true;
                result.setText(null);
                break;
            case R.id.text_minus:
                var1=Double.parseDouble(result.getText()+"");
                sub=true;
                result.setText(null);
                break;
            case R.id.text_multiply:
                var1=Double.parseDouble(result.getText()+"");
                mul=true;
                result.setText(null);
                break;
            case R.id.equal:
                var2=Double.parseDouble(result.getText()+"");
                if (add==true){
                    result.setText(var1+var2+"");
                    add=false;
                }
                if (sub==true){
                    result.setText(var1-var2+"");
                    sub=false;
                }
                if (mul==true){
                    result.setText(var1*var2+"");
                    mul=false;
                }
                if (div==true){
                    result.setText(var1/var2+"");
                    div=false;
                }
                break;
            case R.id.text_backspace:
                s=result.getText()+"";
                s=s.substring(0,s.length()-1);
                result.setText(s);
                break;
            default:
                break;
        }
    }
}
