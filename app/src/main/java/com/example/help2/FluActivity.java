package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FluActivity extends AppCompatActivity {

    private static final String TAG = "OptionActivity"; // TAG 정의
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flu); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Flbutton1 = findViewById(R.id.Flbutton1);
        Button Flbutton2 = findViewById(R.id.Flbutton2);
        Button Flbutton3 = findViewById(R.id.Flbutton3);
        Button Flbutton4 = findViewById(R.id.Flbutton4);
        Button Flbutton5 = findViewById(R.id.Flbutton5);
        Button Flbutton6 = findViewById(R.id.Flbutton6);
        Button Flbutton7 = findViewById(R.id.Flbutton7);
        Button Flbutton8 = findViewById(R.id.Flbutton8);
        Button Flbutton0 = findViewById(R.id.Flbutton0);
        // 버튼 클릭 리스너 설정
        Flbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "감기약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Flbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Flbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FluActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Flbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "뒤로가기 버튼이 클릭되었습니다.");
                finish(); // 현재 Activity를 종료하고 이전 Activity로 돌아갑니다.
            }
        });
    }
}

