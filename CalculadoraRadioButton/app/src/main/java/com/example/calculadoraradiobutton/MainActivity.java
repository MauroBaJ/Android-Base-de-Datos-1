package com.example.calculadoraradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText Num1, Num2, Resultado;
    private RadioButton btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaracion de los radiobutton
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);

        //Declaracion de los campos de texto
        Num1 =  findViewById((R.id.Num1));
        Num2 =  findViewById((R.id.Num2));
        Resultado = findViewById(R.id.Result);
    }

    //Operacion principal
    public void Calcular(View view){
        String v1 = Num1.getText().toString();
        String v2 = Num2.getText().toString();

        double n1 = Double.parseDouble(v1);
        double n2 = Double.parseDouble(v2);
        double result = 0;

        if (btnSuma.isChecked()) {
            result = n1 + n2;
        } else if (btnResta.isChecked()){
            result = n1 - n2;
        }
        else if (btnMultiplicacion.isChecked()) {
            result = n1 * n2;
        }
        else if (btnDivision.isChecked()) {
            result = n1 / n2;
        }

        String resultado = String.valueOf(result);
        Resultado.setText(resultado);
    }

}
