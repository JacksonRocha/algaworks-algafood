package com.algaworks.algafoodapi.di.notification;

import com.algaworks.algafoodapi.di.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
