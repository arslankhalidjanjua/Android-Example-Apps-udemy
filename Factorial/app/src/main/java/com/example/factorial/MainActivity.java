package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {

    EditText number;
    TextView answer;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        number = (EditText) findViewById(R.id.ed_Number);
        number.setHint("Enter number to be factorialized ");
        answer = (TextView) findViewById(R.id.result);
        calculate = (Button) findViewById(R.id.result_btn);
        calculate.setOnClickListener(this);
    }

    private long calcFactorial() {

        long factorial = 1;
        try {
            factorial = Long.parseLong(number.getText().toString());
            for (long i = factorial - 1; i > 0; i--) {
                factorial = i * factorial;
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Incorrect Input", Toast.LENGTH_LONG).show();
        } finally {
        }

        return factorial;
    }

    @Override
    public void onClick(View v) {
        answer.setText("Factorial of " + number.getText().toString() + " is : " + calcFactorial());
    }
}