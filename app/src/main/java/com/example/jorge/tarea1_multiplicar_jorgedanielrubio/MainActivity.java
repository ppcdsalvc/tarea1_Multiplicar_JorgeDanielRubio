package com.example.jorge.tarea1_multiplicar_jorgedanielrubio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btncal;
    TextView textresu;
    EditText txtnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncal= (Button) findViewById(R.id.button);
        txtnum = (EditText) findViewById(R.id.editText);
        textresu= (TextView) findViewById(R.id.textView);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena = "";
                if(txtnum.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(),"Ingrese el numero",Toast.LENGTH_LONG);

                }else {
                    for(int i=0; i<=10;i++){
                        int n = Integer.valueOf(txtnum.getText().toString());
                        cadena +="" +txtnum.getText().toString() + "X" + i +  "=" + (n * i);
                        cadena += "\n";
                    }

                    textresu.setText(cadena);
                }
            }
        });
    }

}
