package com.example.help2; // 실제 패키지 이름으로 변경하세요

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DizzinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toothache); // XML 파일 이름과 맞춰주세요

        // 버튼 초기화
        Button Dbutton1 = findViewById(R.id.Dbutton1);
        Button Dbutton2 = findViewById(R.id.Dbutton2);
        Button Dbutton3 = findViewById(R.id.Dbutton3);
        Button Dbutton4 = findViewById(R.id.Dbutton4);
        Button Dbutton5 = findViewById(R.id.Dbutton5);
        Button Dbutton6 = findViewById(R.id.Dbutton6);
        Button Dbutton7 = findViewById(R.id.Dbutton7);
        Button Dbutton8 = findViewById(R.id.Dbutton8);
        // 버튼 클릭 리스너 설정
        Dbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약A 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약B 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약C 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약D 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약E 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약F 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });

        Dbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약G 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
        Dbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DizzinessActivity.this, "약H 클릭됨", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

