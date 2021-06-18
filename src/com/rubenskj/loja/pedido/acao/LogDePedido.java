package com.rubenskj.loja.pedido.acao;

import com.rubenskj.loja.pedido.Pedido;

public class LogDePedido implements Action {
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado! " + pedido);
    }
}
