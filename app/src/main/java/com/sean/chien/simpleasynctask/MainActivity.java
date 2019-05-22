package com.sean.chien.simpleasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
    }

    public void startTask(View view) {
        // when we press 'StartTask' button.
        int seconds = Integer.parseInt(editText.getText().toString());
        MyBackgroundTask task = new MyBackgroundTask(textView, seconds);
        task.execute(); // start!

        // doing some work in MainThread (block the UI)
        // DO NOT DO THIS!
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//
//        }
//        textView.setText("Sleeping in MainThread");
    }
}
