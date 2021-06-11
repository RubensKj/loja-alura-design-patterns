package com.rubenskj.loja.pedido;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(valorOrcamento, quantidadeItens);
        LocalDateTime actual = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, actual, orcamento);

        System.out.println("Salva pedido no banco de dados");
        System.out.println("Envia email com os dados do pedido.");
    }
}
