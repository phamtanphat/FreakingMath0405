package com.ptp.phamtanphat.freakingmath0405;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView txtSothu1,txtSothu2,txtPheptinh,txtKetqua;
    Button btnVitri1,btnVitri2;
    boolean vitrixuathien;
    String pheptinh ;
    int sothu2;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
//        init();
//        eventClick();
        //Trong 1 khoang thoi gian se thuc thi viec gi do

//        CountDownTimer countDownTimer = new CountDownTimer(5000,2000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                index++;
//                Log.d("BBB", index + "");
//            }
//
//            @Override
//            public void onFinish() {
//                index++;
//                Log.d("BBB",  index + "");
//            }
//        };
//        countDownTimer.start();
        //Sau 1 khoang thoi gian se thuc thi
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this,1000);
                handler.removeCallbacks(this);
                Toast.makeText(MainActivity.this, "Chao ban", Toast.LENGTH_SHORT).show();
            }
        },1000);

    }

    private void eventClick() {
        btnVitri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int giatri = Integer.parseInt(btnVitri1.getText().toString());
                if (giatri == sothu2){
                    Toast.makeText(MainActivity.this, "Dung roi", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sai roi", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btnVitri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int giatri = Integer.parseInt(btnVitri2.getText().toString());
                if (giatri == sothu2){
                    Toast.makeText(MainActivity.this, "Dung roi", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sai roi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void init() {
        Random random = new Random();

        int sothu1 = random.nextInt(10) + 10;
        sothu2 = random.nextInt(10) + 1;

        String indexpheptinh  = String.valueOf(random.nextInt( 4));

        int ketqua = 0;
        switch (indexpheptinh){
            case "0" : pheptinh = "+";
                ketqua = sothu1 + sothu2;
                break;
            case "1" : pheptinh = "-";
                ketqua = sothu1 - sothu2;
                break;
            case "2" : pheptinh = "*";
                ketqua = sothu1 * sothu2;
                break;
            case "3" : pheptinh = "/";
                ketqua = sothu1 / sothu2;
                break;
        }
        vitrixuathien = random.nextBoolean();

        if (vitrixuathien){
            btnVitri1.setText(sothu2 + "");
            btnVitri2.setText((random.nextInt(5)+ 1 + sothu2) + "");
        }else{
            btnVitri1.setText((random.nextInt(5) + 1  + sothu2) + "");
            btnVitri2.setText(sothu2 + "");
        }
        txtSothu1.setText(sothu1 + "");
        txtSothu2.setText("?");
        txtPheptinh.setText(pheptinh);
        txtKetqua.setText( " = " + ketqua );

    }

    private void anhxa() {
        txtSothu1 = findViewById(R.id.textviewsothu1);
        txtSothu2 = findViewById(R.id.textviewsothu2);
        txtPheptinh = findViewById(R.id.textviewpheptinh);
        txtKetqua = findViewById(R.id.textviewketqua);
        btnVitri1 = findViewById(R.id.buttongiatri1);
        btnVitri2 = findViewById(R.id.buttongiatri2);
    }
}
