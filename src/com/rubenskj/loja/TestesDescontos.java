package com.rubenskj.loja;

import com.rubenskj.loja.desconto.CalculadoraDeDescontos;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("200.0"), 6);
        Orcamento orcamentoMaiorValor = new Orcamento(new BigDecimal("1000.0"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        BigDecimal descontoMaiorValor = calculadoraDeDescontos.calcular(orcamentoMaiorValor);

        System.out.println(desconto);
        System.out.println(descontoMaiorValor);
    }
}
