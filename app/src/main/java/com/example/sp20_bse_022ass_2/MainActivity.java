package com.example.sp20_bse_022ass_2;



import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String num="1234";
    int count=0;
    String data1,data2,data3,data4,data5,data6,data7,data8,data9,data10;
    TextView txt1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,back,confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        back=findViewById(R.id.back);
        confirm=findViewById(R.id.confirm);
        txt1=findViewById(R.id.txt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1=txt1.getText().toString();
                data1=data1.concat("1");
                txt1.setText(data1);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data2=txt1.getText().toString();
                data2=data2.concat("2");
                txt1.setText(data2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data3=txt1.getText().toString();
                data3=data3.concat("3");
                txt1.setText(data3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data4=txt1.getText().toString();
                data4=data4.concat("4");
                txt1.setText(data4);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data5=txt1.getText().toString();
                data5=data5.concat("5");
                txt1.setText(data5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data6=txt1.getText().toString();
                data6=data6.concat("6");
                txt1.setText(data6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data7=txt1.getText().toString();
                data7=data7.concat("7");
                txt1.setText(data7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data8=txt1.getText().toString();
                data8=data8.concat("8");
                txt1.setText(data8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data9=txt1.getText().toString();
                data9=data9.concat("9");
                txt1.setText(data9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data10=txt1.getText().toString();
                data10=data10.concat("0");
                txt1.setText(data10);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=txt1.getText().toString();
                if (a.equals(num))
                {

                    Intent intent=new Intent(MainActivity.this,Second.class);
                    startActivity(intent);
                }
                else
                {
                    count++;
                    if (count>3)
                    {
                        finish();
                    }
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=txt1.getText().toString();
                if(s.length()>0)
                {
                    txt1.setText(s.substring(0,s.length()-1));
                }


            }
        });
    }

}