package com.rubenskj.loja.orcamento.situacao;

import com.rubenskj.loja.orcamento.Orcamento;

public class Reprovado extends Situacao {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
