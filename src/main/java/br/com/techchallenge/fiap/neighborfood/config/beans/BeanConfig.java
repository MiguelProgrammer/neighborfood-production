package br.com.techchallenge.fiap.neighborfood.config.beans;
/*
 * Copyright (c) 2024. MiguelProgrammer
 */

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.AcompanhamentoGateway;
import br.com.techchallenge.fiap.neighborfood.adapter.gateways.PedidoGateway;
import br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.AcompanhamentoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public AcompanhamentoUseCase configBeanAcompanhamento(AcompanhamentoGateway acompanhamentoChain, PedidoGateway pedidoGateway) {
        return new AcompanhamentoUseCase(pedidoGateway, acompanhamentoChain);
    }
}
