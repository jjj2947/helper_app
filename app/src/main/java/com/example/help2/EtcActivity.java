package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EtcActivity extends AppCompatActivity {

    private static final String TAG = "OptionActivity"; // TAG 정의

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etc); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Ebutton1 = findViewById(R.id.Ebutton1);
        Button Ebutton2 = findViewById(R.id.Ebutton2);
        Button Ebutton3 = findViewById(R.id.Ebutton3);
        Button Ebutton4 = findViewById(R.id.Ebutton4);
        Button Ebutton5 = findViewById(R.id.Ebutton5);
        Button Ebutton6 = findViewById(R.id.Ebutton6);
        Button Ebutton7 = findViewById(R.id.Ebutton7);
        Button Ebutton8 = findViewById(R.id.Ebutton8);
        Button Ebutton0 = findViewById(R.id.Ebutton0);
        // 버튼 클릭 리스너 설정
        Ebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "기타C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Ebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EtcActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Ebutton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "뒤로가기 버튼이 클릭되었습니다.");
                finish(); // 현재 Activity를 종료하고 이전 Activity로 돌아갑니다.
            }
        });


    }
}

