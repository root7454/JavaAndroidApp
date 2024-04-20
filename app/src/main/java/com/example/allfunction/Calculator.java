package com.example.allfunction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    TextView res;
    Button sub, Radiosub,Radioadd,Radiomul;
    EditText val1,val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        res = findViewById(R.id.Result);
        sub = findViewById(R.id.Submit);
        val1 = findViewById(R.id.Value1);
        val2 = findViewById(R.id.Value2);
        Radiomul = findViewById(R.id.mul);
        Radiosub = findViewById(R.id.sub);
        Radioadd = findViewById(R.id.add);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = val1.getText().toString();
                String value2 = val2.getText().toString();
                String Raddition = Radioadd.getText().toString();
                String Rsubstact = Radiosub.getText().toString();
                String Rmultiply = Radiomul.getText().toString();

                int a = Integer.parseInt(value1);
                int b = Integer.parseInt(value2);

                if (value1.isEmpty() || value2.isEmpty()){
                    Toast.makeText(Calculator.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();

                }
                else if (Radioadd.createAccessibilityNodeInfo().isChecked())
                {
                    int output = add(a,b);
                    res.setText("The Addition is: "+ output);
                    res.setVisibility(View.VISIBLE);
                }
                else if(Radiosub.createAccessibilityNodeInfo().isChecked()){
                    int output = sub(a,b);
                    res.setText("The Substraction is: "+ output);
                    res.setVisibility(View.VISIBLE);
                }
                else if (Radiomul.createAccessibilityNodeInfo().isChecked()) {
                    int output = mul(a,b);
                    res.setText("The Multiplication is: "+ output);
                    res.setVisibility(View.VISIBLE);
                }
            }

        });
    }
    private int mul(int a, int b) {
        return a*b;
    }
    private int sub(int a, int b) {
        return a-b;
    }
    private int add(int a, int b) {
        return a + b;
    }
}