package com.rubenskj.loja.orcamento;

import com.rubenskj.loja.exception.DomainException;
import com.rubenskj.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Nao e possivel registrar orcamento nao finalizado.");
        }

        String url = "http://api.extena/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        httpAdapter.post(url, dados);
    }
}
