package com.rubenskj.loja.orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public class OrcamentoProxy implements Orcavel {

    private BigDecimal valor;
    private Orcavel orcavel;

    public OrcamentoProxy(Orcavel orcavel) {
        this.orcavel = orcavel;
    }

    @Override
    public BigDecimal getValor() {
        if (Objects.isNull(this.valor)) {
            this.valor = orcavel.getValor();
        }

        return this.valor;
    }

    public Orcavel getOrcavel() {
        return orcavel;
    }
}
