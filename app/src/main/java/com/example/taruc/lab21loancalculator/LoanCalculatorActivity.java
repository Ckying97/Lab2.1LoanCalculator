package com.example.taruc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoanCalculatorActivity extends AppCompatActivity {
    public static final String PRICE="LoanCalculatorActivity.price";
    public static final String DWNPAYMENT="LoanCalculatorActivity.loanPayment";
    public static final String PERIOD="LoanCalculatorActivity.period";
    public static final String INTERESTRATE="LoanCalculatorActivity.interestRate";
    private EditText editTextPrice;
    private EditText editTextDwnpayment;
    private EditText editTextPeriod;
    private EditText editTextInterestRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_calculator);
        editTextPrice=(EditText)findViewById(R.id.editText3);
        editTextDwnpayment=(EditText)findViewById(R.id.editText4);
        editTextPeriod=(EditText)findViewById(R.id.editText5);
        editTextInterestRate=(EditText)findViewById(R.id.editText6);

    }

    public void sendMessage(View view){
        Intent intent=new Intent(this,ResultActivity.class);

        Double price=Double.parseDouble(editTextPrice.getText().toString());
        Double dwnPayment=Double.parseDouble(editTextDwnpayment.getText().toString());
        Integer period=Integer.parseInt(editTextPeriod.getText().toString());
        Double interestRate=Double.parseDouble(editTextInterestRate.getText().toString());

        intent.putExtra(PRICE,price);
        intent.putExtra(DWNPAYMENT,dwnPayment);
        intent.putExtra(PERIOD,period);
        intent.putExtra(INTERESTRATE,interestRate);

        startActivity(intent);

    }
}
