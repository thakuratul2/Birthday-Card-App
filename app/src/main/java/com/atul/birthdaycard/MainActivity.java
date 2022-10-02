package com.atul.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        edit = findViewById(R.id.editTextTextPersonName);

        btn.setOnClickListener(view -> {
            String name = edit.getEditableText().toString();
            Toast.makeText(MainActivity.this,
                    "Enter name is "+name,
                    Toast.LENGTH_LONG).show();
        });
    }
}