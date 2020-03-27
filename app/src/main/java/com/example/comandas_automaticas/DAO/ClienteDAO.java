package com.example.comandas_automaticas.DAO;

import com.example.comandas_automaticas.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private final static List<Cliente> clientes = new ArrayList<>();
    public void salva(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> todos(){
        return new ArrayList<>(clientes);
    }

}
