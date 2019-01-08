package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //button 10 is skipped
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bMultiphy,bDivide,bEquals;
    ImageButton bBackspace;
    EditText tv1;
    boolean add,sub,div,multiply;
    float val1;
    float val2;
    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bPlus=(Button)findViewById(R.id.plus);
        bMinus=(Button)findViewById(R.id.substract);
        bMultiphy=(Button)findViewById(R.id.multiply);
        bDivide=(Button)findViewById(R.id.divide);
        bEquals=(Button)findViewById(R.id.equalsto);
        bBackspace=(ImageButton)findViewById(R.id.back);
        tv1=(EditText)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv1.setTextDirection(View.TEXT_DIRECTION_RTL);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tv1.setText(String.valueOf(tv1.getText())+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv1.setText(String.valueOf(tv1.getText())+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(String.valueOf(tv1.getText())+"0");
            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv1.setText(String.valueOf(tv1.getText())+"+");
                String check = tv1.getText().toString();
                if(check.length()>0){
                    if (tv1.getText()==null){
                        tv1.setText("");
                    }
                    else {
                        add=true;
                        val1 = Float.parseFloat(tv1.getText()+"");
                        tv1.setText(null);



                    }
                }


            }
        });
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv1.setText(String.valueOf(tv1.getText())+"-");
                String check = tv1.getText().toString();
                if(check.length()>0){
                    if (tv1.getText()==null){
                        tv1.setText("");
                    }
                    else {
                        sub=true;
                        val1 = Float.parseFloat(tv1.getText()+"");
                        tv1.setText(null);



                    }
                }

            }
        });
        bMultiphy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv1.setText(String.valueOf(tv1.getText())+"X");
                String check = tv1.getText().toString();
                if(check.length()>0){
                    if (tv1.getText()==null){
                        tv1.setText("");
                    }
                    else {
                        multiply=true;
                        val1 = Float.parseFloat(tv1.getText()+"");
                        tv1.setText(null);



                    }
                }

            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv1.setText(String.valueOf(tv1.getText())+"X");
                String check = tv1.getText().toString();
                if(check.length()>0){
                    if (tv1.getText()==null){
                        tv1.setText("");
                    }
                    else {
                        div=true;
                        val1 = Float.parseFloat(tv1.getText()+"");
                        tv1.setText(null);



                    }
                }

            }
        });
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = tv1.getText().toString();
                if(check.length()>0){
                    val2 = Float.parseFloat(tv1.getText()+"");

                    if(add==true) {
                        tv2.setText(val1+val2+ "");
                        add = false;
                    }
                    else if(sub==true) {
                        tv2.setText(val1-val2+ "");
                        sub = false;
                    }
                    else if(multiply==true) {
                        tv2.setText(val1*val2+ "");
                        multiply = false;
                    }
                    else if(div==true) {
                        tv2.setText(val1/ val2+ "");
                        div = false;
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Please Enter 2nd value", Toast.LENGTH_SHORT).show();
                    }

                    tv1.setText(null);
                }


            }
        });
        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = tv1.getText().toString();
                if(check.length()>0){
                    String h = check.toString().substring(0, check.length() - 1);
                    tv1.setText(h);
                }

            }
        });


    }


}
