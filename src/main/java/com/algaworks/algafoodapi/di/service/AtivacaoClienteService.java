package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.model.Cliente;
import com.algaworks.algafoodapi.di.notification.NivelUrgencia;
import com.algaworks.algafoodapi.di.notification.Notificador;
import com.algaworks.algafoodapi.di.notification.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @TipoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    //    @PostConstruct
    public void init() {
        System.out.println("INIT AtivacaoClienteService");
    }

    //    @PreDestroy
    public void destroy() {
        System.out.println("DESTROYING AtivacaoClienteService");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
