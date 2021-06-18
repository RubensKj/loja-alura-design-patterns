package com.rubenskj.loja;

import com.rubenskj.loja.http.JavaHttpClient;
import com.rubenskj.loja.orcamento.ItemOrcamento;
import com.rubenskj.loja.orcamento.Orcamento;
import com.rubenskj.loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));

        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());

        registroOrcamento.registrar(orcamento);
    }
}
