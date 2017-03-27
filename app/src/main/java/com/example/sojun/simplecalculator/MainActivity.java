package com.example.sojun.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_1, edit_2;
    Button but_plus, but_minus, but_multiply, but_division;
    TextView textResult;
    String num1, num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit_1 = (EditText)findViewById(R.id.edit_1);
        edit_2 = (EditText)findViewById(R.id.edit_2);

        but_plus = (Button) findViewById(R.id.but_plus);
        but_minus = (Button)findViewById(R.id.but_minus);
        but_multiply = (Button)findViewById(R.id.but_multiply);
        but_division = (Button)findViewById(R.id.but_division);

        textResult = (TextView)findViewById(R.id.text_result);

        but_minus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit_1.getText().toString();
                num2 = edit_2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result.toString());
                return false;
            }
        });

        but_multiply.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit_1.getText().toString();
                num2 = edit_2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result.toString());
                return false;
            }
        });

        but_plus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit_1.getText().toString();
                num2 = edit_2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result.toString());
                return false;
            }
        });

        but_division.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit_1.getText().toString();
                num2 = edit_2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과 : "+result.toString());
                return false;
            }
        });
    }
}
