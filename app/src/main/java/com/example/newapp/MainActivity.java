package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.txt_my_text);
        Button button = (Button)findViewById(R.id.btn_click);
        View view =  getLayoutInflater().inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("សូមស្វាគមន៍");
                textView.setTextSize(30);
                Toast myToast  = new Toast(getApplicationContext());
                myToast.setView(view);
                myToast.setDuration(Toast.LENGTH_LONG);
                myToast.show();
            }
        });
    }
}