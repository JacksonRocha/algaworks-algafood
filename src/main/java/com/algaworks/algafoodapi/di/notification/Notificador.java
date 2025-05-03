package com.algaworks.algafoodapi.di.notification;

import com.algaworks.algafoodapi.di.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
