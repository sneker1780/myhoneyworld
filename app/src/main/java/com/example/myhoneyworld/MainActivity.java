package com.example.myhoneyworld;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<BankCard> bankCardList= new ArrayList<>();
    @Override
    protected void onCreate (Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);
        bankCardList.add(new BankCard("Vana","8723 5467 8790 6734", 1000f,"25.02.2017",1234));
        bankCardList.add(new BankCard("Dana","1223 5467 3456 6734", 1000f,"21.02.2017",1234));
        bankCardList.add(new BankCard("Sana","1223 9834 8710 6734", 1000f,"21.02.2017",1234));
    }

   /* @Override
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

    }*/

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
