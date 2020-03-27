package com.example.comandas_automaticas.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.comandas_automaticas.DAO.ClienteDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ListaComandasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClienteDAO dao = new ClienteDAO();

        Toast.makeText(this, "Bem Vindo", Toast.LENGTH_LONG).show();
        setTitle("Comandas");
        FloatingActionButton botaoNovoCliente = findViewById(R.id.activity_main_fab_novo_cliente);
        botaoNovoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaComandasActivity.this,
                        FormularioCliente.class));
            }
        });

        ListView listadeclientes = findViewById(R.id.activity_main_lista_de_clientes);
        listadeclientes.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.todos()));
    }

}



