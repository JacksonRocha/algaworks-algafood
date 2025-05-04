package com.algaworks.algafoodapi.di.notification;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

    /**
     * Host do servidor de e-mail.
     */
    private String hostServidor;
    /**
     * Porta do servidor de e-mail.
     */
    private Integer portaServidor;

    public String hostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer portaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}

