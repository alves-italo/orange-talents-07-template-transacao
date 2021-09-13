package com.zupacademy.italo.transacoes.transacoes.detalhetransacoes;

import com.zupacademy.italo.transacoes.transacoes.Transacao;

import java.math.BigDecimal;

public class TransacaoResponse {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoResponse estabelecimento;
    private CartaoResponse cartao;

    public TransacaoResponse(Transacao transacao) {
        this.id = transacao.getNumero();
        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento());
        this.cartao = new CartaoResponse(transacao.getCartao());
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }
}
