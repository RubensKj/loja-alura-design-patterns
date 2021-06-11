package com.rubenskj.loja.orcamento.situacao;

import com.rubenskj.loja.exception.DomainException;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }
}
