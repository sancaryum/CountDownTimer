package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        new CountDownTimer(10000,1000){

            //The method is what it is gonna do every cycle
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("Left: " + millisUntilFinished/1000);
            }

            //The method is gonna run when countdown finished
            @Override
            public void onFinish() {
                textView.setText("Finished!");
                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
