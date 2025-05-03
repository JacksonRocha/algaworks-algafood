package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Cliente;
import com.algaworks.algafoodapi.di.notification.Notificador;
import com.algaworks.algafoodapi.di.notification.NotificadorEmail;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(NotificadorEmail notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
