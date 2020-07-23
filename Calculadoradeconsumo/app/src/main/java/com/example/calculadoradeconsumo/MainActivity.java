package com.example.calculadoradeconsumo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    Spinner sp;
    EditText edTextAnterior, edTextActual, edTextTotal;
    String resultado;

    calcula calc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {

        String tarifa = (String) sp.getSelectedItem();

        //Variables para validacion de campos vacios
        String consAnterior = edTextAnterior.getText().toString();
        String consActual = edTextActual.getText().toString();

        //Validacion
        if(consAnterior.equals("")){
            Toast.makeText(this, "Indica cual fue el consumo anterior", Toast.LENGTH_LONG).show();
        }

        else if(consActual.equals("")){
            Toast.makeText(this, "Indica cual fue el consumo actual", Toast.LENGTH_LONG).show();
        }

        else{

            Toast.makeText(this, "Has seleccionado la tarifa " + sp.getSelectedItem(), Toast.LENGTH_LONG).show();


            switch (tarifa){
                case "1":
                    resultado = Double.toString(calc.t1(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1A":
                    resultado = Double.toString(calc.t1A(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1B":
                    resultado = Double.toString(calc.t1B(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1C":
                    resultado = Double.toString(calc.t1C(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1D":
                    resultado = Double.toString(calc.t1D(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1E":
                    resultado = Double.toString(calc.t1E(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "1F":
                    resultado = Double.toString(calc.t1F(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
                case "DAC":
                    resultado = Double.toString(calc.DAC(Double.parseDouble(consAnterior), Double.parseDouble(consActual)));
                    break;
            }

            edTextTotal.setText(resultado);

        }
    }
}
