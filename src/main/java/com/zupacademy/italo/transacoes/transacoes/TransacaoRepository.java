package com.zupacademy.italo.transacoes.transacoes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findTop10ByCartaoNumeroOrderByEfetivadaEmDesc(String numeroCartao);
}
