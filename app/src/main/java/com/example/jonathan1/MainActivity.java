package com.example.jonathan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1; // 按鈕物件
    Button button2;
    TextView textView1;
    EditText edittext1;

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 設定 UI (User InterFace)

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclick();
            }
        });
        button1.setText("點我");

        textView1 = findViewById(R.id.textview1);
        counter = 0;

        button2 = findViewById(R.id.button2);
        edittext1 = findViewById(R.id.edittext1);
        button2.setText("輸入");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                s = edittext1.getText().toString();
                textView1.setText(s);
            }
        });
    }

    public void buttonclick() {
        // Debug
        Log.v("Eason","Button Clicked!!!");
        // Toast message
        Toast t = Toast.makeText(this, "你按了按鈕!", Toast.LENGTH_LONG);
        t.show();

        // 修改 button text
        if(button1.getText().equals("點我"))
        {
            button1.setText("你點了!");
        }else{
            button1.setText("點我");
        }

        counter++; // +1

        textView1.setText(""+counter);

    }
}
