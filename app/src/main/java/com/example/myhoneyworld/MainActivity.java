package com.example.myhoneyworld;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String Serhii;
        int razrabotchik=100;
        Log.d("Lesson2", "onCreate");
        Button btHitMe = findViewById(R.id.bt_hit_me);
        btHitMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Lesson2","кнопка нажата");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lesson2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onPostResume();
        Log.d("Lesson2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lesson2", "onPause");
    }
}
