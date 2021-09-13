package com.zupacademy.italo.transacoes.transacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransacaoListener {
    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}", containerFactory = "kafkaListenerContainerFactory")
    @Transactional
    public void ouvir(TransacaoStream transacaoStream) {
        Transacao transacao = transacaoStream.toModel();
        transacaoRepository.save(transacao);
    }

}

