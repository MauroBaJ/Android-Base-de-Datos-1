package com.example.basededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtClave, txtNombre, txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtClave = (EditText) findViewById(R.id.txtClave);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtTelefono = (EditText) findViewById(R.id.txtTelefono);
    }

    //Registrar
    public void Registrar(View view) {
        AdminDB admin = new AdminDB(this, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String clave = txtClave.getText().toString();
        String nombre = txtNombre.getText().toString();
        String tel = txtTelefono.getText().toString();

        if (!clave.isEmpty() && !nombre.isEmpty() && !tel.isEmpty()) {

            ContentValues registro = new ContentValues();

            registro.put("Clave", clave);
            registro.put("Nombre", nombre);
            registro.put("Telefono", tel);

            db.insert("usuario", null, registro);

            db.close();

            txtClave.setText("");
            txtNombre.setText("");
            txtTelefono.setText("");

            Toast.makeText(this, "Almacenando datos", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Por favor llene los campos", Toast.LENGTH_SHORT).show();
        }
    }

    //Consultar
    public void Consultar(View view){
        AdminDB admin = new AdminDB(this,"db", null,1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String Clave = txtClave.getText().toString();

        if(!Clave.isEmpty()){
            Cursor fila = db.rawQuery("select Nombre,Telefono from usuario where Clave ="+Clave,null);

            if(fila.moveToFirst()){
                txtNombre.setText(fila.getString(0));
                txtTelefono.setText(fila.getString(1));
                db.close();
            }
            else{
                Toast.makeText(this,"No se encontro usuario", Toast.LENGTH_LONG).show();
                db.close();
            }

        }
        else{
            Toast.makeText(this,"Porfavor ingrese el DNI a consultar", Toast.LENGTH_LONG).show();
        }
    }

    //Eliminar
    public void Eliminar(View view){
        AdminDB admin = new AdminDB(this, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String Clave = txtClave.getText().toString();

        if( !Clave.isEmpty() ){

            int eliminacion = db.delete("usuario", "Clave =" + Clave, null);
            db.close();

            txtClave.setText("");
            txtNombre.setText("");
            txtTelefono.setText("");

            if( eliminacion == 1 )
                Toast.makeText(this, "Se elimino usuario correctamente", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "El usuario con esa clave no existe", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Debe introducir la clave", Toast.LENGTH_SHORT).show();
        }
    }

    //Modificar
    public void Modificar(View view){
        AdminDB admin = new AdminDB(this, "db", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String Clave = txtClave.getText().toString();
        String Nombre = txtNombre.getText().toString();
        String Telefono = txtTelefono.getText().toString();

        if( !Clave.isEmpty() && !Nombre.isEmpty() && !Telefono.isEmpty()){

            ContentValues registro = new ContentValues();
            registro.put("Clave", Clave);
            registro.put("Nombre", Nombre);
            registro.put("Telefono", Telefono);

            int modificar = db.update("usuario", registro, "Clave =" + Clave, null);
            db.close();

            if (modificar == 1)
                Toast.makeText(this, "El usuario recibio sus modificaciones de forma correcta", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "El usuario no se encontro", Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
    }
}
