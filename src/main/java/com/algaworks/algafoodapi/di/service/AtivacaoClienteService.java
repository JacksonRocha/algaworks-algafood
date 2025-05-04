package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        //dizer para o container que o cliente foi ativado
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));


    }
}
