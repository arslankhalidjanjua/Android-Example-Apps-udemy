package com.example.palindrome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener
{
    //https://stackoverflow.com/questions/4138827/check-string-for-palindrome/15018381

    private Button chPalin;
    private EditText etstr;
    private TextView tvResult;
    private static String ret;
    //private static double memoryValue,inputvalue;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public static boolean palinCheck(String ar)
    {
        String reverse = "";
        int length = ar.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + ar.charAt(i);
        if (ar.equals(reverse))
            return true;
        else
            return false;
    }

    private void init(){
        chPalin=(Button)findViewById(R.id.chPalin);
        etstr=(EditText)findViewById(R.id.etstr);
        tvResult=(TextView)findViewById(R.id.tvResult);

        chPalin.setOnClickListener(this);
    }
    public void onClick(View view){
        String palin=etstr.getText().toString();

        if(view.getId()==(R.id.chPalin))
        {	boolean res=palinCheck(palin);
            if (res)
            {
                ret="Entered string is a palindrome.";
                tvResult.setText(String.valueOf(ret));
            }
            else
            {
                ret="Entered string is not a palindrome.";
                tvResult.setText(String.valueOf(ret));
            }

        }
    }

}