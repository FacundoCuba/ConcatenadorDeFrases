package com.example.facu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.regex.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Procesar (View v){
        TextView frase1 = (TextView) findViewById(R.id.txtFrase1);
        TextView frase2 = (TextView) findViewById(R.id.txtFrase2);
        String concatenados = frase1.getText()+" "+frase2.getText();
        TextView frasesSumadas = (TextView) findViewById(R.id.txtFrasesConcatenadas);
        frasesSumadas.setText(concatenados, TextView.BufferType.EDITABLE);
        TextView numeroDeLetras = (TextView) findViewById(R.id.numTotalDeCaracteres);
        String frasesSinEspacios = concatenados.replace(" ", "");
        Integer num = frasesSinEspacios.length();
        numeroDeLetras.setText(String.valueOf(num), TextView.BufferType.EDITABLE);
    }


}
