package com.example.parsingfragment;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MoveWithDataActivity extends AppCompatActivity {
    public static String EXTRA_AGE = "extra age";
    public  static String EXTRA_NAME = "extra name";
    private TextView tvDataReceived;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataReceived = (TextView) findViewById(R.id.btn_with_data);
        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int umur = getIntent().getIntExtra(EXTRA_AGE,0);
        String text = "Name : "+nama+" , Your Umur : "+umur;
        tvDataReceived.setText(text);
    }
}
