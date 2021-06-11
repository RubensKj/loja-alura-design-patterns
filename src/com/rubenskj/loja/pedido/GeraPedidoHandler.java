package com.rubenskj.loja.pedido;

import com.rubenskj.loja.orcamento.Orcamento;
import com.rubenskj.loja.pedido.acao.Action;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<Action> actions;

    public GeraPedidoHandler(List<Action> actions) {
        this.actions = actions;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        LocalDateTime actual = LocalDateTime.now();

        Pedido pedido = new Pedido(dados.getCliente(), actual, orcamento);

        actions.forEach(action -> action.executar(pedido));
    }
}
