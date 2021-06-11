package com.rubenskj.loja.desconto;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                new DescontoParaOrcamentoMaisDeCincoItens(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
