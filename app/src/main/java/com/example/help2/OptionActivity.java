package com.example.help2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class OptionActivity extends AppCompatActivity {

    private static final String TAG = "OptionActivity"; // TAG 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option); // OptionActivity에 맞는 레이아웃 설정

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        // button1에 리스너 설정
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "두통 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, HeadacheActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "복통 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, StomachacheActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "고열 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, FeverActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "몸살 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, AcheActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "피로 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, TirednessActivity.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "치통 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, ToothacheActivity.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "현기증 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, DizzinessActivity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "감기 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, FluActivity.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "결림 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, StitchActivity.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "두통 버튼이 클릭되었습니다.");
                Intent intent = new Intent(OptionActivity.this, HeadacheActivity.class);
                startActivity(intent);
            }
        });


    }
}
