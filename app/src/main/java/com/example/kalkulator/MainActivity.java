package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2, hasil;
    Button calculate;
    Spinner operator;

    String spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input1 = (EditText) findViewById(R.id.Input1);  // ini buat manggil input1 di .xml
                input2 = (EditText) findViewById(R.id.Input2);
                hasil = (EditText) findViewById(R.id.Hasil);
                operator = (Spinner) findViewById(R.id.Operator);

                spinner = (String) operator.getSelectedItem();

                if(spinner.trim().equals("+")){
                    float result = Float.parseFloat(input1.getText().toString()) + Float.parseFloat(input2.getText().toString());
                    hasil.setText(Float.toString(result));
                }
                else if(spinner.trim().equals("-")){
                    float result = Float.parseFloat(input1.getText().toString()) - Float.parseFloat(input2.getText().toString());
                    hasil.setText(Float.toString(result));
                }
                else if(spinner.trim().equals("*")){
                    float result = Float.parseFloat(input1.getText().toString()) * Float.parseFloat(input2.getText().toString());
                    hasil.setText(Float.toString(result));
                }
                else if(spinner.trim().equals("/")){
                    float result = Float.parseFloat(input1.getText().toString()) / Float.parseFloat(input2.getText().toString());
                    hasil.setText(Float.toString(result));
                }
            }
        };
        calculate = (Button) findViewById(R.id.Calculate);
        calculate.setOnClickListener(listener);
    }
}