package com.example.passadados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textName;
    private EditText textAge;
    private EditText textHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.editText_name);
        textAge = findViewById(R.id.editText_age);
        textHeight = findViewById(R.id.editText_height);

        findViewById(R.id.button_send).setOnClickListener(view -> {

            User user = new User();

            String nome = textName.getText().toString();
            int age = Integer.parseInt(textAge.getText().toString());
            double height = Double.parseDouble(textHeight.getText().toString());

            user.setName(nome);
            user.setAge(age);
            user.setHeight(height);

            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("user", user);
            startActivity(intent);

        });
    }
}