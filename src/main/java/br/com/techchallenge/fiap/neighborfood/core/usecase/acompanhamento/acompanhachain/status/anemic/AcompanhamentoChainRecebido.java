/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.acompanhachain.status.anemic;

import br.com.techchallenge.fiap.neighborfood.adapter.gateways.AcompanhamentoGateway;
import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;
import br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.acompanhachain.AcompanhamentoChain;

import static br.com.techchallenge.fiap.neighborfood.core.domain.Finals.MESSAGE_RECEBIDO;

public class AcompanhamentoChainRecebido implements AcompanhamentoChain {

    private AcompanhamentoGateway acompanhamentoGateway;

    public AcompanhamentoChainRecebido(AcompanhamentoGateway acompanhamentoGateway) {
        this.acompanhamentoGateway = acompanhamentoGateway;
    }

    public AcompanhamentoChainRecebido() {
    }

    @Override
    public String sms(Status status) {
        return status.equals(Status.RECEBIDO) ? MESSAGE_RECEBIDO :
                new AcompanhamentoChainPreparacao(acompanhamentoGateway).sms(status);
    }
}
