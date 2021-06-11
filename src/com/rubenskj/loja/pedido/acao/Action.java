package com.rubenskj.loja.pedido.acao;

import com.rubenskj.loja.pedido.Pedido;

public interface Action {

    void executar(Pedido pedido);
}
