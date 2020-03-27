package com.example.comandas_automaticas.model;

import androidx.annotation.NonNull;

public class Cliente {
    private  final String nome;
    private  final String telefone;
    private  final String email;

    public Cliente(String nome, String telefone, String email) {
        this.nome= nome;
        this.telefone = telefone;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
