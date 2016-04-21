package com.miguelcr.appguarderia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText usuario, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.editTextUsuario);
        pass = (EditText) findViewById(R.id.editTextPassword);
    }


    public void doLogin(View view) {

        String u = usuario.getText().toString();
        String p = pass.getText().toString();
        //TODO chequear si el login es correcto
        if(u.equals("1") && p.equals("1")) {
            // Login ok
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        } else {
            // Login incorrecto
            if(u.equals("")) {
                usuario.setError("Debe escribir un usuario");
            } else if(p.equals("")) {
                pass.setError("Debe escribir la contraseña");
            } else {
                Toast.makeText(this,"Has olvidado la contraseña, pero no olvides el nombre tu hijo",Toast.LENGTH_LONG).show();
            }
        }
    }
}
