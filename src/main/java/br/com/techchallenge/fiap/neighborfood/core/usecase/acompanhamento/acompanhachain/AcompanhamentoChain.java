/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.core.usecase.acompanhamento.acompanhachain;


import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;

public interface  AcompanhamentoChain {

    String sms(Status status);
}
