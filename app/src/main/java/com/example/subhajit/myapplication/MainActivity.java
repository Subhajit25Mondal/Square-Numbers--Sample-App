package com.example.subhajit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void check(View view){
        EditText input = (EditText) findViewById(R.id.input);

        if(input.getText().toString().isEmpty())
        { Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show(); return; }

        int n = Integer.parseInt(input.getText().toString());

        int t=1, sqrt =1;

        while (sqrt <= n){
            if (n == sqrt){
                Toast.makeText(this, "This is a square number", Toast.LENGTH_SHORT).show();
                return;
            }
            else{
                t = t+1;
                sqrt = t*t;
            }
        }

        Toast.makeText(this, "This is not a square number", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
