package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

public class Scientific extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus,bMultiphy,bDivide,bEquals,bsultai,bssin,bscos,bstan,bsln,bslog,bsultav,bsopen,bsdot,bsclose,bsroot,bse,bsclear;
    ImageButton bBackspace,sclear;
    EditText tv1;
    boolean add,sub,div,multiply,ultai,sin,cos,tan,ln,log,ultav,popen,pclose,root,e;
    float val1;
    float val2;
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);
        b1=(Button)findViewById(R.id.sone);
        b2=(Button)findViewById(R.id.stwo);
        b3=(Button)findViewById(R.id.sthree);
        b4=(Button)findViewById(R.id.sfour);
        b5=(Button)findViewById(R.id.sfive);
        b6=(Button)findViewById(R.id.ssix);
        b7=(Button)findViewById(R.id.sseven);
        b8=(Button)findViewById(R.id.seight);
        b9=(Button)findViewById(R.id.snine);
        b0=(Button)findViewById(R.id.szero);
        bPlus=(Button)findViewById(R.id.splus);
        bMinus=(Button)findViewById(R.id.sminus);
        bMultiphy=(Button)findViewById(R.id.smul);
        bDivide=(Button)findViewById(R.id.sdiv);
        bEquals=(Button)findViewById(R.id.sequal);
        bsultai=(Button)findViewById(R.id.sultai);
        bssin=(Button)findViewById(R.id.ssin);
        bscos=(Button)findViewById(R.id.scos);
        bstan=(Button)findViewById(R.id.stan);
        bsln=(Button)findViewById(R.id.sln);
        bslog=(Button)findViewById(R.id.slog);
        bsultav=(Button)findViewById(R.id.sultav);
        bsopen=(Button)findViewById(R.id.sopen);
        bsdot=(Button)findViewById(R.id.sdot);
        bsclose=(Button)findViewById(R.id.sclose);
        bsroot=(Button)findViewById(R.id.sroot);
        bse=(Button)findViewById(R.id.se);
        bsclear=(Button)findViewById(R.id.sclear);
        bBackspace=(ImageButton)findViewById(R.id.sback);
        tv1=(EditText)findViewById(R.id.stv1);
        tv2=(TextView)findViewById(R.id.stv2);
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
        bssin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tv1.setText(String.valueOf(tv1.getText())+"+");
                String check = tv1.getText().toString();
                if(check.length()>0){
                    if (tv1.getText()==null){
                        tv1.setText("");
                    }
                    else {
                        sin=true;
                        val1 = Float.parseFloat(tv1.getText()+"");
                        tv1.setText(null);



                    }
                }


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
                    else if(sin==true) {
                        tv2.setText(Math.sin(val1)+"");
                        div = false;
                    }
                    else if(cos==true) {
                        tv2.setText(Math.cos(val1)+"");
                        div = false;
                    }
                    else if(tan==true) {
                        tv2.setText(Math.tan(val1)+"");
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
