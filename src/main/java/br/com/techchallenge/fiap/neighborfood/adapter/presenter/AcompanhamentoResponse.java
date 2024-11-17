/*
 * Copyright (c) 2024. MiguelProgrammer
 */

package br.com.techchallenge.fiap.neighborfood.adapter.presenter;

import br.com.techchallenge.fiap.neighborfood.core.domain.dto.AcompanhamentoResponseDTO;
import br.com.techchallenge.fiap.neighborfood.core.domain.enums.Status;

import java.math.BigDecimal;

public class AcompanhamentoResponse {

    private Status status;
    private BigDecimal total;

    public AcompanhamentoResponse() {
    }

    public AcompanhamentoResponse(Status status, BigDecimal total) {
        this.status = status;
        this.total = total;
    }

    public AcompanhamentoResponseDTO pedidoFromResponse() {
//        AcompanhamentoResponseDTO response = new AcompanhamentoResponseDTO();
//        PedidoRequestDTO requestDTO = new PedidoRequestDTO();
//        requestDTO.setIdCliente(this.pedidoRequest.getIdCliente());
//        List<ItemPedido> itemPedidoList = new ArrayList<>();
//        this.pedidoRequest.getItensPedido().forEach(item -> {
//
//            ItemPedido itemPedido = new ItemPedido();
//            itemPedido.setId(item.getId());
//            itemPedido.setIdPedido(item.getIdPedido());
//
//            ProdutoDTO dto = new ProdutoDTO();
//            dto.setId(item.getId());
//            dto.setNome(item.getNome());
//            dto.setDescricao(item.getDescricao());
//            dto.setPreco(item.getPreco());
//            dto.setCategoria(CategoriaDTO.valueOf(item.getCategoria().toString()));
//            dto.setImg(item.getImg());
//            itemPedido.setProduto(dto);
//            itemPedidoList.add(itemPedido);
//        });
//        requestDTO.setItensPedido(itemPedidoList);
//        response.setPedido(requestDTO);
//        response.getPedido().setId(this.pedidoRequest.getId());
//        response.setStatus(StatusPedidoDTO.valueOf(this.status.toString()));
//        response.setTotal(this.total);
        return null;//response;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}







