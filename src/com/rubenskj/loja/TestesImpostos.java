package com.rubenskj.loja;

import com.rubenskj.loja.imposto.CalculadoraDeImpostos;
import com.rubenskj.loja.imposto.ISS;
import com.rubenskj.loja.orcamento.ItemOrcamento;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("33.3333333333")));
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("33.3333333333")));
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("33.3333333333")));

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, new ISS());

        System.out.println(imposto);
    }
}
