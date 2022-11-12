package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText Nombre;
    private EditText Apellido;
    private EditText Telefono;
    private EditText Direccion;
    private EditText Genero;
    private EditText Fecha;
    private TextView Nom;
    private TextView Ape;
    private TextView Tel;
    private TextView Dir;
    private TextView Ge;
    private TextView Fe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = findViewById(R.id.edNombre);
        Apellido = findViewById(R.id.edApellido);
        Telefono = findViewById(R.id.edTel);
        Direccion = findViewById(R.id.edDir);
        Genero = findViewById(R.id.edGe);
        Fecha = findViewById(R.id.edFecha);
        Nom =findViewById(R.id.txtNombre);
        Ape =findViewById(R.id.txtApellido);
        Tel =findViewById(R.id.txtTelefono);
        Dir =findViewById(R.id.txtDireccion);
        Ge =findViewById(R.id.txtGenero);
        Fe =findViewById(R.id.txtFecha);
    }
    public void Alta(View view){
        String n,a,nc,c,s,f;
        n=Nombre.getText().toString();
        a=Apellido.getText().toString();
        nc=Telefono.getText().toString();
        c=Direccion.getText().toString();
        f=Fecha.getText().toString();
        s=Genero.getText().toString();
        Nom.setVisibility(View.VISIBLE);
        Nom.setText(n);
        Ape.setVisibility(View.VISIBLE);
        Ape.setText(a);
        Tel.setVisibility(View.VISIBLE);
        Tel.setText(nc);
        Dir.setVisibility(View.VISIBLE);
        Dir.setText(c);
        Ge.setVisibility(View.VISIBLE);
        Ge.setText(s);
        Fe.setVisibility(View.VISIBLE);
        Fe.setText(f);
    }
    public void Limpiar(View view){
        Nom.setText("");
        Nombre.setText("");
        Ape.setText("");
        Apellido.setText("");
        Tel.setText("");
        Telefono.setText("");
        Dir.setText("");
        Direccion.setText("");
        Ge.setText("");
        Genero.setText("");
        Fe.setText("");
        Fecha.setText("");
    }
}