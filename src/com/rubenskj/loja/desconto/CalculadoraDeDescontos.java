package com.rubenskj.loja.desconto;

import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                new DescontoParaOrcamentoMaisDeCincoItens(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
