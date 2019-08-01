package com.example.hwork33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit_text_1);
        editText2 = findViewById(R.id.edit_text_2);
        editText3 = findViewById(R.id.edit_text_3);
        button2 = findViewById(R.id.main_bottom_2);
        button1 = findViewById(R.id.main_bottom_1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra(Intent.EXTRA_TEXT, editText1.getText().toString() + " " +  editText2.getText().toString() + " " +
                        editText3.getText().toString());
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String name_1 = editText1.getText().toString();
                intent.putExtra("name", name_1);
                String name_2 = editText2.getText().toString();
                intent.putExtra("SecondName", name_2);
                String name_3 = editText3.getText().toString();
                intent.putExtra("ThirdName", name_3);
                startActivity(intent);

            }
        });


    }
}
