package com.rubenskj.loja;

import com.rubenskj.loja.imposto.CalculadoraDeImpostos;
import com.rubenskj.loja.imposto.ICMS;
import com.rubenskj.loja.imposto.ISS;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS(new ISS())));
    }
}
