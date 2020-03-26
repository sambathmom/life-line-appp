package com.mona.life_line_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvText;
    private Button btnTop;
    private Button btnBottom;

    private int topBtnClickTime = 0;
    private int bottomBtnClickTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tv_text);
        btnTop = (Button) findViewById(R.id.btn_1);
        btnBottom = (Button) findViewById(R.id.btn_2);

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topBtnClickTime++;
                if (bottomBtnClickTime == 0) {
                    if (topBtnClickTime == 1) {
                        tvText.setText(R.string.T3_Story);
                        btnTop.setText(R.string.T3_Ans1);
                        btnTop.setText(R.string.T3_Ans2);
                    } else if (topBtnClickTime == 2) {
                        tvText.setText(R.string.T6_End);
                        btnTop.setVisibility(View.INVISIBLE);
                        btnBottom.setVisibility(View.INVISIBLE);
                    }
                } else if (bottomBtnClickTime == 1) {
                    if (topBtnClickTime == 1) {
                        tvText.setText(R.string.T3_Story);
                        btnTop.setText(R.string.T3_Ans1);
                        btnTop.setText(R.string.T3_Ans2);
                    } else if (topBtnClickTime == 3) {
                        tvText.setText(R.string.T6_End);
                        btnTop.setVisibility(View.INVISIBLE);
                        btnBottom.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });


        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomBtnClickTime++;
                if (topBtnClickTime == 0) {
                    if (bottomBtnClickTime == 1) {
                        tvText.setText(R.string.T2_Story);
                        btnTop.setText(R.string.T2_Ans1);
                        btnTop.setText(R.string.T2_Ans2);
                    } else if (bottomBtnClickTime ==  2) {
                        tvText.setText(R.string.T4_End);
                        btnTop.setVisibility(View.INVISIBLE);
                        btnBottom.setVisibility(View.INVISIBLE);
                    }
                } else if (topBtnClickTime == 1) {
                    if (bottomBtnClickTime == 2) {
                        tvText.setText(R.string.T5_End);
                        btnTop.setVisibility(View.INVISIBLE);
                        btnBottom.setVisibility(View.INVISIBLE);
                    } else if (bottomBtnClickTime == 1) {
                        tvText.setText(R.string.T6_End);
                        btnTop.setVisibility(View.INVISIBLE);
                        btnBottom.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });
    }
}
