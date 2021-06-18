package com.rubenskj.loja.imposto;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS() {
        super(null);
    }

    public ISS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
