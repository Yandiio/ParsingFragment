package com.example.parsingfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

    public class MoveForResultActivity extends AppCompatActivity implements
    View.OnClickListener {
        Button btnChoose;
        RadioGroup rgNumber;


        public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
        public static int RESULT_CODE = 110;

        @Override
        protected void onCreate (@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_for_result);

        btnChoose = findViewById(R.id.btn_choose);
        rgNumber = findViewById(R.id.rg_button);
        btnChoose.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
            if(view.getId() == R.id.btn_choose){
                if(rgNumber.getCheckedRadioButtonId() != 0){
                    int value = 0;
                    switch (rgNumber.getCheckedRadioButtonId()){
                        case R.id.rb100:
                            value = 100;
                            break;
                        case R.id.rb150 :
                            value = 150;
                            break;
                        case R.id.rb200 :
                            value = 200;
                            break;
                        case R.id.rb250 :
                            value = 250;
                            break;
                    }
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra(EXTRA_SELECTED_VALUE,value);
                    setResult(RESULT_CODE,resultIntent);
                    finish();

                }
        }
    }
}