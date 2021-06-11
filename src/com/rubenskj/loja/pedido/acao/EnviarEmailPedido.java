package com.rubenskj.loja.pedido.acao;

import com.rubenskj.loja.pedido.Pedido;

public class EnviarEmailPedido implements Action {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido.");
    }
}
