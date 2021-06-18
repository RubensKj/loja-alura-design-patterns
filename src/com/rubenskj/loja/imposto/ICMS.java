package com.rubenskj.loja.imposto;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS() {
        super(null);
    }

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
