package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    static HashSet<Character> set;
    public static boolean isOperator(char op ){
        return set.contains(op);
    }
    public static boolean validInput(String s){

        int n =s.length();
        for(int i =1;i<n;i++)
        {
            if(s.charAt(i-1) == s.charAt(i) && isOperator(s.charAt(i)))return false;
        }
        return true;
    }

    public static  void createHashMap(){
        set = new HashSet<>();
        set.add('+');
        set.add('-');
        set.add('/');
        set.add('%');
        set.add('*');
        set.add('^');

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.button);
        EditText text =  findViewById(R.id.inputText);
        TextView isValid = (TextView) findViewById(R.id.textView2);

        createHashMap();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString = text.getText().toString();
                boolean res = validInput(inputString);
                if(res){

                    isValid.setText("The string is Valid" );
                }

                else{
                    isValid.setText("String is not valid");
                }
            }
        });

    }
}