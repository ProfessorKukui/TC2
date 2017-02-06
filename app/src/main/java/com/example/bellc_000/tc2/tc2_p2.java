package com.example.bellc_000.tc2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by bellc_000 on 2/6/2017.
 */

public class tc2_p2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tc2_p2);
    }

    public void Calcular2(View view) {

        Float n1=Float.parseFloat(((EditText)findViewById(R.id.editText1)).getText().toString());
        Float n2=Float.parseFloat(((EditText)findViewById(R.id.editText2)).getText().toString());
        Float n3=Float.parseFloat(((EditText)findViewById(R.id.editText3)).getText().toString());
        float n4= (n1+n1+n2+n3)/4;

        TextView Resultado = (TextView)findViewById(R.id.textView1);
        Resultado.setText(""+n4);

        try{
            Intent intent = getIntent();
            intent.putExtra("nota2", n4);
        }
        catch(Exception e){

        }

    }


}
