package com.example.appcalculator28022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEdtNumber1,mEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus,mBtnMinus,mBtnMultiplication,mBtnDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Anh xa
        mEdtNumber1=findViewById(R.id.editTextNumber1);
        mEdtNumber2=findViewById(R.id.editTextNumber2);
        mTvResult=findViewById(R.id.textViewResult);
        mBtnPlus=findViewById(R.id.btnPlus);
        mBtnMinus=findViewById(R.id.btnMinus);
        mBtnMultiplication=findViewById(R.id.btnMultiplication);
        mBtnDivision=findViewById(R.id.btnDivision);

        //bat su kien nut +
        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Lay du lieu input
                String textNumber1=mEdtNumber1.getText().toString();
                String textNumber2=mEdtNumber2.getText().toString();

                if(textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    if(textNumber1.isEmpty())
                    {
                        mEdtNumber1.setError("Input Empty");
                    }
                    if(textNumber2.isEmpty())
                    {
                        mEdtNumber2.setError("Input Empty");
                    }
                }

                else{
                    int number1=Integer.parseInt(textNumber1);
                    int number2=Integer.parseInt(textNumber2);

                    int result=number1 + number2;

                    mTvResult.setText("Result = "+result);
                }
            }
        });

        //bat su kien dau -
        mBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lay du lieu input
                String textNumber1=mEdtNumber1.getText().toString();
                String textNumber2=mEdtNumber2.getText().toString();

                if(textNumber2.isEmpty()||textNumber1.isEmpty())
                {
                    if(textNumber1.isEmpty())
                    {
                        mEdtNumber1.setError("Input Empty");
                    }
                    if(textNumber2.isEmpty())
                    {
                        mEdtNumber2.setError("Input Empty");
                    }
                }
                else
                {
                    int number1=Integer.parseInt(textNumber1);
                    int number2=Integer.parseInt(textNumber2);

                    int result=number1-number2;

                    mTvResult.setText("Result = "+result);
                }
            }
        });

        //Phep nhan
        mBtnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay du lieu input
                String textNumber1=mEdtNumber1.getText().toString();
                String textNumber2=mEdtNumber2.getText().toString();

                //kiem tra rong
                if(textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    if(textNumber1.isEmpty())
                    {
                        mEdtNumber1.setError("Input is Empty");
                    }
                    if(textNumber2.isEmpty())
                    {
                        mEdtNumber2.setError("Input is Empty");
                    }
                }

                else{
                    int number1=Integer.parseInt(textNumber1);
                    int number2=Integer.parseInt(textNumber2);

                    int result=number1*number2;

                    mTvResult.setText("Result = "+result);
                }

            }
        });


        //phep chia
        mBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lay du lieu
                String textNumber1=mEdtNumber1.getText().toString();
                String textNumber2=mEdtNumber2.getText().toString();

                //kiem tra rong
                if(textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    if(textNumber1.isEmpty())
                    {
                        mEdtNumber1.setError("Input is Empty");
                    }
                    if(textNumber2.isEmpty())
                    {
                        mEdtNumber2.setError("Input is Empty");
                    }
                }

                else
                {
                    float number1=Float.parseFloat(textNumber1);
                    float number2=Float.parseFloat(textNumber2);

                    if(number2==0){
                        Toast.makeText(MainActivity.this, "Khong chia voi so 0", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float result=number1/number2;
                        mTvResult.setText("Result = "+String.format("%.02f",result));
                    }

                }
            }
        });

//        //Ham kiem tra gia tri
//        int a=5;
//        Log.d("BBB",String.valueOf(a));


    }
}