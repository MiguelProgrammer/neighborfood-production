/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.adapter.gateways;

import br.com.techchallenge.fiap.neighborfood.core.domain.dto.AcompanhamentoResponseDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;

public interface AcompanhamentoGateway {

    AcompanhamentoResponseDTO getOrderStatus(Long idPedido);
    void fluxoStatusPedido(Long idPedido, Status Status);
}
