package com.algaworks.algafoodapi.di.notification;

import com.algaworks.algafoodapi.di.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties properties;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host" + properties.hostServidor());
        System.out.println("Porta" + properties.portaServidor());

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
