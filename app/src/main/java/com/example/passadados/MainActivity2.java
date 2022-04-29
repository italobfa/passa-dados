package com.example.passadados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textName = findViewById(R.id.textView_name);
        TextView textAge = findViewById(R.id.textView_age);
        TextView textHeight = findViewById(R.id.textView_height);

        User user = (User) getIntent().getSerializableExtra("user");

        textName.setText(user.getName());
        textAge.setText(String.valueOf(user.getAge()));
        textHeight.setText(String.valueOf(user.getHeight()));

    }
}