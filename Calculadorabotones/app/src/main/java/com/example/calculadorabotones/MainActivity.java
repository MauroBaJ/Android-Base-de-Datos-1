package com.example.calculadorabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
                   btnPunto, btnSuma, btnResta, btnMultiplicacion, btnDivision,
                   btnIgual, btnEliminar;

    private EditText pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pantalla
        pantalla = (EditText) findViewById(R.id.editText2);
        //Botones
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnSuma = (Button) findViewById(R.id.btnSumar);
        btnResta = (Button) findViewById(R.id.btnRestar);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicar);
        btnDivision = (Button) findViewById(R.id.btnDividir);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnEliminar = (Button) findViewById(R.id.btnDeleteAll);
    }

    Double n1, n2, result;
    String operador;

    //Botones numeros
    public void onClickbtn0(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "0");
    }
    public void onClickbtn1(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "1");
    }
    public void onClickbtn2(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "2");
    }
    public void onClickbtn3(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "3");
    }
    public void onClickbtn4(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "4");
    }
    public void onClickbtn5(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "5");
    }
    public void onClickbtn6(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "6");
    }
    public void onClickbtn7(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "7");
    }
    public void onClickbtn8(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "8");
    }
    public void onClickbtn9(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + "9");
    }
    public void onClickbtnPunto(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        pantalla.setText(pantalla.getText() + ".");
    }

    //Botones Operadores
    public void onClickDivision(View view){
        operador = "/";
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
    }
    public void onClickSumar(View view){
        operador = "+";
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
    }
    public void onClickRestar(View view){
        operador = "-";
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
    }
    public void onClickMultiplicacion(View view){
        operador = "*";
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
    }

    //Operaciones
    public double suma(double n1, double n2){ return n1 + n2;}
    public double resta(double n1, double n2){ return n1 - n2;}
    public double multiplicacion(double n1, double n2){ return n1 * n2;}
    public double division(double n1, double n2){ return n1 / n2;}

    //Boton Igual
    public void onClickIgual(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n2 = Double.parseDouble(pantalla.getText().toString());

        switch(operador){
            case "+":
                result = suma(n1, n2);
                break;
            case "-":
                result = resta(n1, n2);
                break;
            case "*":
                result = multiplicacion(n1, n2);
                break;
            case "/":
                result = division(n1, n2);
                break;
        }

        pantalla.setText(result.toString());
    }

    public void onClickbtnEliminar(View view){
        EditText pantalla = (EditText) findViewById(R.id.editText2);
        n1 = 0.0;
        n2 = 0.0;
        result = 0.0;
        operador = "";
        pantalla.setText("");
    }
}
