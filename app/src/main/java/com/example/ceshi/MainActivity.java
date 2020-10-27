package com.example.ceshi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button(View v){
        TextView tx = findViewById(R.id.textView3);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=3+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button2(View v){
        TextView tx = findViewById(R.id.textView3);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=2+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button3(View v){
        TextView tx = findViewById(R.id.textView3);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=1+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button4(View v){
        TextView tx = findViewById(R.id.textView4);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=3+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button5(View v){
        TextView tx = findViewById(R.id.textView4);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=2+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button6(View v){
        TextView tx = findViewById(R.id.textView4);
        Integer score=  Integer.valueOf(tx.getText().toString());
        Integer newscore=1+score;
        tx.setText(String.valueOf(newscore));
    }
    public void Button9(View view){
        TextView tx=findViewById(R.id.textView3);
        TextView tx1=findViewById(R.id.textView4);
        tx.setText("0");
        tx1.setText("0");
    }



}