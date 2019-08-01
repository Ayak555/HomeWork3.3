package com.example.hwork33;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.text_view_1);
        textView2 = findViewById(R.id.text_view_2);
        textView3 = findViewById(R.id.text_view_3);


        Intent intent = getIntent();
        String name_1 = intent.getStringExtra("name");
        textView1.setText(name_1);
        String name_2 = intent.getStringExtra("SecondName");
        textView2.setText(name_2);
        String name_3 = intent.getStringExtra("ThirdName");
        textView3.setText(name_3);

    }

}
