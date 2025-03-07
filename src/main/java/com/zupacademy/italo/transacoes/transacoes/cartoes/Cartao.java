package com.zupacademy.italo.transacoes.transacoes.cartoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String email;

    @Deprecated
    public Cartao() {
    }

    public Cartao(String numero, String email) {
        this.numero = numero;
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
}
