package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class HeadacheActivity extends AppCompatActivity {
    private static final String TAG = "OptionActivity"; // TAG 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.headache); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Hbutton1 = findViewById(R.id.Hbutton1);
        Button Hbutton2 = findViewById(R.id.Hbutton2);
        Button Hbutton3 = findViewById(R.id.Hbutton3);
        Button Hbutton4 = findViewById(R.id.Hbutton4);
        Button Hbutton5 = findViewById(R.id.Hbutton5);
        Button Hbutton6 = findViewById(R.id.Hbutton6);
        Button Hbutton7 = findViewById(R.id.Hbutton7);
        Button Hbutton8 = findViewById(R.id.Hbutton8);
        Button Hbutton0 = findViewById(R.id.Hbutton0);
        // 버튼 클릭 리스너 설정
        Hbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Hbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Hbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HeadacheActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Hbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "뒤로가기 버튼이 클릭되었습니다.");
                finish(); // 현재 Activity를 종료하고 이전 Activity로 돌아갑니다.
            }
        });
    }
}

