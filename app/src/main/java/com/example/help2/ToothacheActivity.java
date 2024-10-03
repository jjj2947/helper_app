package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ToothacheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toothache); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Tobutton1 = findViewById(R.id.Tobutton1);
        Button Tobutton2 = findViewById(R.id.Tobutton2);
        Button Tobutton3 = findViewById(R.id.Tobutton3);
        Button Tobutton4 = findViewById(R.id.Tobutton4);
        Button Tobutton5 = findViewById(R.id.Tobutton5);
        Button Tobutton6 = findViewById(R.id.Tobutton6);
        Button Tobutton7 = findViewById(R.id.Tobutton7);
        Button Tobutton8 = findViewById(R.id.Tobutton8);
        // 버튼 클릭 리스너 설정
        Tobutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "치통약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tobutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Tobutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToothacheActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

