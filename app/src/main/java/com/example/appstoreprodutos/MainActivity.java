package com.example.appstoreprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmailUsuario, editTextSenhaUsuario;
    Button buttonAcessar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmailUsuario = findViewById(R.id.editTextEmailUsuario);
        editTextSenhaUsuario = findViewById(R.id.editTextSenhaUsuario);
        buttonAcessar = findViewById(R.id.buttonEnviar);

        buttonAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((editTextEmailUsuario.getText().toString().equals("admin@admin")) && (editTextSenhaUsuario.getText().toString().equals("admin"))) {
                    Intent cadastrar = new Intent(getApplicationContext(), CadastroActivity.class);
                    startActivity(cadastrar);
                }else {
                    Intent consultar = new Intent(getApplicationContext(), ConsultaActivity.class);
                    startActivity(consultar);
                }

            }
        });


    }
}