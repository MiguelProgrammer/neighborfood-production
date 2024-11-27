/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.adapter.gateways;

import br.com.techchallenge.fiap.neighborfood.core.domain.pedido.Pedido;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.order.entities.PedidoEntity;

public interface PedidoGateway {

    Pedido findById(Long id);
    Pedido update(PedidoEntity pedidoEntity);
}
