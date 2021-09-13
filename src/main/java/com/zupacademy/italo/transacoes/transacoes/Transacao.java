package com.zupacademy.italo.transacoes.transacoes;

import com.zupacademy.italo.transacoes.transacoes.cartoes.Cartao;
import com.zupacademy.italo.transacoes.transacoes.estabelecimentos.Estabelecimento;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private BigDecimal valor;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Estabelecimento estabelecimento;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Cartao cartao;

    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao() {
    }

    public Transacao(String numero, BigDecimal valor, Estabelecimento estabelecimento, Cartao cartao, LocalDateTime efetivadaEm) {
        this.numero = numero;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
