package com.rubenskj.loja.imposto;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Imposto {

    private Imposto imposto;

    public Imposto(Imposto imposto) {
        this.imposto = imposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (Objects.nonNull(imposto)) {
            valorDoOutroImposto = imposto.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorDoOutroImposto);
    }
}
