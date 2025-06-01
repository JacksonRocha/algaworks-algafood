package com.algaworks.algafoodapi.jpa;


import com.algaworks.algafoodapi.AlgafoodApiApplication;
import com.algaworks.algafoodapi.domain.model.Restaurante;
import com.algaworks.algafoodapi.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaRestauranteMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        List<Restaurante> todasRestaurante = restauranteRepository.listar();

        for (Restaurante restaurante : todasRestaurante) {
            System.out.printf("%d - %s\n", restaurante.getId(), restaurante.getNome() +
                    " - " + restaurante.getCozinha().getNome() +
                    " - " + restaurante.getTaxaFrete());
        }
    }
}
