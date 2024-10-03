package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TirednessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiredness); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Tbutton1 = findViewById(R.id.Tbutton1);
        Button Tbutton2 = findViewById(R.id.Tbutton2);
        Button Tbutton3 = findViewById(R.id.Tbutton3);
        Button Tbutton4 = findViewById(R.id.Tbutton4);
        Button Tbutton5 = findViewById(R.id.Tbutton5);
        Button Tbutton6 = findViewById(R.id.Tbutton6);
        Button Tbutton7 = findViewById(R.id.Tbutton7);
        Button Tbutton8 = findViewById(R.id.Tbutton8);
        // 버튼 클릭 리스너 설정
        Tbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "피로약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Tbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Tbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TirednessActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

