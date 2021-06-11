package com.rubenskj.loja;

import com.rubenskj.loja.pedido.GeraPedido;
import com.rubenskj.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(/* dependencias */);
        handler.execute(geraPedido);
    }
}
