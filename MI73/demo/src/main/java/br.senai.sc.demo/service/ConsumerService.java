package br.senai.sc.demo.service;

import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerService {

    @KafkaListener(topics = "meu_topico", groupId = "my_group")
    public void listenGroupFoo(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
