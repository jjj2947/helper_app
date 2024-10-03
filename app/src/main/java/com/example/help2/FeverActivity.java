package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FeverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fever); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Fbutton1 = findViewById(R.id.Fbutton1);
        Button Fbutton2 = findViewById(R.id.Fbutton2);
        Button Fbutton3 = findViewById(R.id.Fbutton3);
        Button Fbutton4 = findViewById(R.id.Fbutton4);
        Button Fbutton5 = findViewById(R.id.Fbutton5);
        Button Fbutton6 = findViewById(R.id.Fbutton6);
        Button Fbutton7 = findViewById(R.id.Fbutton7);
        Button Fbutton8 = findViewById(R.id.Fbutton8);
        // 버튼 클릭 리스너 설정
        Fbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "고열약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Fbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Fbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeverActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

