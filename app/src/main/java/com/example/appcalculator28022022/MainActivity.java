package com.example.appcalculator28022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        mEdtNumber2=findViewById(R.id.editTextNumber1);
        mTvResult=findViewById(R.id.textViewResult);
        mBtnPlus=findViewById(R.id.btnPlus);
    }
}