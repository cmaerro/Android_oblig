package com.android.carina.tecnologoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button iniciarSesion;
    EditText user;
    EditText pass;

    String nombreUsuario;
    String passUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        iniciarSesion = (Button) findViewById(R.id.iniciarSesion);
        iniciarSesion.setOnClickListener(this);

        user = (EditText) findViewById(R.id.usuario);
        pass = (EditText) findViewById(R.id.pass);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iniciarSesion:
                nombreUsuario = user.getText().toString();
                passUsuario = pass.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }
}
