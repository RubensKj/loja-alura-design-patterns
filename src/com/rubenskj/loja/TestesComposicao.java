package com.rubenskj.loja;

import com.rubenskj.loja.orcamento.ItemOrcamento;
import com.rubenskj.loja.orcamento.Orcamento;
import com.rubenskj.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novoOrcamento = new Orcamento();
        novoOrcamento.adicionarItem(antigo);
        novoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        OrcamentoProxy proxy = new OrcamentoProxy(novoOrcamento);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
