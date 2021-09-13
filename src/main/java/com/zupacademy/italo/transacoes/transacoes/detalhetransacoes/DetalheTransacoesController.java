package com.zupacademy.italo.transacoes.transacoes.detalhetransacoes;

import com.zupacademy.italo.transacoes.transacoes.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DetalheTransacoesController {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/cartoes/{numeroCartao}/transacoes")
    public List<TransacaoResponse> mostrarTransacoes(@PathVariable("numeroCartao") String numeroCartao) {

        List<TransacaoResponse> transacoes = transacaoRepository.findTop10ByCartaoNumeroOrderByEfetivadaEmDesc(numeroCartao)
                .stream()
                .map(TransacaoResponse::new)
                .collect(Collectors.toList());

        if(transacoes.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return transacoes;
    }

}
