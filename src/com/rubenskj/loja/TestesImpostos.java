package com.rubenskj.loja;

import com.rubenskj.loja.imposto.CalculadoraDeImpostos;
import com.rubenskj.loja.imposto.TipoImposto;
import com.rubenskj.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        BigDecimal imposto = calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS);

        System.out.println(imposto);
    }
}
