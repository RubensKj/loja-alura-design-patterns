package com.rubenskj.loja.pedido.acao;

import com.rubenskj.loja.pedido.Pedido;

public class SalvarPedidoNoBandoDeDados implements Action {

    public void executar(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados.");
    }
}
