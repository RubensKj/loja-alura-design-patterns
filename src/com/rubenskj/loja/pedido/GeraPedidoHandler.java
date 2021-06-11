package com.rubenskj.loja.pedido;

import com.rubenskj.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime actual = LocalDateTime.now();

        Pedido pedido = new Pedido(dados.getCliente(), actual, orcamento);

        System.out.println("Salva pedido no banco de dados");
        System.out.println("Envia email com os dados do pedido.");
    }
}
