package com.example.aruna.countdowndialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_click = findViewById(R.id.tv_click);

        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownDialog countDownDialog = new CountDownDialog();
                countDownDialog.show(getSupportFragmentManager(), "fragment_countdownTimer");
            }
        });
    }


}
