package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        EditText text = (EditText) findViewById(R.id.inputText);
        String inputString = text.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}