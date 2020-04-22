package com.example.comandas_automaticas.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.comandas_automaticas.DAO.ClienteDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ListaComandasActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lista_comandas);
//
//        ClienteDAO dao = new ClienteDAO();
//
//        Toast.makeText(this, "Bem Vindo", Toast.LENGTH_LONG).show();
//        setTitle("Comandas");
//        FloatingActionButton botaoNovoCliente = findViewById(R.id.activity_main_fab_novo_cliente);
//        botaoNovoCliente.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(ListaComandasActivity.this,
//                        FormularioCliente.class));
//            }
//        });
//
//        ListView listadeclientes = findViewById(R.id.activity_main_lista_de_clientes);
//        listadeclientes.setAdapter(new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                dao.todos()));
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu_app, menu);
//        return true;
//    }

    @Override
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater menuInflater = getMenuInflater();
    menuInflater.inflate(R.menu.menu_app, menu);
    return true;
}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(getApplicationContext(), "Cardápio...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), Cardapio.class);
                startActivity(intent);
                return true;
            case R.id.config:
                Toast.makeText(getApplicationContext(), "Configurações Gerais...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.sobre:
                Toast.makeText(getApplicationContext(), "Configurações do Usuario...", Toast.LENGTH_LONG).show();
                perfilUsu();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

    }

    private void perfilUsu(){
        startActivity(new Intent(ListaComandasActivity.this,PerfilUsuario.class));
    }
}



