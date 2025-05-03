package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.notification.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smpt.algamail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
