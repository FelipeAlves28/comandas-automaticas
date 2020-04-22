package com.example.comandas_automaticas.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.comandas_automaticas.DAO.ClienteDAO;
import com.example.comandas_automaticas.model.Cliente;

public class FormularioCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Comandas");
        setContentView(R.layout.activity_formulario_cliente);

        final ClienteDAO dao = new ClienteDAO();

        final EditText campoNome = findViewById(R.id.activity_formulario_nome_cliente);
        final EditText campoTelefone = findViewById(R.id.activity_formulario_telefone_cliente);
        final EditText campoEmail = findViewById(R.id.activity_formulario_email_cliente);

        Button botaoSalvar = findViewById(R.id.activity_formulario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Cliente clienteCriado = new Cliente(nome,telefone,email);
                    dao.salva(clienteCriado);
                    startActivity(new Intent(FormularioCliente.this, ListaComandasActivity.class));
//                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_app, menu);
        return true;
    }

}
