package com.zupacademy.italo.transacoes.transacoes;

import com.zupacademy.italo.transacoes.transacoes.cartoes.CartaoStream;
import com.zupacademy.italo.transacoes.transacoes.estabelecimentos.EstabelecimentoStream;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoStream {
    private String id;
    private BigDecimal valor;
    private EstabelecimentoStream estabelecimento;
    private CartaoStream cartao;

    private LocalDateTime efetivadaEm;

    @Deprecated
    public TransacaoStream() {
    }

    public TransacaoStream(String id, BigDecimal valor, EstabelecimentoStream estabelecimento, CartaoStream cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public Transacao toModel() {
        return new Transacao(this.id, this.valor, this.estabelecimento.toModel(), this.cartao.toModel(), this.efetivadaEm);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public EstabelecimentoStream getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(EstabelecimentoStream estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public CartaoStream getCartao() {
        return cartao;
    }

    public void setCartao(CartaoStream cartao) {
        this.cartao = cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public void setEfetivadaEm(LocalDateTime efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

    @Override
    public String toString() {
        return "TransacaoStream{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", estabelecimento=" + estabelecimento +
                ", cartao=" + cartao +
                ", efetivadaEm=" + efetivadaEm +
                '}';
    }
}
