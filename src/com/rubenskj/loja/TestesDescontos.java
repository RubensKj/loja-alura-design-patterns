package com.rubenskj.loja;

import com.rubenskj.loja.desconto.CalculadoraDeDescontos;
import com.rubenskj.loja.orcamento.ItemOrcamento;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento orcamentoMaiorValor = new Orcamento();
        orcamentoMaiorValor.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        BigDecimal desconto = calculadoraDeDescontos.calcular(orcamento);
        BigDecimal descontoMaiorValor = calculadoraDeDescontos.calcular(orcamentoMaiorValor);

        System.out.println(desconto);
        System.out.println(descontoMaiorValor);
    }
}
