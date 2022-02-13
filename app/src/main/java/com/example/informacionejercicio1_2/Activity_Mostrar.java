package com.example.informacionejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Mostrar extends AppCompatActivity {
    TextView amnombre,amapellido,amedad,amcorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        amnombre = (TextView) findViewById(R.id.amtxtnombre);
        amapellido = (TextView) findViewById(R.id.amtxtapellido);
        amedad = (TextView) findViewById(R.id.amtxtedad);
        amcorreo = (TextView) findViewById(R.id.amtxtcorreo);

        String nombre = getIntent().getStringExtra("nombres");
        String apellido = getIntent().getStringExtra("apellidos");
        String edad = getIntent().getStringExtra("edad");
        String correo = getIntent().getStringExtra("correo");

        amnombre.setText(nombre);
        amapellido.setText(apellido);
        amedad.setText(edad);
        amcorreo.setText(correo);
    }
}