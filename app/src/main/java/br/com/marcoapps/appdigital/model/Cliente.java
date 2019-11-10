package br.com.marcoapps.appdigital.model;

import java.io.Serializable;

public class Cliente {


    private String cpf;

    public Cliente() {
    }

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}