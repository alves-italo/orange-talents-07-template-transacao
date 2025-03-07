package com.zupacademy.italo.transacoes.transacoes.estabelecimentos;

public class EstabelecimentoStream {
    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoStream() {
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome, this.cidade, this.endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
