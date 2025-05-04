package com.algaworks.algafoodapi.listener;

import com.algaworks.algafoodapi.di.notification.NivelUrgencia;
import com.algaworks.algafoodapi.di.notification.Notificador;
import com.algaworks.algafoodapi.di.notification.TipoNotificador;
import com.algaworks.algafoodapi.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
