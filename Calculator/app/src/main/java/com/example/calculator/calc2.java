package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Pattern;

public class calc2 extends AppCompatActivity {

    private TextView screen;
    private String display = "";
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc2);
        screen = (TextView)findViewById(R.id.tv11);
        screen.setText(display);
    }

    private void updateScreen(){
        screen.setText(display);
    }

    public void onClickNumber(View v){
       Button b = (Button) v;
       display += b.getText();
       updateScreen();
    }

    public void onClickOperator(View v){
        Button b = (Button) v;
        display += b.getText();
        currentOperator = b.getText().toString();
        updateScreen();
    }

    private void clear(){
        display = "";
        currentOperator = "";
        updateScreen();
    }

    public void onClickClear(View v){
        clear();
        updateScreen();
    }

    private double operate(String a, String b, String op){
        switch (op){
            case "+": return Double.valueOf(a) + Double.valueOf(b);
            case "-": return Double.valueOf(a) - Double.valueOf(b);
            case "X": return Double.valueOf(a) * Double.valueOf(b);
            case "/": try{return Double.valueOf(a) / Double.valueOf(b);
            } catch (Exception e){
                Log.d("Calc", e.getMessage());
            }
            default: return -1;
        }
    }
    public void onClickEqual(){
        String[] operation = display.split(Pattern.quote(currentOperator));
        if(operation.length < 2) return;

        Double result = operate(operation[0], operation[1], currentOperator);
        screen.setText(display + "\n" + String.valueOf(result));
    }
}
