/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.acompanhamento;

import br.com.techchallenge.fiap.neighborfood.infrastructure.persistence.acompanhamento.entities.AcompanhamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcompanhamentoRepository extends JpaRepository<AcompanhamentoEntity, Long> {

}
