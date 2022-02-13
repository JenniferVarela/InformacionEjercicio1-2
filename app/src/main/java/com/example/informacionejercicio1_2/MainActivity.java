package com.example.informacionejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.informacionejercicio1_2.Configuraciones.Persona;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre,txtapellido,txtedad,txtcorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtNombres);
        txtapellido = (EditText) findViewById(R.id.txtApellidos);
        txtedad = (EditText) findViewById(R.id.txtEdad);
        txtcorreo = (EditText) findViewById(R.id.txtCorreo);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObtenerInformacion();
                Toast.makeText(getApplicationContext(),"Informacion enviada..!!",Toast.LENGTH_LONG).show();
            }
        });

    }

    private void ObtenerInformacion() {
        Persona persona = null;
        persona = new Persona();

        Intent intent = new Intent(getApplicationContext(),Activity_Mostrar.class);

        persona.setNombres(txtnombre.getText().toString());
        persona.setApellidos(txtapellido.getText().toString());
        persona.setEdad(txtedad.getText().toString());
        persona.setCorreo(txtcorreo.getText().toString());

        intent.putExtra("nombres",persona.getNombres());
        intent.putExtra("apellidos",persona.getApellidos());
        intent.putExtra("edad",persona.getEdad()+"");
        intent.putExtra("correo",persona.getCorreo());

        startActivity(intent);
    }


}