package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StitchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stitch); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Stbutton1 = findViewById(R.id.Stbutton1);
        Button Stbutton2 = findViewById(R.id.Stbutton2);
        Button Stbutton3 = findViewById(R.id.Stbutton3);
        Button Stbutton4 = findViewById(R.id.Stbutton4);
        Button Stbutton5 = findViewById(R.id.Stbutton5);
        Button Stbutton6 = findViewById(R.id.Stbutton6);
        Button Stbutton7 = findViewById(R.id.Stbutton7);
        Button Stbutton8 = findViewById(R.id.Stbutton8);
        // 버튼 클릭 리스너 설정
        Stbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "결림약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Stbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Stbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StitchActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

