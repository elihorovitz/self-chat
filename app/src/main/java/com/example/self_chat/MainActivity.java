package com.example.self_chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void updateEntry(View view) {
        EditText input = findViewById(R.id.entryinput);
        TextView output = findViewById(R.id.inputText);
        output.setText(input.getText());
        input.setText("");
    }
}
