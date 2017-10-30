package com.example.taruc.lab21loancalculator;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView textViewDwnPayment;
    TextView textViewPeriod;
    TextView textViewInterestRate;
    TextView textViewMonthPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewDwnPayment=(TextView)findViewById(R.id.textViewPayment);
        textViewPeriod=(TextView)findViewById(R.id.textViewPayment);
        textViewInterestRate=(TextView)findViewById(R.id.textViewPayment);
        textViewMonthPayment=(TextView)findViewById(R.id.textViewPayment);
    }
}
