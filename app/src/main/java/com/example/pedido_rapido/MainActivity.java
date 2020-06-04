package com.example.pedido_rapido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText tUsuario, tSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tUsuario = (EditText) findViewById(R.id.editTextUsuario);
        tSenha = (EditText) findViewById(R.id.editTextSenha);
        login = (Button) findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tUsuario.getText().toString().equals("Usuario")
                        && tSenha.getText().toString().equals("123")) {
                    alerta("Login efetuado com sucesso");
                    Intent ir = new Intent(getApplicationContext(), PedidoActivity.class);
                    startActivity(ir);
                } else
                    alerta("login ou senha incorreta");
            };


        });

    }

    protected void alerta(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
