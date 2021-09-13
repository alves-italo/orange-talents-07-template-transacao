package com.zupacademy.italo.transacoes.transacoes.cartoes;

public class CartaoStream {
    private String id;
    private String email;

    @Deprecated
    public CartaoStream() {
    }

    public Cartao toModel() {
        return new Cartao(this.id, this.email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CartaoStream{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
