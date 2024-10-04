package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StomachacheActivity extends AppCompatActivity {

    private static final String TAG = "OptionActivity"; // TAG 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stomachache); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Sbutton1 = findViewById(R.id.Sbutton1);
        Button Sbutton2 = findViewById(R.id.Sbutton2);
        Button Sbutton3 = findViewById(R.id.Sbutton3);
        Button Sbutton4 = findViewById(R.id.Sbutton4);
        Button Sbutton5 = findViewById(R.id.Sbutton5);
        Button Sbutton6 = findViewById(R.id.Sbutton6);
        Button Sbutton7 = findViewById(R.id.Sbutton7);
        Button Sbutton8 = findViewById(R.id.Sbutton8);
        Button Sbutton0 = findViewById(R.id.Sbutton0);

        // 버튼 클릭 리스너 설정
        Sbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Sbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Sbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StomachacheActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Sbutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "뒤로가기 버튼이 클릭되었습니다.");
                finish(); // 현재 Activity를 종료하고 이전 Activity로 돌아갑니다.
            }
        });
    }
}

