package com.example.bellc_000.tc2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tc2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tc2);

        try{

            Intent intent1 = getIntent();
            String n1 = intent1.getStringExtra("nota1");
            TextView Resultado1 = (TextView)findViewById(R.id.textView1);
            Resultado1.setText(n1);

            Intent intent2 = getIntent();
            String n2 = intent2.getStringExtra("nota2");
            TextView Resultado2 = (TextView)findViewById(R.id.textView2);
            Resultado2.setText(n2);

            Intent intent3 = getIntent();
            String n3 = intent3.getStringExtra("nota3");
            TextView Resultado3 = (TextView)findViewById(R.id.textView3);
            Resultado3.setText(n3);

            Intent intent4 = getIntent();
            String n4 = intent4.getStringExtra("nota4");
            TextView Resultado4 = (TextView)findViewById(R.id.textView4);
            Resultado4.setText(n4);
        }
        catch (Exception e){

        }

    }

    public void CalcularNota1(View view) {

        Button button = (Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(tc2.this, tc2_p1.class);
                tc2.this.startActivity(activity);
            }
        });

    }

    public void CalcularNota2(View view) {

        Button button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(tc2.this, tc2_p2.class);
                tc2.this.startActivity(activity);
            }
        });

    }

    public void CalcularNota3(View view) {

        Button button = (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(tc2.this, tc2_p3.class);
                tc2.this.startActivity(activity);
            }
        });

    }

    public void CalcularNota4(View view) {

        Button button = (Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity = new Intent(tc2.this, tc2_p4.class);
                tc2.this.startActivity(activity);
            }
        });

    }


}
