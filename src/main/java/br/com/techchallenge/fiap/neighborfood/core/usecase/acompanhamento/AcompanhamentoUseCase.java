/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento;

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.AcompanhamentoGateway;
import br.com.techchallenge.fiap.neighborfood.config.exceptions.PedidoException;
import br.com.techchallenge.fiap.neighborfood.core.domain.dto.AcompanhamentoResponseDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;
import br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.acompanhachain.status.anemic.AcompanhamentoChainRecebido;
import org.springframework.stereotype.Component;

@Component
public class AcompanhamentoUseCase {

    private AcompanhamentoGateway acompanhamentoGateway;

    public AcompanhamentoUseCase(AcompanhamentoGateway acompanhamentoGateway) {
        this.acompanhamentoGateway = acompanhamentoGateway;
    }

    public AcompanhamentoResponseDTO getOrderStatus(Long idPedido) {

        //Pedido pedido;
        try {
            //pedido = pedidoGateway.findById(idPedido);

//            if (pedido.getStatus().equals(Status.EM_PREPARACAO)) {
//                this.pedidoStatus(idPedido, Status.PRONTO);
//                pedido.setStatus(Status.PRONTO);
//            } else if (pedido.getStatus().equals(Status.PRONTO)) {
//                this.fluxoStatusPedido(idPedido, Status.FINALIZADO);
//                pedido.setStatus(Status.FINALIZADO);
//            }
        } catch (Exception ex) {
            throw new PedidoException("Pedido não encontrado!");
        }
        return null;//pedidoGateway.pedido(pedido);
    }

    public String smsExecute(Status status) {
        return new AcompanhamentoChainRecebido(acompanhamentoGateway).sms(status);
    }


}
