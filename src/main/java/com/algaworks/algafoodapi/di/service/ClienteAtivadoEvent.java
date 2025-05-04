package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Cliente;

public class ClienteAtivadoEvent {

    private final Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
