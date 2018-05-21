package com.ptp.phamtanphat.freakingmath0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView txtSothu1,txtSothu2,txtPheptinh,txtKetqua;
    Button btnVitri1,btnVitri2;
    String pheptinh ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }

    private void init() {
        Random random = new Random();

        int sothu1 = random.nextInt(10) + 1;
        int sothu2 = random.nextInt(10) + 1;

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
        txtSothu1.setText(sothu1 + "");
        txtSothu2.setText(sothu2 + "");
        txtPheptinh.setText(pheptinh);
        txtKetqua.setText(ketqua + "");

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
