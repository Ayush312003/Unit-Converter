package com.example.appunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private  Button Button;
    private EditText edittext;
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button=findViewById(R.id.button1);
        edittext=findViewById(R.id.editText);
        textview=findViewById(R.id.textView2);
        /*Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();
                String s=edittext.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textview.setText("Value in Pound is"+pound);
            }
        });
        */
    }
    public void calculate(View view)
    {
        Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();
        String s=edittext.getText().toString();
        int kg=Integer.parseInt(s);
        double pound=2.205*kg;
        textview.setText("Value in Pound is"+pound);
    }
}
