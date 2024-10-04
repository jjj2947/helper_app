package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.util.Log; // Log 클래스 뒤로가기
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AcheActivity extends AppCompatActivity {

    private static final String TAG = "OptionActivity"; // TAG 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ache); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Abutton1 = findViewById(R.id.Abutton1);
        Button Abutton2 = findViewById(R.id.Abutton2);
        Button Abutton3 = findViewById(R.id.Abutton3);
        Button Abutton4 = findViewById(R.id.Abutton4);
        Button Abutton5 = findViewById(R.id.Abutton5);
        Button Abutton6 = findViewById(R.id.Abutton6);
        Button Abutton7 = findViewById(R.id.Abutton7);
        Button Abutton8 = findViewById(R.id.Abutton8);
        Button Abutton0 = findViewById(R.id.Abutton0);
        // 버튼 클릭 리스너 설정
        Abutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "몸살약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Abutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcheActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Abutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "뒤로가기 버튼이 클릭되었습니다.");
                finish(); // 현재 Activity를 종료하고 이전 Activity로 돌아갑니다.
            }
        });
    }
}

