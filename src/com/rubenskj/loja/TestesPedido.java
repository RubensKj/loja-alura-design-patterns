package com.rubenskj.loja;

import com.rubenskj.loja.pedido.GeraPedido;
import com.rubenskj.loja.pedido.GeraPedidoHandler;
import com.rubenskj.loja.pedido.acao.EnviarEmailPedido;
import com.rubenskj.loja.pedido.acao.LogDePedido;
import com.rubenskj.loja.pedido.acao.SalvarPedidoNoBandoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {

    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBandoDeDados(),
                        new EnviarEmailPedido(),
                        new LogDePedido()
                )
        );

        handler.execute(geraPedido);
    }
}
