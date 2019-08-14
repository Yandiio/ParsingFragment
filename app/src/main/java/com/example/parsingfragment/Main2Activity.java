package com.example.parsingfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv = (TextView) findViewById(R.id.tv2);
        Bundle bd = getIntent().getExtras();
        String s = bd.getString("nama");
        tv.setText(s);
    }
}
