package com.example.olchi.jawalandcom;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pass;
    private Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forLisenerOnClickBtn();
    }

    public void forLisenerOnClickBtn(){

        pass = (EditText)findViewById(R.id.passText);
        btn =(Button)findViewById(R.id.btn);
        btn2 =(Button)findViewById(R.id.btn2);

        btn.setText("Нажми!!!");
        btn.setBackgroundColor(Color.BLUE);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                btn.setText("Буууум!!!");
                btn.setBackgroundColor(Color.RED);
                Toast.makeText(
                        MainActivity.this,
                        pass.getText(),
                        Toast.LENGTH_SHORT).show();
            }});
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                btn.setText("Нажми!!!");
                btn.setBackgroundColor(Color.BLUE);
                Toast.makeText(
                        MainActivity.this,
                        "Все вернули обратоно",
                        Toast.LENGTH_SHORT).show();
            }});
    }
}
