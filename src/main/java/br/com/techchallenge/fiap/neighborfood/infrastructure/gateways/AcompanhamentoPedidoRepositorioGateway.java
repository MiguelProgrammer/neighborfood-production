/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.gateways;

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.AcompanhamentoGateway;
import br.com.techchallenge.fiap.neighborfood.adapter.presenter.AcompanhamentoResponse;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.AcompanhamentoResponseDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;
import br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.acompanhachain.status.anemic.AcompanhamentoChainRecebido;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.acompanhamento.AcompanhamentoRepository;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.order.PedidoRepository;
import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.order.entities.PedidoEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AcompanhamentoPedidoRepositorioGateway implements AcompanhamentoGateway {

    private AcompanhamentoRepository repository;
    private AcompanhamentoGateway acompanhamentoGateway;
    private PedidoRepository pedidoRepository;

    public AcompanhamentoPedidoRepositorioGateway(AcompanhamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AcompanhamentoResponseDTO getOrderStatus(Long idPedido) {
        Optional<PedidoEntity> pedido = pedidoRepository.findById(idPedido);
        AcompanhamentoResponse acompanhamentoResponse = new AcompanhamentoResponse();
        AcompanhamentoResponse acp = acompanhamentoResponse.pedidoEntityFromResponse(pedido.get());
        return acp.pedidoFromResponse();
    }


    @Override
    public String sms(Status status) {
        return new AcompanhamentoChainRecebido(acompanhamentoGateway).sms(status);
    }


    @Override
    public void fluxoStatusPedido(Long idPedido, Status status) {
//        Optional<PedidoEntity> pedido = pedidoRepository.findById(idPedido);
//        pedido.get().setStatus(status);
//        pedidoRepository.save(pedido.get());
    }


    @Override
    public void pedidoStatus(Long idPedido, Status Status) {
        //acompanhamentoUseCasePort.pedidoStatusExecute(idPedido, Status);
    }
}
